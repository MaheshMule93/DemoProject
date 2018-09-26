package com.mindtree.main;



import java.io.IOException;
import java.util.List;

import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.support.SoapUIException;

@Test
public class MainClass {
	
	public void TestMain() throws XmlException, IOException, SoapUIException
	{
		WsdlProject project= new WsdlProject("C:\\Users\\m1030569\\Desktop\\Test.xml");
		
		List<TestSuite> suite = project.getTestSuiteList();
		
		for (TestSuite ts : suite) {
			
				List<TestCase> testcase = ts.getTestCaseList();
				for (TestCase tc: testcase){
				TestRunner runner = tc.run(new PropertiesMap(), false);
				//assertEquals(TestRunner.Status.FINISHED, runner.getStatus());
			}}
	}

}
