import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float saldo;
        System.out.println("DIGITE O SALDO: ");
        saldo = input.nextFloat();
        saldo = saldo * 1.01f;
        System.out.println("O SALDO REAJUSTADO É: " + saldo);
    }
}
