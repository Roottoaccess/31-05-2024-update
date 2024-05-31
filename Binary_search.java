import java.util.Scanner;
import java.lang.Thread;

public class Binary_search extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 4, 5, 7, 9, 11};
        try{
            Thread.sleep(500);
            System.out.println();
            System.out.println("The targeted value found at the index: "+binarySearch(arr, 9));
        }catch(Exception e){
            System.out.println(e);
        }

    }


    public static int binarySearch(int[] numbers, int numberToFind){
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high){
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middlePosition - 1;
            } else{
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
