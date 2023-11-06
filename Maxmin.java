import java.util.*;
public class Maxmin
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
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
		if(a[i]>max){
		    max=a[i];
		}
		if(a[i]<min){
		    min=a[i];
		}}
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);
	}
}