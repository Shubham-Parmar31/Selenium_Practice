package pom;

import java.io.IOException;

public class InvaliLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib fb = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		int rc = fb.getLastRowCount(Excel_Path, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
		lp.validLogin(fb.readExceldata(Excel_Path, "invalidcreds",rc,0), fb.readExceldata(Excel_Path, "invalidcreds",rc,1));
		}
		
		bt.tearDown();
	}
}
