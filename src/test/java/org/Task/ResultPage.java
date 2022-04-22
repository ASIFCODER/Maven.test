package org.Task;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({GurulogInPage.class,fbLogInpage.class})
public class ResultPage {
	public static void main(String[] args) {
		Result results = JUnitCore.runClasses(GurulogInPage.class,fbLogInpage.class);
		 int runCount = results.getRunCount();
		 int ignoreCount = results.getIgnoreCount();
		 long runTime = results.getRunTime();
		 int failureCount = results.getFailureCount();
		 List<Failure> failures = results.getFailures();
		 
		 System.out.println("Runcount :"+runCount);
		 System.out.println("Ignore count :"+ignoreCount);
		 System.out.println("Run Time :"+runTime);
		 System.out.println("Failure count :"+failureCount);
		 System.out.println("Failure List :"+failures);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
