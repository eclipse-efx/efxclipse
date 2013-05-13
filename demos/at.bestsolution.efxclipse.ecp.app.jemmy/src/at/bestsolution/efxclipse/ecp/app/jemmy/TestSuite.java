package at.bestsolution.efxclipse.ecp.app.jemmy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import at.bestsolution.efxclipse.runtime.jemmy.OSGiJemmyBootstrapTestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses({ SampleTestCase.class })
public class TestSuite extends OSGiJemmyBootstrapTestCase {

}
