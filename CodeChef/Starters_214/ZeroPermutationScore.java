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
		    int N=sc.nextInt();
		    int m=N/2;
		    int ans=0;
		    if(N%2==0){
		        ans=(m-1)*(m-1);
		    }
		    else{
		        ans=m*(m-1);
		    }
		    System.out.println(ans);
		}

	}
}
