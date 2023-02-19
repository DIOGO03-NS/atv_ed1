import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,d; 
        System.out.println("Digite numero de tres casas: ");
        a = input.nextInt();
        d = a % 100 / 10;
        System.out.println("algarismo de casas das dezenas: " + d);
    }
}
