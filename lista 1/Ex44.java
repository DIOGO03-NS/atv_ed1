import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double log, base, resultado;
        System.out.println("DIGITE O LOGARIGMO: ");
        log = input.nextDouble();
        System.out.println("DIGITE A BASE: ");
        base = input.nextDouble();

        resultado = Math.log(log) / Math.log(base);

        System.out.println("O RESULTADO É: " + resultado);
    }
}
