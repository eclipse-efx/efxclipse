package org.eclipse.fx.ide.gradient.app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.fx.ide.gradient.app.impl.LinearGradientDetailTab;
import org.eclipse.fx.ide.gradient.app.impl.RadialGradientDetailTab;
import org.eclipse.fx.ide.gradient.app.util.GradientConverter;
import org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod;
import org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxStop;
import org.eclipse.fx.ide.gradient.model.gradient.GradientFactory;
import org.eclipse.fx.osgi.util.AbstractJFXApplication;

public class MainApplication extends AbstractJFXApplication {

	protected void jfxStart(IApplicationContext applicationContext,
			Application jfxApplication, Stage primaryStage) {
		primaryStage.setTitle("Gradient Editor");

		ComposedAdapterFactory f = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		EditingDomain editingDomain = new AdapterFactoryEditingDomain(f,
				new BasicCommandStack());

		FxLinearGradient gLin = GradientFactory.eINSTANCE
				.createFxLinearGradient();
		FxStop s1 = GradientFactory.eINSTANCE.createFxStop();
		s1.setOffset(0.22);
		s1.setColor(GradientConverter.convertRgbColor(new Color(1.0, 0.0, 0.0,
				0.5)));
		gLin.getStops().add(s1);
		FxStop s2 = GradientFactory.eINSTANCE.createFxStop();
		s2.setOffset(0.33);
		s2.setColor(GradientConverter.convertRgbColor(new Color(0.0, 1.0, 0.0,
				0.5)));
		gLin.getStops().add(s2);
		FxStop s3 = GradientFactory.eINSTANCE.createFxStop();
		s3.setOffset(0.44);
		s3.setColor(GradientConverter.convertRgbColor(new Color(0.0, 0.0, 1.0,
				0.5)));
		gLin.getStops().add(s3);

		gLin.setStartX(0.2);
		gLin.setEndX(0.8);
		gLin.setStartY(0.2);
		gLin.setEndY(0.8);
		gLin.setCycleMethod(FxCycleMethod.REFLECT);
		gLin.setProportional(true);

		FxRadialGradient gRad = GradientFactory.eINSTANCE
				.createFxRadialGradient();
		gRad.getStops().add(EcoreUtil.copy(s1));

		// TODO OSGI

		GridPane root = new GridPane();

		TabPane tabPane = new TabPane();
		root.add(tabPane, 0, 0);
		LinearGradientDetailTab linearDetail = new LinearGradientDetailTab();
		linearDetail.initUI();
		tabPane.getTabs().add(linearDetail);
		RadialGradientDetailTab radialDetail = new RadialGradientDetailTab();
		radialDetail.initUI();
		tabPane.getTabs().add(radialDetail);

		linearDetail.bind(editingDomain, gLin);
		radialDetail.bind(editingDomain, gRad);

		GridPane buttons = new GridPane();
		Button bApply = new Button();
		bApply.setText("Apply");
		bApply.setMinWidth(0.3);
		buttons.add(bApply, 1, 0);

		bApply.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				try {
					primaryStage.close();
					jfxApplication.stop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Button bCancel = new Button();
		bCancel.setText("Cancel");
		bCancel.setMinWidth(0.3);
		buttons.add(bCancel, 0, 0);
		bCancel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				try {
					primaryStage.close();
					jfxApplication.stop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		root.add(buttons, 0, 1, 2, 1);

		primaryStage.setScene(new Scene(root, 600, 350));
		primaryStage.show();
	}
}
