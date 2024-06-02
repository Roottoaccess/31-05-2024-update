import java.util.Scanner;
import java.lang.Thread;
public class insertion_sort extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");
        int l = sc.nextInt();

        int a[] = new int[l];

        System.out.println("Enter value ....");
        for(int i = 0; i < l; i++){
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("--BEFORE SORTTING--");

        try{
            for(int i: a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /* Thrusting Engine */
        Engine(a, l);
    }
    public static void Engine(int arr[], int lmt){
        /* Engine Dinamics And Algorithm */

        System.out.println();
        System.out.println("AFTER SORTING....");

        int i ; int j; int key;
        for(i = 1; i < lmt; i++)
        {
            key = arr[i];
            j = i - 1;

            while(j >= 0 && arr[j] > key){
                // Shifting
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        try{
            for(int z: arr){
                System.out.print(z+" ");
                Thread.sleep(500);
            }
            System.out.println();
        }catch(Exception e){
            System.out.println(e);
        }
        }

        
    }
}
