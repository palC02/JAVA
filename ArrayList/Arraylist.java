import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        System.out.println("Enter the number of inputs: ");
        int n=sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(i=0;i<n;i++){
            int m=sc.nextInt();
            numbers.add(m);
        }
        System.out.println("Before addition: "+numbers);
        for(i=0;i<n;i++){
            numbers.set(i, numbers.get(i)+5);
        }
        System.out.println("After additon: "+numbers);
        System.out.println();
    }
}
