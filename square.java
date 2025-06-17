import java.util.Scanner;

public class square {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int size = scan.nextInt() ;
    for(int i=1;i<=size;i++)
    {
        for(int j=1;j<=size;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
}
