import java.util.Arrays;
import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter your number::");
            arr[i]=sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                int c=0;
                if(arr[i]>arr[j]){
                    c=arr[i];
                    arr[i]=arr[j];
                    arr[j]=c;
                }

            }
        }
        System.out.println("maximum[2nd...max] number is this:::: "+arr[1]);


}}
