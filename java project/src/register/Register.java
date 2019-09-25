package register;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import registerpackage.RegisterClass;

public class Register {
	 String name;
	 String address;
	String contact;
    String email;
  String proof;
	 String proofID;
     
	
	BufferedReader br=new  BufferedReader (new InputStreamReader(System.in));
	RegisterClass rc= new RegisterClass();
	
	public void register() throws IOException 
	{
		System.out.println("............REGISTRETION................");
		System.out.println("Enter your name");
		name=br.readLine();
		System.out.println("Enter your address");
		address=br.readLine();
		System.out.println("contact");
		contact=br.readLine();
		System.out.println("emai id");
		email=br.readLine();
		System.out.println("proof type");
		proof=br.readLine();
		System.out.println("proof id");
	    proofID=br.readLine();	
		
		rc.setName(name);
		rc.setAddress(address);
		rc.setContact(contact);
		rc.setEmail(email);
		rc.setProof(proof);
		rc.setProofID(proofID);
		
	}
	public void register1()
	{
	rc.getName();
	rc.getAddress();
	rc.getContact();
	rc.getEmail();
	rc.getProof();
	rc.getProofID();

}

}