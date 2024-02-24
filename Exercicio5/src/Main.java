import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int fatorial = 1;
        String fat = "";
        for (int i = n; i >= 1; i--){
            fatorial*= i;
            if(i == 1)
                fat+= i + " = ";
            else
                fat += i + " * ";

        }
        System.out.println(fat + fatorial);

        scanner.close();
    }
}