import java.util.Scanner;
import java.lang.Thread;
import java.util.Arrays;
public class bin_advance extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int lmt = sc.nextInt();

        /* Creating the array for the input */
        int arr[] = new int[lmt];

        System.out.println("Enter the elements one by one.....:-");
        /* Taking the input in the array */
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }

        /* Now showing the elements in the array */
        System.out.println();

        System.out.println("Elements are .....");

        try{
            for(int i: arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println();
        /* Applying the sorting to the unordered elements */
        Arrays.sort(arr);
        /* Printing the sorting array */
        System.out.println("After arranging the elements....");
        try{
            for(int i : arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
        System.out.print("Enter the value you want to find: ");
        int find = sc.nextInt();

        bin_advance obj = new bin_advance();
        try{
            if(obj.Operation(arr,find) != -1){
                System.out.println("Element found at position: "+obj.Operation(arr, find));
            } else{
                System.out.println("element not found");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    int Operation(int a[], int f){
        /* After that we have to use the main Algorithm of binary search */
        int low = 0; 
        int high = a.length - 1;

        while(low <= high){
            int middle_pos = (low + high) / 2;
            // int middle_val = a[middle_pos];

            if(f == a[middle_pos]){
                return middle_pos;
            } else if(f < a[middle_pos]){
                high = middle_pos - 1;
            } else{
                low = middle_pos + 1;
            }
        }
        return -1;
        // System.out.println("Element not found");
    }
}
