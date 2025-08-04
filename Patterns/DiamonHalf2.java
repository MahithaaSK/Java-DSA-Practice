import java.util.Scanner;

public class DiamonHalf2 {
    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	   for(int i=0;i<n;i++)
	   {
	     for(int j=0;j<n-1-i;j++)
	     {
	         System.out.print(" ");
	     }
	     for(int k=0;k<=i;k++)
	     {
	         System.out.print("*");
	     }
	    System.out.println();}
	    
	    for(int i=0;i<n;i++)
	   {
	     for(int j=0;j<=i;j++)
	     {
	         System.out.print(" ");
	     }
	     for(int k=0;k<n-1-i;k++)
	     {
	         System.out.print("*");
	     }
	    System.out.println();}
}
}
