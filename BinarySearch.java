package ss13_search_algorithm_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] myArray;
    public static int search(int[] array , int left , int right, int value ) {
        while (left <= right){
            int mid = (left + right)/2;
            if(array[mid] == value){
                return mid;
            }else if(array[mid] > value){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        myArray = new int[n];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter element " + i);
            myArray[i] = sc.nextInt();
        }
        Arrays.sort(myArray);
        System.out.println("myArray after sort :" );
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
        System.out.println("\n Enter value need find in myArray :");
        int value = sc.nextInt();
        System.out.println("Index of value in myArr:");

        System.out.println(search(myArray,0, myArray.length-1,value));
    }


}
