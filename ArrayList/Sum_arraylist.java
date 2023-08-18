import java.util.ArrayList;
import java.util.Scanner;
public class Sum_arraylist {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int i;
 ArrayList<Integer>numbers = new ArrayList<Integer>();
 System.out.print("Enter the number of inputs: ");
 int n=sc.nextInt();
 System.out.print("Enter the numbers: ");
 for(i=0;i<n;i++){
 int m=sc.nextInt();
 numbers.add(m);
 }
 int sum=0;
 System.out.println();
 for(i=0;i<n;i++){
 sum=sum+numbers.get(i);
 }
 System.out.print("After additon: "+sum);
 System.out.println();
 }
}
