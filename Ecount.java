import java.util.*;
public class Ecount{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = s.nextInt();
        int[] b = new int[a];
        int even = 0, odd = 0;
        System.out.print("Enter array elements: ");
        for (int i = 0; i < a; i++) {
            b[i] = s.nextInt();
            if (b[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
            System.out.println("Even count: " + even);
            System.out.println("Odd count: " + odd);
    }
}