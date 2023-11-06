import java.util.*;
public class Sumavg
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++){
		    a[i]=s.nextInt();
		}
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++){
		sum=sum+a[i];
		avg=sum/n;
		}
		System.out.println("sum:"+sum);
		System.out.println("Avg:"+avg);
	}
}