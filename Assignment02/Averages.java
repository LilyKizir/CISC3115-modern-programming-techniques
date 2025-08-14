import java.util.Scanner;
import java.io.*;
public class Averages{
    public static void main(String[] args) throws IOException {
        File f = new File("numbers.text");
        Scanner input = new Scanner(f);
        int sets;
        for(sets = 0; input.hasNext();sets++){
            int[] arr = new int[input.nextInt()];
            for (int i = 0; i < arr.length; i++){
                arr[i] = input.nextInt();
            }
            average(arr);
        }
        System.out.println(sets + " sets of numbers processed");
    }

    public static void average(int[] numbers){
        double avg = 0;
        System.out.print("The average of the " + numbers.length + " integers " );
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
            avg+= numbers[i];
        }
        avg /= numbers.length;
        System.out.println("is " + avg);
    }
}