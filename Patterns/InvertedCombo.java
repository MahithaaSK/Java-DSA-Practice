import java.util.Scanner;

public class InvertedCombo {
    	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	   for(int i=0;i<n;i++)
	   {
	     for(int j=i;j<n;j++)
	     {
	         System.out.print("*");
	     }
	     for(int k=0;k<2*i;k++)
	     {
	         System.out.print(" ");
	     }
	     for(int j=n-1;j>=i;j--)
	     {
	         System.out.print("*");
	     }
	    System.out.println();
}
}}
