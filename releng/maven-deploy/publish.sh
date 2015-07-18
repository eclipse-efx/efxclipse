#!/bin/sh

MAVEN=/Users/tomschindl/Applications/apache-maven-3.2.5/bin/mvn
ASSEMBLY_ZIP=/tmp/site_assembly.zip
ASSEMBLY_ROOT=/tmp/site_assembly/plugins
REPO_ID=sonatype
REPO_URL=https://oss.sonatype.org/service/local/staging/deploy/maven2/

## ----------------------------------------------------------------
## org.eclipse.jdt.annotation
## ----------------------------------------------------------------

POM=/Users/tomschindl/git/efxclipse/releng/maven-deploy/platform/jdt_annotation.xml
$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.jdt.annotation_2.0.100.v20150311-1658.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL

## FIXME Needs to be in target
$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=/Users/tomschindl/Applications/Eclipse/Eclipse.app/Contents/Eclipse/plugins/org.eclipse.jdt.annotation.source_2.0.100.v20150311-1658.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=sources

rm -rf /tmp/javadoc
mkdir /tmp/javadoc
javadoc -d /tmp/javadoc -sourcepath /Users/tomschindl/Applications/Eclipse/Eclipse.app/Contents/Eclipse/plugins/org.eclipse.jdt.annotation.source_2.0.100.v20150311-1658.jar -subpackages org.eclipse.jdt.annotation
cd /tmp/javadoc
zip -r javadoc.jar *

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=/Users/tomschindl/git/efxclipse/releng/maven-deploy/platform/jdt_annotation.xml \
	-Dfile=/tmp/javadoc/javadoc.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=javadoc

cd -


## ----------------------------------------------------------------
## org.eclipse.fx.core
## ----------------------------------------------------------------

POM=/Users/tomschindl/git/efxclipse/releng/maven-deploy/efxclipse/core.xml
$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.fx.core_2.0.0.201506240602.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=/Users/tomschindl/git/efxclipse/releng/maven-deploy/efxclipse/core.xml \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.fx.core.source_2.0.0.201506240602.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=sources

rm -rf /tmp/javadoc
mkdir /tmp/javadoc
javadoc -d /tmp/javadoc -sourcepath $ASSEMBLY_ROOT/org.eclipse.fx.core.source_2.0.0.201506240602.jar -subpackages org.eclipse.fx.core
cd /tmp/javadoc
zip -r javadoc.jar *

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=/Users/tomschindl/git/efxclipse/releng/maven-deploy/efxclipse/core.xml \
	-Dfile=/tmp/javadoc/javadoc.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=javadoc

cd -


## ----------------------------------------------------------------
## org.eclipse.fx.ui.panes
## ----------------------------------------------------------------

POM=/Users/tomschindl/git/efxclipse/releng/maven-deploy/efxclipse/panes.xml
$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.fx.ui.panes_2.0.0.201506240602.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.fx.ui.panes.source_2.0.0.201506240602.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=sources

rm -rf /tmp/javadoc
mkdir /tmp/javadoc
javadoc -d /tmp/javadoc -sourcepath $ASSEMBLY_ROOT/org.eclipse.fx.ui.panes.source_2.0.0.201506240602.jar -subpackages org.eclipse.fx.ui.panes
cd /tmp/javadoc
zip -r javadoc.jar *

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=/tmp/javadoc/javadoc.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=javadoc

cd -

## ----------------------------------------------------------------
## org.eclipse.fx.ui.animation
## ----------------------------------------------------------------

POM=/Users/tomschindl/git/efxclipse/releng/maven-deploy/efxclipse/animation.xml
$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.fx.ui.animation_2.0.0.201506240602.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.fx.ui.animation.source_2.0.0.201506240602.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=sources

rm -rf /tmp/javadoc
mkdir /tmp/javadoc
javadoc -d /tmp/javadoc -sourcepath $ASSEMBLY_ROOT/org.eclipse.fx.ui.animation.source_2.0.0.201506240602.jar -subpackages org.eclipse.fx.ui.animation
cd /tmp/javadoc
zip -r javadoc.jar *

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=/tmp/javadoc/javadoc.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=javadoc

cd -


## ----------------------------------------------------------------
## org.eclipse.fx.ui.controls
## ----------------------------------------------------------------

POM=/Users/tomschindl/git/efxclipse/releng/maven-deploy/efxclipse/controls.xml
$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.fx.ui.controls_2.0.0.201506240602.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/org.eclipse.fx.ui.controls.source_2.0.0.201506240602.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=sources

rm -rf /tmp/javadoc
mkdir /tmp/javadoc
javadoc -d /tmp/javadoc -sourcepath $ASSEMBLY_ROOT/org.eclipse.fx.ui.controls.source_2.0.0.201506240602.jar -subpackages org.eclipse.fx.ui.controls
cd /tmp/javadoc
zip -r javadoc.jar *

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=/tmp/javadoc/javadoc.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=javadoc

cd -
