import java.util.Scanner;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.
public class Main {
    public static void main(String[] args) {
        float media = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Digite 3 valores");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
            media = (a*2 + b*3 + c*5)/10;
            System.out.printf("%.1f\n", media);

        }
        scanner.close();
    }
}