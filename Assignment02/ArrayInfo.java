import java.util.Scanner;
import java.io.*;
public class ArrayInfo{
    public static void main(String[] args) throws IOException{
        File f = new File("numbers2.text");
        Scanner input = new Scanner(f);
        double[] numArray = parseInput(input);
        descriptiveStatistics(numArray);
    }

    public static double[] parseInput(Scanner sc){
        double[] arr = new double[sc.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    public static void descriptiveStatistics(double[] arr){
        System.out.print("The array: {");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("} contains " + arr.length + " elements");
        System.out.println("The first element of the array is " + arr[0]);
        System.out.println("The middle element of the array is " + arr[(arr.length-1)/2] + " and is at position " + ((arr.length - 1)/2));
        int big = 0, small = 0;
        for(int i = 0; i < arr.length; i++){
            big = arr[i] > arr[big] ? i : big;
            small = arr[i] < arr[small] ? i : small;
        }
        System.out.println("The largest element of the array is " + arr[big] + " and is at position " + big);
        System.out.println("The smallest element of the array is " + arr[small] + " and is at position " + small);        
    }
}