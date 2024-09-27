import java.util.Scanner;

public class exec9 {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);

        String codProduto;
        int qtdComprada;
        double resultado = 0;

        System.out.println("Informe o código do produto: ");
        codProduto = obj.nextLine();

        System.out.println("Informe a quantidade comprada: ");
        qtdComprada = obj.nextInt();

        if (codProduto.equalsIgnoreCase("ABCD")) {
            resultado = qtdComprada * 5.30;
        }
        else if (codProduto.equalsIgnoreCase("XYPK")) {
            resultado = qtdComprada * 6.00;
        }
        else if (codProduto.equalsIgnoreCase("KLMP")) {
            resultado = qtdComprada * 3.20;
        }
        else if (codProduto.equalsIgnoreCase("QRST")) {
            resultado = qtdComprada * 2.50;
        }
        else {
            System.out.println("O codigo/quantidade do produto não é uma entrada válida!");
        }

        System.out.println("Código do Produto: " + codProduto + "\nQuantidade: " + qtdComprada + "\nTotal: R$" + resultado);
    }
}