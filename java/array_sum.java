/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
   static int i,j,n,m,max=-1,min,sum,sum1=0;
	public static void main(String[] args) {
	    Scanner st=new Scanner (System.in);
	    n=st.nextInt();
	    m=st.nextInt();
	    int arr[][]=new int[n][m];
	    
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<m;j++)
	        {
	            arr[i][j]=st.nextInt();
	        }
	    }
	
	array(arr,i,j);
}
	    public static void array(int[][] arr,int i,int j){
	    sum=0;
	    for(i=0;i<n;i++)
	    {
	        max=-1;min=1000;
	        for(j=0;j<m;j++)
	        {
	            
	             if(arr[i][j]<min)
	              min=arr[i][j];
	             if(max<arr[i][j])
	             
	                max=arr[i][j];
	             
	             
	              
	        }
	        sum=sum+max;
	        sum1=sum1+min;
	    }
	    System.out.println(sum+sum1);
	    
	    
		
	}
}

