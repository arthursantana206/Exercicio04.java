// Nome: Arthur Gabriel Santana dos Santos
// Matrícula: 1261940088

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, aumento, novoSalario;

        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();

        aumento = salario * 0.07;
        novoSalario = salario + aumento;

        System.out.println("Novo salário: R$ " + novoSalario);

        sc.close();
    }
}