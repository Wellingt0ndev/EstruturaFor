import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
public class Main {
    public static void main(String[] args) {
        int in = 0;
        int out = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.printf("Digite o %dº número: ", i);
            int numero = scanner.nextInt();
            if(numero >= 10 && numero <= 20)
                in++;
            else
                out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}