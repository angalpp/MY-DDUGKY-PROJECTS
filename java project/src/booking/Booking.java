package booking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bookingpackage.BookingClass;

public class Booking {


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BookingClass bc=new BookingClass();
String ac;
 String cot;
 String cable;
 String wifi;
 String laundry;
 String date;
 int sum=0;
 
 public void book() throws IOException {
	 System.out.println("AC/non-AC(AC/nAC)");
	 ac=br.readLine();
	 System.out.println("Cot(Single/Double)");
	 cot=br.readLine();
	 System.out.println("With cable connection/without cable connection(C/nC)");
	 cable=br.readLine();
	 System.out.println("Wi-Fi needed or not(W/nW)");
	 wifi=br.readLine();
	 System.out.println("Laundry service needed or not(L/nL");
	 laundry=br.readLine();
	 
	 bc.setAc(ac);
	 bc.setCot(cot);
	 bc.setCable(cable);
	 bc.setWifi(wifi);
	 bc.setLaundry(laundry);
	 
 //}

// public void bookset()
// {

 
	
		
		
		if(bc.getAc().equalsIgnoreCase("Ac"))
	    	 sum=sum+1000;
	     else
	    	 sum=sum+750;
	     
	    
		if(bc.getCot().equalsIgnoreCase("Double"))
			sum=sum+350;
	     
		if(bc.getCable().equalsIgnoreCase("C")) 
			sum=sum+50;	
		if(bc.getWifi().equalsIgnoreCase("W"))
			sum=sum+200;
		
		if(bc.getLaundry().equalsIgnoreCase("L"))
		{
			sum=sum+1000;;
		}
		System.out.println("The services chosen are");
		
		System.out.println("cot " + bc.getCot()+ bc.getAc() + " room");
		
		System.out.println( bc.getCable()+" connection enabled");
		System.out.println( bc.getWifi()+" enabled");
		System.out.println(bc.getLaundry()+" needed");
	
		System.out.println("Cost is "+ sum);
	//} 

}}