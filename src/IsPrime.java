import java.util.Scanner;
import java.lang.Math;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 2) {
            System.out.println(number + " is not prime nummber!");
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number+" is Prime Number");
            }
            else{
                System.out.println(number+" is not Prime Number");
            }
        }

    }
}
