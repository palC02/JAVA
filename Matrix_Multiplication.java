import java.util.*;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k,col1,row1,col2,row2;
        int array1[][]=new int[10][10];
        int array2[][]=new int[10][10];
        int multiply[][]=new int[10][10];


        System.out.println("Enter the size of Array1 Rows:");
        row1=sc.nextInt();
        System.out.println("Enter the size of Array1 Columns:");
        col1=sc.nextInt();

        System.out.println("Enter the elements of Array1: ");
        for(i=0;i<row1;i++){
            for(j=0;j<col1;j++){
                array1[i][j]=sc.nextInt();
            }
        }
       
       
        System.out.println("Enter the size of Array2 Rows:");
        row2=sc.nextInt();
        System.out.println("Enter the size of Array2 Columns:");
        col2=sc.nextInt();
        System.out.println("Enter the elements of Array2: ");
        for(i=0;i<row2;i++){
            for(j=0;j<col2;j++){
                array2[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<row1;i++){
            for(j=0;j<col2;j++){
                for(k=0;k<col1;k++){
                    multiply[i][j] +=array1[i][k]*array2[k][j];
                }
            }
        }
        System.out.println("Multiplication of two Matrix: ");
        for(i=0;i<row1;i++){
            for(j=0;j<col2;j++){
                System.out.print(multiply[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    
}
