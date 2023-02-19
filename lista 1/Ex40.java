import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numero1, numero2, quociente, resto;
        
        System.out.println("DIGITE O PRIMEIRO VALOR(DIVISOR): ");
        numero1 = input.nextFloat();
        System.out.println("DIGITE O SEGUNDO VALOR(DIVIDENDO): ");
        numero2 = input.nextFloat();

        resto = numero2 % numero1; 
        quociente = numero2 / numero1;

        System.out.println(
            "\n dividento: " + numero2 +
            "\n divisor: " + numero1 +
            "\n quociente: " + quociente +
            "\n resto: " + resto
        );
    }
}
