import java.util.Scanner;
public class ArraySum {
 public static void main(String[] args){
Scanner s=new Scanner(System.in);
  System.out.println("Enter array size");
int a=s.nextInt();
int[] n=new int[a];
     System .out.println("Enter array elements");
for(int i=0;i<a;i++)
  {
   n[i]=s.nextInt();
  }
    int sum=0;
for(int i=0;i<a;i++)
  {
  sum=sum+n[i];
  }
System.out.println("Sum of array elements is :" +sum);
  }
}
