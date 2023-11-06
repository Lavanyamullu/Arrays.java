import java.util.*;
public class Reve
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
		System.out.println("reverse element");
		for(int i=a.length-1;i>=0;i--)
		System.out.println(a[i]);
	}
}
