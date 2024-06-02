import java.util.Scanner;
import java.lang.Thread;
public class selection_advance extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");
        int lmt = sc.nextInt();

        int arr[] = new int[lmt];

        System.out.println("Enter elements one by one....");
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("BEFORE SORTING....");
        /* Displaying the element of the array */
        try{
            for(int i: arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /* The Engine method callling */
        Engine(arr,lmt);
    }

    public static void Engine(int ar[],int lt){
        int temp = 0;
        for(int i = 0; i < lt - 1; i++){
            int min = ar[i];
            int min_index = i;

            for(int j = i + 1; j < lt; j++){
                if(ar[j] < min){
                    min = ar[j];
                    min_index = j;
                }
            }
            /* Swapping */
            temp = ar[i];
            ar[i] = ar[min_index];
            ar[min_index] = temp;
        }
        /* After the algorithm applied we display the value again */
        System.out.println();
        System.out.println("AFTER SORTING....");

        try{
            for(int i: ar){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
