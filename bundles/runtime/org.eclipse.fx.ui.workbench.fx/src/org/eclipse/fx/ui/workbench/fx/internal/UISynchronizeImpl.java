/*******************************************************************************
 * Copyright (c) 2014 EM-SOFTWARE and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Keimel <c.keimel@emsw.de> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ui.workbench.fx.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

import javax.inject.Inject;

import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.core.log.Logger.Level;
import org.eclipse.fx.ui.services.sync.UISynchronize;

/**
 * Implementation of the UISynchronize service for JavaFX
 */
public class UISynchronizeImpl extends org.eclipse.e4.ui.di.UISynchronize implements UISynchronize {
	
	@Inject
	@Log
	Logger logger;
	
	@Override
	public <V> V syncExec(final Callable<V> callable, V defaultValue) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			try {
				return callable.call();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		} else {
			RunnableFuture<V> task = new FutureTask<V>(callable);
			javafx.application.Platform.runLater(task);
			try {
				return task.get();
			} catch (InterruptedException | ExecutionException e) {
				this.logger.log(Level.ERROR, "Unable to wait until the task is completed", e); //$NON-NLS-1$
			} finally {
				task.cancel(true);
			}
		}
		return defaultValue;
	}

	@Override
	public void syncExec(final Runnable runnable) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			runnable.run();
		} else {
			RunnableFuture<?> task = new FutureTask<Void>(runnable, null);
			javafx.application.Platform.runLater(task);
			try {
				task.get(); // wait for task to complete
			} catch (InterruptedException | ExecutionException e) {
				this.logger.log(Level.ERROR, "Unable to wait until the task is completed", e); //$NON-NLS-1$
			} finally {
				task.cancel(true);
			}
		}
	}
	
	@Override
	public <V> Future<V> asyncExec(final Callable<V> callable) {
		RunnableFuture<V> task = new FutureTask<V>(callable);
		javafx.application.Platform.runLater(task);
		return task;
	}
	
	@Override
	public void asyncExec(Runnable runnable) {
		javafx.application.Platform.runLater(runnable);
	}
	
}

