package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a=0;
		int b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre how many days");
		int days = sc.nextInt();
		int[] temp = new int[days];
		for(int x=0;x<temp.length;x++)
		{
			System.out.println("Enter " + (x+1) +" Temperature: ");
			temp[x]=sc.nextInt();
			sum += temp[x];		
			}
		double avg =sum/temp.length;
		for(int x=0;x<temp.length;x++)
		{
			if(temp[x]>avg)
				a++;
		}
		System.out.println(a +" days above");
		for(int x=0;x<temp.length;x++)
		{
			if(temp[x]<avg)
				b++;
		}
		System.out.println(b +" days below");
		
		System.out.println("Average Temperarure is :" +avg);
		System.out.println(Arrays.toString(temp));
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		System.out.println("Two coldest days: " + temp[0]+","+temp[1]);
		System.out.println("Two hottest days: " + temp[days-1]+ ","+ temp[days -2] );
		
		int[] newdays= Arrays.copyOf(temp, temp.length);
		boolean equal = Arrays.equals(newdays, temp);
		if(equal)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		Arrays.fill(newdays, 37);
		System.out.println("Newdays Temp is: " + Arrays.toString(newdays));
	}

}
