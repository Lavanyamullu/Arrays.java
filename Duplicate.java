import java.util.*;
public class Duplicate{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = s.nextInt();
        int[] b = new int[a];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a; i++) {
            b[i] = s.nextInt();
        }
        System.out.println("Duplicate array elements:");
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (b[i] == b[j]) {
                    System.out.println(b[i]);
                }
            }
        }
    }
}