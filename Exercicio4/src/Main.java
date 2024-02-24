import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print("Digite o primeiro numero: ");
            float numero1 = scanner.nextInt();
            System.out.print("Digite o segundo numero: ");
            float numero2 = scanner.nextInt();
            if(numero2 == 0)
                System.out.println("Divisão impossível");
            else
                System.out.println(numero1 / numero2);
        }
        scanner.close();
    }
}