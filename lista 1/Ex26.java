import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data, dia, mes, ano, ndata;
        System.out.println("Digite data no formato DDMMAA: ");
        data = input.nextInt();
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        ndata = mes * 10000 + dia * 100 + ano;
        
        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
        System.out.println("DATA NO FORMATO MMDDDAA: " + ndata);
    }
}
