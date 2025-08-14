import java.util.Scanner;
public class InfoOf3 {
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers, separated by a space");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.println("Results:");
        System.out.println("allAreEqual: " + allAreEqual(num1,num2,num3));
        System.out.println("twoAreEqual: " + twoAreEqual(num1,num2,num3));
        System.out.println("noneAreEqual: " + noneAreEqual(num1,num2,num3));
        System.out.println("areAscending: " + areAscending(num1,num2,num3));
        System.out.println("areDescending: " + areDescending(num1,num2,num3));
        System.out.println("strictlyAscending: " + strictlyAscending(num1,num2,num3));
        System.out.println("strictlyDescending: " + strictlyDescending(num1,num2,num3));

    }

    public static boolean allAreEqual(int a, int b, int c){
        return a == b && b == c && c == a;
    }
    public static boolean twoAreEqual(int a, int b, int c){
        return !( a == b && b == c && c == a) && !( a != b && b != c && c != a );
    }
    public static boolean noneAreEqual(int a, int b, int c){
        return a != b && b != c && c != a;
    }
    public static boolean areAscending(int a, int b, int c){
        return a <= b && b <= c;
    }
    public static boolean areDescending(int a, int b, int c){
        return a >= b && b >= c;
    }
    public static boolean strictlyAscending(int a, int b, int c){
        return a < b && b < c;
    }
    public static boolean strictlyDescending(int a, int b, int c){
        return a > b && b > c;
    }
}