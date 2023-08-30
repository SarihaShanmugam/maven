package org.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;


//@RunWith(Suite.class)
//@SuiteClasses({JunitDemo.class,Junit.class})

public class Runner {
	@Test
	public void jRun() {
		
Result r = JUnitCore.runClasses(JunitDemo.class,Junit.class);
System.out.println("pass case "+r.getRunCount());
System.out.println("fail case "+r.getFailureCount());
System.out.println("ignore case "+r.getIgnoreCount());
System.out.println("run time "+r.getRunCount());

List<Failure> failures = r.getFailures();
for (Failure f : failures) {
	System.out.println(f);
	
}
}
}