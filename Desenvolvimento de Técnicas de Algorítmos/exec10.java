import java.util.Scanner;

public class exec10 {
    public static void main (String args[]) {
        Scanner obj =  new Scanner(System.in);

        double qtdLitros, desconto = 0, preco = 0, total;
        String tipoCombustivel;

        System.out.println("Informe a quantidade de litros comprados: ");
        qtdLitros = obj.nextDouble();

        System.out.println("Informe o tipo de combustível:\nAlcool\nGasolina");
        tipoCombustivel = obj.nextLine();

        if (tipoCombustivel.equalsIgnoreCase("Alcool")) {
            preco = 2.90;
        }
        else if (tipoCombustivel.equalsIgnoreCase("Gasolina")) {
            preco = 3.30;
        }
        else {
            System.out.println("O tipo de combustível informado não é válido!");
        }

        // Se Alcool:
        if (qtdLitros <= 20 && qtdLitros != 0 && tipoCombustivel.equalsIgnoreCase("Alcool")) {
            desconto = 0.03; 
        }
        else if(qtdLitros > 20 && qtdLitros != 0 && tipoCombustivel.equalsIgnoreCase("Alcool")) {
            desconto = 0.05;
        }
        // Se Gasolina:
        else if(qtdLitros <= 20 && qtdLitros != 0 && tipoCombustivel.equalsIgnoreCase("Gasolina")) {
            desconto = 0.04;
        }
        else if(qtdLitros > 20 && qtdLitros != 0 && tipoCombustivel.equalsIgnoreCase("Gasolina")) {
            desconto = 0.06;
        }
        else {
            System.out.println("A quantidade de litros/tipo de combustivel informado(a) é inválida!");
        }

        total = (qtdLitros * preco) * desconto;
        System.out.println("Sua compra saiu no total de :" + total);
    }
}