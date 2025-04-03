import java.util.Scanner;

public class Desafio {
    
    public static void main(String[] args) {
           Scanner leitorDeEntradas = new Scanner(System.in);

           System.out.println("Digite o valor do salario");
           float valorSalario = leitorDeEntradas.nextFloat();

           System.out.println("Digite o valor do Beneficio");
           float valorBeneficios = leitorDeEntradas.nextFloat();

           float valorImposto = 0;
           if (valorSalario >= 0 && valorSalario <= 1100) {
            // Atribui a aliquota de 5% mediante o salario:
            valorImposto = 0.5f * valorSalario;
            
           }
           //TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%

           //Calcula e imprime a saida (com 2 casas decimais):
           float saida = valorSalario - valorImposto + valorBeneficios;
           System.out.println(saida);

    }
}
