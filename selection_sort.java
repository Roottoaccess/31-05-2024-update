import java.util.Scanner;
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int lmt = sc.nextInt();

        int arr[] = new int[lmt];

        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Display");

        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----APPLYING SELECTION SORT----");

        /* Apllying the algo */
        int temp = 0;
        for(int i = 0; i < lmt - 1; i++){
            int min = arr[i];
            int min_index = i;

            for(int j = i + 1; j < lmt; j++){
                if(arr[j] < min){
                    min = arr[j];
                    min_index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        System.out.println();
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
