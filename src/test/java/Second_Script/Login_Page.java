package Second_Script;

import org.testng.annotations.Test;

public class Login_Page 
{
  @Test
  public void ValidPassword()
  {
	  System.out.println("Password Should be Valid");
  }
  
  @Test
  public void ResetPassword()
  {
	  System.out.println("otp should be sent on mobile no to reset password");
  }
  
  @Test
  public void username()
  {
	  System.out.println("Username should be mobile no. or id");
  }
}
