import java.util.*;
public class Seclar
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int[] a=new int[n];
		int rev=0;
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++){
		    a[i]=s.nextInt();
		}
		Arrays.sort(a);
        for (int j = a.length - 2; j >= 0; j--) {
            if (a[j] != a[a.length - 1]) 
		System.out.println("second largest element");
		System.out.println(a[j]);
		break;
		    }
	}
}