import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                System.out.println(i);
        }
        scanner.close();
    }
}