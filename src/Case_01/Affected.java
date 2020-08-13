package Case_01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Affected 
{
   @Test()
   public void test01()
   {
	   Reporter.log("hello",true);
	   
	   Reporter.log("hi",true);
   }
	 @Test()
   public void test01()
   {
	   Reporter.log("hello",true);
	   
	   Reporter.log("hello",true);
   }
	 @Test()
   public void test01()
   {
	   Reporter.log("hi",true);
	   
	   Reporter.log("hi",true);
   }
}
