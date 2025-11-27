import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
		    T--;
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    int N=2*y;
		    int friend1=x-y;
		    int friend2=x+y;
		    int direction1=x-z;
		    int direction2=x+z;
		 //if x-y is max than travel distance from left side,chef can't travel;
		    int a=Math.max(friend1,direction1);
		 //if x+z is min than travel distance from right side,chef can travel;
         // take it as range[a,b]; x>a and y<b;
		    int b=Math.min(friend2,direction2);
		    
		    int ans=0;
		    if(a<=b) ans=b-a+1;
		    if(x>=a && x<=b) ans--;
	     	System.out.println(ans);
       }
	}
}
