import java.util.*;
public class Add{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
        int a=s.nextInt();
        System.out.print("Enter the number of columns: ");
        int b= s.nextInt();
        int[][] m1 = new int[a][b];
        int[][] m2 = new int[a][b];
        int[][] result = new int[a][b];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                m1[i][j] = s.nextInt();}}
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                m2[i][j] = s.nextInt();}}
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                result[i][j] = m1[i][j] + m2[i][j];}}
        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(result[i][j] + " ");
            }}
	}
}