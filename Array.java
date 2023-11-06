import java.util.*;
public class Array
{
	public static void main(String[] args) {
		System.out.println("array");
		int[] a={10,20,30};
		int[] a1={12,13,14};
		//List<Integer> l=Arrays.asList(a);
		//System.out.println(l);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a,30));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(Arrays.copyOf(a,10)));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.spliterator(a));
		System.out.println(Arrays.stream(a));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.mismatch(a,a1));
		
	}
}