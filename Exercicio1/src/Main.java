import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro de 1 à 1000: ");
        int x = scanner.nextInt();
        for(int i = 1; i <= x; i++){
            if(i % 2 != 0)
                System.out.println(i);
        }
        scanner.close();


    }
}