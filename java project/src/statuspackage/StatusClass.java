package statuspackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import oyo.Main;

public class StatusClass {
	
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	static int []arr=new int[25];
	int j,k;
	
	
	public void ststus() throws NumberFormatException, IOException 
	{
		Main m=new Main();
		int a = 0;
		 
		 
		arr[a]= Main.r;
			
	      	
	System.out.println("which room is you want?");
	j=Integer.parseInt(br.readLine());
			System.out.println(arr[0]);
			
			for( k=0;k<=a;k++)
			{
				
				if(arr[k]==j)
				{
					System.out.println("room "+ j+ "is booked");
				}
				else
				{
					System.out.println("ROOM IS FREE");
				}
	}
	}
}
