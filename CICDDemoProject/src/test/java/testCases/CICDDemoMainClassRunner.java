package testCases;

import org.testng.TestNG;


public class CICDDemoMainClassRunner {
	static TestNG testNg;
	public static void main(String[] args) {
		testNg = new TestNG();		
		testNg.setTestClasses(new Class[] {DemoTest.class});
		testNg.run();
	}

}
