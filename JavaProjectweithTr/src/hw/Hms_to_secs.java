package hw;

import java.util.Scanner;

public class Hms_to_secs {
	static int hr;
	static int min;
	static int sec;
	static int hrts;
	static int mints;
	static char ch;
	static Scanner sc = new Scanner(System.in);
	
	public Hms_to_secs()
	{
		System.out.println("Enter Hours: ");
		hr = sc.nextInt();
		System.out.println("Enter Minutes: ");
		min = sc.nextInt();
		System.out.println("Enter Second");
		sec = sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		do
//		{
//			Hms_to_secs hs = new Hms_to_secs();
//			System.out.println("Hour: "+hs.hr +"\n"+"Minutes : "+ hs.min+ "\n"+"Seconds  : "+ hs.sec);
//			long totalsec = Sec(hr,min,sec);
//			System.out.println("Total Second : " + totalsec);	
//			System.out.println("Do Again");
//			ch = sc.next().charAt(0);
//		}while(ch=='Y');
		while(true)
		{
			Hms_to_secs hs = new Hms_to_secs();
			System.out.println("Hour: "+hs.hr +"\n"+"Minutes : "+ hs.min+ "\n"+"Seconds  : "+ hs.sec);
			long totalsec = Sec(hr,min,sec);
			System.out.println("Total Second : " + totalsec);
		}
		
	}
	public static long Sec(int hrs,int min, int sec)
	{
		int hrtos = hr*3600;
		int mintos = min *60;
		long addsec = hrtos+mintos+sec;
		return addsec;
	
	}
	


}
