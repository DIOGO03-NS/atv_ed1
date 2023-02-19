import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salarioMinimo, qtdQuilowatts;

        System.out.println("DIGITE O VALOR DO SALARIO MINIMO: ");
        salarioMinimo = input.nextFloat();
        System.out.println("AGORA DIGITE O A QUANTIDADE GASTA DE QUILOWATTS");
        qtdQuilowatts = input.nextFloat();

        System.out.println("A O VALOR DE CADA QUILOWATTS É DE: " + (salarioMinimo/700));
        System.out.println("O VALOR A SER PAGO É DE: " + (salarioMinimo/700) * qtdQuilowatts);
        System.out.println("O VALOR COM UM DESCONTO DE 10% É DE: " + (((salarioMinimo/700) * qtdQuilowatts) - ((salarioMinimo/700) * qtdQuilowatts) * 0.1));
    }
}
