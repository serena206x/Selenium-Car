import junit.framework.Test;
import junit.framework.TestSuite;

public class Test {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(CSLoginTest.class);
		suite.addTestSuite(CSAddBillsTest.class);
		suite.addTestSuite(CSAssertBillsTest.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
