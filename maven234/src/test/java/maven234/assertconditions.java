package maven234;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class assertconditions {
  @Test(priority=0)
  public void test1() {
	  AssertJUnit.assertEquals("pooja","sharmila");
	  System.out.println("this is first case");
  }
  @Test(priority=1,dependsOnMethods="test1")
  public void test2() {
	  
	  System.out.println("this is second case");
  }
  @Test(priority=2,dependsOnMethods="test1",alwaysRun=true)
  public void test3() {
	  
	  System.out.println("this is third case");
  }
  @Test(priority=3,dependsOnMethods="test1",alwaysRun=false)
  public void test4() {
	  
	  System.out.println("this is fourth case");
  }
  @Test(priority=4)
  public void test5() {
	  
	  System.out.println("this is first case");
  }

}
