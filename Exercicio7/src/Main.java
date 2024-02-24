import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            int linha = i;
            int quadrado =(int) Math.pow(i,2);
            int cubo = (int) Math.pow(i,3);
            System.out.printf("%d %d %d\n", linha, quadrado, cubo);
        }
        scanner.close();
    }
}