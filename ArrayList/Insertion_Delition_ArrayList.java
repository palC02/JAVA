import java.util.*;

public class Insertion_Delition_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,index,element;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(true){
            System.out.println("----------MENU----------");
            System.out.println("Press 1: For Insertion ");
            System.out.println("Press 2: For Deletion ");
            System.out.println("Press 3: For Display");
            System.out.println("Press 4: For Exit()");
            System.out.print("Enter Your Choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                     System.out.println("Enter the Index: ");
                     index=sc.nextInt();
                     System.out.println("Enter the Element You want Insert: ");
                     element=sc.nextInt();
                     numbers.add(index,element);
                     System.out.println("The Element: "+element+ " Stored at index: "+index);
                     System.out.println();
                     break;
                case 2:
                    System.out.println("Enter the Index: ");
                    index=sc.nextInt();
                    if(index>=numbers.size() || index<0){
                        System.out.println("Wrong Input");
                    } 
                    else{
                        numbers.remove(index);
                    } 
                    System.out.println("The Element deleted from index: "+index);  
                    System.out.println();
                    break;
                case 3:
                    System.out.println("This is the ArrayList");
                    System.out.println(numbers); 
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;       
            }
        }
    }
}
