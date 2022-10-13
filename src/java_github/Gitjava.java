package java_github;

import java.util.Scanner;

public class Gitjava {

	
	public static void main(String[] args) 
	{
		int i=100;
		int mark;
		System.out.println("ENTER YOUR MARK:");
		Scanner ob = new Scanner(System.in);
		mark = ob.nextInt();
		if(mark<=100)
		{
			System.out.println("YOUR MARK IS VALID");
		}
		else
		{
			System.out.println("YOUR MARK IS INVALID");
		}
		System.out.println("MARK IS VALID/INVALID:" +mark);

	}

}
