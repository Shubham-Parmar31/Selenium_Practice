package pom;

import java.io.IOException;

public class CreateManager extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib fb = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		UsersPage up = new UsersPage(driver);
		
		//Login
		lp.validLogin(fb.readPropertyData(Prop_Path, "username"),fb.readPropertyData(Prop_Path, "password"));
		//Click on user module
		hp.usersModule();
        // Create a user
		up.createUser(fb.readExceldata(Excel_Path, "managercreds", 1,0),fb.readExceldata(Excel_Path, "managercreds", 1,1),fb.readExceldata(Excel_Path, "managercreds", 1,2),fb.readExceldata(Excel_Path, "managercreds", 1,3));
		
		//Delete the created user
		up.deleteUser();
		bt.tearDown();
	}
}
