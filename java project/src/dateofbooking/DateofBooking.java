package dateofbooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dateavailable.DateAvailable;
import oyo.Main;


public class DateofBooking 
{
	
	int d1,d2,d;
	public static int b=0;
	static int []arr=new int[25];

	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static Main reg=new Main();
DateAvailable dt=new DateAvailable();
public void datebooking() throws NumberFormatException, IOException 
{
                    
System.out.println("Enter date of booking");
d= Integer.parseInt(br.readLine());


arr[b++]=d;



}
public void veiw() throws NumberFormatException, IOException
{
	System.out.println("                  View all bookings:                ");
	System.out.println("Enter the start date");
	d1= Integer.parseInt(br.readLine());
	System.out.println("Enter the end date");
	d2= Integer.parseInt(br.readLine());
	System.out.println("The bookings made from"+ d1+"to"+d2+"are");
	for (int x=0; x<b;x++) {
		if(arr[x]>=d1 && arr[x]<=d2) {
			System.out.println(Main.idd[x]+"  "+Main.rom[x]);
		}
		
		
	}
}


}
