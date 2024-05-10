import java.util.Scanner;

public class DesafioRepeticao {
    public static void main(String[] args) {

        int pararPrograma;

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Insira o valor do salário: ");
            double salario = entrada.nextDouble();
            double porcentagem;
            String valorPorcentagem;
            double novosalario;
            double ganhoreal;

            if (salario <= 280) {
                porcentagem = ((salario * 20) / 100);
                valorPorcentagem = "20%";
                novosalario = (salario + porcentagem);
                ganhoreal = (porcentagem / (1 + 0.038));

            } else if ((salario > 280) && (salario <= 700)) {
                porcentagem = ((salario * 15) / 100);
                valorPorcentagem = "15%";
                novosalario = (salario + porcentagem);
                ganhoreal = (porcentagem / (1 + 0.038));

            } else if ((salario > 700) && (salario <= 1500)) {
                porcentagem = ((salario * 10) / 100);
                valorPorcentagem = "10%";
                novosalario = (salario + porcentagem);
                ganhoreal = (porcentagem / (1 + 0.038));

            } else {
                porcentagem = ((salario * 5) / 100);
                valorPorcentagem = "5%";
                novosalario = (salario + porcentagem);
                ganhoreal = (porcentagem / (1 + 0.038));

            }

            System.out.printf("Salário base: R$ %.2f\n", salario);
            System.out.println("Reajuste de: " + valorPorcentagem);
            System.out.printf("Valor do aumento: R$ %.2f\n", porcentagem);
            System.out.printf("Novo salário pós aumento: R$ %.2f\n", novosalario);
            System.out.printf("Valor do aumento real descontando a inflação: R$ %.2f", ganhoreal);

            System.out.println("\n Deseja fazer um novo cálculo?" + "\n digite 1 (sim) ou 2 (não)");
            pararPrograma = entrada.nextInt();
        } while (pararPrograma != 2);

        System.out.println("Programa finalizado.");
    }
}