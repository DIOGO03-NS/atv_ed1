import java.util.Scanner;

import javafx.scene.AmbientLight;

public class Ex43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double logaritmo;
        System.out.println("DIGITE UM NUMERO PARA ACHAR SEU LOG BASE 10: ");
        logaritmo = Math.log10(input.nextFloat()) ;
        System.out.println("O LOGARITMO NA BASE 10 DO NUMERO É: " + logaritmo);
    }
}
