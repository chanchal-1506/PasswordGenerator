import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random(); // 0 to 10
        
        String pool = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkalmnopqrstuvwxyz1234567890!@#$%^&*()?/.><,"); // 100

        System.out.print("Enter Here Length : ");
        int length = input.nextInt();

        StringBuilder password = new StringBuilder();
    
        for(int i =1 ; i<=length ; i++){
            int index = random.nextInt(pool.length());
            password.append(pool.charAt(index));
        }

        System.out.println("THe Random genrated password is : " + password.toString());
    }
}