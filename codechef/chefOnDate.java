/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int Moremoney = sc.nextInt();
		    int lessmoney = sc.nextInt();
		    
		    if(Moremoney>=lessmoney){
		        System.out.println("Yes");
		        
		    }else{
		        System.out.println("No");
		    }
		    
		}
	}
}
