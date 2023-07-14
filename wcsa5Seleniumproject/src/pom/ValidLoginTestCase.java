package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		// Creating object of Flib
		Flib fb = new Flib();
		
		// Creating object of LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(fb.readPropertyData(Prop_Path, "username"),fb.readPropertyData(Prop_Path, "password"));
	
		HomePage hp = new HomePage(driver);
		hp.logoutButton();
		
		bt.tearDown();
	}
}
