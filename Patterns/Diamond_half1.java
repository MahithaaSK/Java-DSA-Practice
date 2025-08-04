import java.util.Scanner;

public class Diamond_half1 {
    	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	   for(int i=0;i<n;i++)
	   {
	     for(int j=0;j<=i;j++)
	     {
	         System.out.print("*");
	     }
	       System.out.println();
	   }
	     
	     for(int i=0;i<n;i++)
	   {
	     for(int j=n-1-i;j>0;j--)
	     {
	         System.out.print("*");
	     }
	    System.out.println();
}
}
}
