package updatepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import registerpackage.RegisterClass;

public class UpdateClass {
	public void update() throws IOException
	{
		String email;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	RegisterClass rg=new RegisterClass();
	
	System.out.println("ENTER YOUR NEW EMAIL ID emai id");
	 email = br.readLine();
	 rg.setEmail(email);
	 System.out.println("YOUR NEW EMAIL ID " + rg.getEmail());
	

	}
}
