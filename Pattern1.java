import java.util.*;
public class Pattern1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {
            for(int j=0;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}