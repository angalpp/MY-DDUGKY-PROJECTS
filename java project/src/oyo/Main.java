package oyo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import booking.Booking;
import dateofbooking.DateofBooking;
import register.Register;
import statuspackage.StatusClass;
import updatepackage.UpdateClass;

public class Main {
	public static int id=0;
	public static int r=0;
	public static int d=0;
	public static int rm=0;
	public static int []idd=new int[25];
	public static int []rom=new int[25];


	public static void main(String[] args) throws IOException {
		int s;
		String ry;
		String uy;
		String sy,dy;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Register reg=new Register();
		Booking bok=new Booking();
		StatusClass sc=new StatusClass();
		DateofBooking df=new DateofBooking();		
		
		
		
		
		
		System.out.println("..................welecome to oyo...........");
	do {
		System.out.println(".......MENU............");
		System.out.println("1. register \n 2. booking \n 3. update email \n 4. status \n 5. All booking 6. exit");
		s=Integer.parseInt(br.readLine());
		
		switch(s)
		{
		case 1:
			do {
			reg.register();
			id++;
			idd[d]=id;
			System.out.println(" THANK YOU FOR REGISTERING,. YOUR ID IS " + id);
			df.datebooking();
			System.out.println(" do you want to do it  register again(y/n)");
			ry=br.readLine();
			}while(ry.equals("y"));
			break;
		   // reg.register1();
		case 2:
			do
		{
		System.out.println(".......BOOKING......");
		bok.book();
		//bok.bookset();
      	r++;
      	rom[rm]=r;
      	System.out.println(" THANK YOU FOR BOOKING,. YOUR ROOM NO IS " + r);
      	System.out.println(" do you want to do it  book again(y/n)");
		
		ry=br.readLine();
		
		}while(ry.equals("y"));
			break;
		case 3:
			
			do
		{
			UpdateClass uc=new UpdateClass();
			uc.update();
			System.out.println(" do you want re register your email id  again(y/n)");
			uy=br.readLine();
			
		}while(uy.equals("y"));
		case 4:
			do
			{
			sc.ststus();
			System.out.println(" do you want check again again(y/n)");
			sy=br.readLine();
			
		}while(sy.equals("y"));
		case 5:
			do
			{
			df.veiw();
			System.out.println(" do you want check again again(y/n)");
			dy=br.readLine();
			
		}while(dy.equals("y"));
			
		case 6:
			
				System.exit(0);
			
		}
		}while(true);
	
	
	}
}
		