/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		int n=st.nextInt();
		int i,j;
		int s=1;
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print(s+" ");
		        s++;
		        
		    }
		    System.out.println();
		}
		
	}
}

