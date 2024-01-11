package First_Script;

import org.testng.annotations.Test;

public class Regestration_Page 
{
  @Test
  public void Valid_Name() 
  {
	  System.out.println("Name Should be in Alfabets");
  }
  
  @Test
  public void ValidEmailId()
  {
	  System.out.println("Email ID should be Valid");
  }
  
  @Test
  public void ValidMobileNo()
  {
	  System.out.println("Mobile No should contain Contry Code");
  }
}
