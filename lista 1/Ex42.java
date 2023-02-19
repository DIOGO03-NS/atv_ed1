import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angulo;

        System.out.println("DIGITE O ANGULO: ");
        angulo = (input.nextFloat() * Math.PI) / 180;

        System.out.println("SENO: " + Math.sin(angulo));
        System.out.println("CO-SENO: " + Math.cos(angulo));
        System.out.println("TANGENTE: " + Math.tan(angulo));
        System.out.println("SECANTE: " + 1/Math.cos(angulo));
        System.out.println("CO-SECANTE: " + 1/Math.sin(angulo));
        System.out.println("CO-TANGENTE: " + 1/Math.tan(angulo));
    }
}
