import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2, num3, num4, media;
        
        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        num1 = input.nextFloat();
        System.out.println("DIGITE O SEGUNDO VALOR: ");
        num2 = input.nextFloat();
        System.out.println("DIGITE O TERCEIRO VALOR: ");
        num3 = input.nextFloat();
        System.out.println("DIGITE O QUARTO VALOR: ");
        num4 = input.nextFloat();

        media = (num1*1 + num2*2 + num3*3 + num4*4) / (1+2+3+4);

        System.out.println("A MEDIA PONDERADA É: " + media);
    }
}
