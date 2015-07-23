package org.eclipse.fx.code.editor.ldef.app;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fx.code.editor.ldef.LDefStandaloneSetup;
import org.eclipse.fx.code.editor.ldef.generator.LDefGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

@Component(properties = "main.thread=true")
public class Main implements Runnable {
	String[] args;

	public void run() {
		Injector injector = new LDefStandaloneSetup().createInjectorAndDoEMFRegistration();
		GeneratorHelper generatorHelper = injector.getInstance(GeneratorHelper.class);

		String definitionFile = "/Users/tomschindl/Documents/e-workspaces/codesample/at.bestsolution.sample.code/src/main/java/at/bestsolution/sample/code/dart.ldef";
		String outDir = "/Users/tomschindl/Documents/e-workspaces/codesample/at.bestsolution.sample.code/src/main/java";

		if( args.length > 0 ) {
			definitionFile = args[0];
		}

		if( args.length > 1 ) {
			outDir = args[1];
		}

		generatorHelper.generate(definitionFile,outDir);
	}

	@Reference(target = "(launcher.arguments=*)")
	void setArgs(Object service, Map<String, Object> props) {
		this.args = (String[]) props.get("launcher.arguments");
	}

	static class GeneratorHelper {
		@Inject
		private Provider<ResourceSet> resourceSetProvider;

		@Inject
		private LDefGenerator generator;

		public void generate(String ldefFile, String outDir) {
			Resource resource = resourceSetProvider.get().getResource(URI.createFileURI(ldefFile), true);
			Path root = Paths.get(outDir);

			generator.doGenerate(resource, new IFileSystemAccess() {

				@Override
				public void generateFile(String fileName, CharSequence contents) {
					generateFile(fileName, null, contents);
				}

				@Override
				public void generateFile(String fileName, String outputConfigurationName, CharSequence contents) {
					Path path = root.resolve(fileName);
					if( ! Files.exists(path.getParent()) ) {
						try {
							Files.createDirectories(path.getParent());
						} catch (IOException e) {
							throw new RuntimeException(e);
						}
					}

					try ( OutputStream stream = Files.newOutputStream(path); ) {
						stream.write(contents.toString().getBytes());
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}

				@Override
				public void deleteFile(String fileName) {
					Path path = root.resolve(fileName);
					try {
						Files.deleteIfExists(path);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}

			});
		}
	}
}
