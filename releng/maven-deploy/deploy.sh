/shared/common/apache-maven-3.0.5/bin/mvn deploy:deploy-file -DgroupId=org.eclipse.fx \
  -DartifactId=org.eclipse.fx.ui.panes \
  -Dversion=1.0.0-SNAPSHOT \
  -Dpackaging=jar \
  -Dfile=bundles/runtime/org.eclipse.fx.ui.panes/target/org.eclipse.fx.ui.panes-1.0.0-SNAPSHOT.jar \
  -DrepositoryId=repo.eclipse.org \
  -Durl=https://repo.eclipse.org/content/repositories/efxclipse-snapshots/