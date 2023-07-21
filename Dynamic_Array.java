import java.util.*;
public class Dynamic_Array{
    static Scanner sc = new Scanner(System.in);
    
     static void insertion(int arr[],int n,int size){
        int i;
        System.out.println("Enter the postion of the index: ");
        int index=sc.nextInt();
        if(n==size){
            System.out.println("Array is already Full");
        }
        else if(n<index){
            System.out.println("You Cannot insert any element...");
        }
        else{
            
            for(i=n;i>=index;i--){
                arr[i]=arr[i-1]; 
            }
            System.out.println("Enter the element to insert...");
                arr[index]=sc.nextInt();
                n++;
        }

    }
    static void deletion(int arr[],int n,int size){
        int i;
        System.out.println("Enter the index where to want to delete an element: ");
        int index=sc.nextInt();
        if(index<0 || index >=n){
            System.out.println("You entered an invalid Index :(");
        }
        else{
            for(i=index;i<=n;i++){
                arr[i]=arr[i+1]; 
            }
            System.out.println("The element from index: "+index + " deleted successfully");
            n--;
        }
    }
    static void display(int arr[],int n,int size){
        int i;
        if(n==0){
            System.out.println("Nothing to display...");
        }
        else{
            System.out.println("This is the Array---");
            for(i=0;i<n;i++){
                System.out.println(+arr[i]);
            }
            
        }
    }
     public static void main(String[] args) {
        int i,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        System.out.println("Enter the number of elements you want to enter: ");
        int n=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        while(true){
            System.out.println("---------MENU---------");
            System.out.println("1.For insert an element in the array...");
            System.out.println("2.For delete an element from the array...");
            System.out.println("3.To display the array...");
            System.out.println("4.Exit :)");
            System.out.println("Enter your choice: ");
            c=sc.nextInt();

            switch(c){
                case 1:insertion(arr,n,size);
                System.out.println("You Successfully insert an element ");
                break;
                case 2:deletion(arr,n,size);
                System.out.println("You Successfully delete an element ");
                break;
                case 3:display(arr,n,size);
                break;
                case 4:System.exit(0);
            }
        }

    }
}