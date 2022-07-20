package sampleclasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log_Inpages 
{
@Test
	
	public void practice4Test()
	{
		Reporter.log("Tyss-->test4",true);
		String url = System.getProperty("URL");
		System.out.println("url");
		String pwd = System.getProperty("PASSWORD");
		System.out.println("pwd");
		String hii = System.getProperty("hii");
		System.out.println("good evening");
		System.out.println("good Anuprita Raut123");
		System.out.println("good morning");
		System.out.println("success");  
	}
@Test

public void practice1Test()
{
	System.out.println("good evening");
	System.out.println("good morning");
	System.out.println("Amit here"); 
}
}