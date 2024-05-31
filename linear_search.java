import java.util.Scanner;
import java.lang.Thread;

/* Here we will take all the resources */
class Buffer extends Thread{
        void setup(){
        Scanner sc = new Scanner(System.in);

        /* Taking the limit of the array */
        System.out.print("Enter the limit of the array: ");
        int lmt = sc.nextInt();

        /* Creating the array and taking the input
         * of the elements in the array till the 
         * limit
         */
        int arr[] = new int[lmt];

        System.out.println("----ENTER THE DATA ONE BY ONE----");
        /* Taking the input */
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }

        /* Display the data */
        System.out.println();
        System.out.println("----ELEMENTS IN THE ARRAY----");
        try{
            for(int i: arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /* Use the Bubble sort Algorithm to do it */
        System.out.println();
        try{
            int temp = 0;
        for(int i = 0; i < lmt - 1; i++){
            for(int j = 0; j < lmt - 1; j++){
                if(arr[j] > arr[j+1]){
                    /* Swapping the value */
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
            System.out.println("----APPLYING SORTING ALGORITM PLEASE WAIT....----");
            Thread.sleep(1500);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
        System.out.println("----DISPLAYING THE FINAL ELEMENT----");

        try{
            for(int i: arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /* Now applying the linear search Algorithm to find the value */
        System.out.println();
        System.out.print("Enter the value you want to find from the above elemenets: ");
        int find_val = sc.nextInt();
        /* Defining counter variable */
        int count = 0;
        /* Defining place_counter_variable */
        int place_count = 0;
        for(int i = 0; i < lmt; i++){
            if(arr[i] == find_val){
                count++;
                place_count = i;
            }
        }
        System.out.println("----OPERATIONS----");
        System.out.println();
        if(count > 0){
            System.out.println("ELement found "+count+" times in the position "+place_count);
        }else{
            System.out.println("Element not found !");
        }
    }
}


public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Creating the object of the Buffer Class */
        Buffer obj = new Buffer();
        obj.setup();
    }
}