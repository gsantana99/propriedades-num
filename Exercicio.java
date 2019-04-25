import java.util.Scanner;

public class Exercicio{

            public static void main(String[] args) {
                System.out.print("Digite um número: ");
                int num = readNumero();

                System.out.println("O quadrado de " + num + " é: " + getQuadrado(num));
                System.out.println("O cubo de " + num + " é: " + getCubo(num));
                System.out.println("A raiz quadrada de " + num + " é: " + getRaizQuadrada(num));
                System.out.println("O fatorial de " + num + " é: " + getFatorial(num));
                System.out.println("O " + num + "º número da sequência de Fibonacci é: " + getFibonacci(num));
                System.out.println("O antecessor de " + num + " é: " + getAntecessor(num));
                System.out.println("O sucessor de " + num + " é: " + getSucessor(num));

                if(ehPar(num)) {
                    System.out.println(num + " é par");
                } else {
                    System.out.println(num + " é ímpar");
                }

                if(ehPrimo(num)){
                    System.out.println(num + " é primo");
                } else {
                    System.out.println(num + " não é primo");
                }
            }

            public static int readNumero() {
                Scanner scanner = new Scanner(System.in);
                int num = Integer.parseInt(scanner.nextLine());
                scanner.close();
                return num;
            }

            public static int getQuadrado(int num) {
                return num * num;
            }

            public static int getCubo(int num) {
                return num * num * num;
            }

            public static double getRaizQuadrada(int num) {
                return Math.sqrt(num);
            }

            public static int getFatorial(int num) {
                int fatorial = num;
                for (int i = num - 1; i > 1; i--) {
                    fatorial *= i;
                }
                return fatorial;
            }

            public static int getFibonacci(int n){
                int i = 0;
                int j = 1;
                for(int k = 0; k < n; k++){
                    i += j;
                    j = i - j;
                }
                return j;
            }

            public static int getAntecessor(int num){
                return num - 1;
            }

            public static int getSucessor(int num){
                return num + 1;
            }

            public static boolean ehPar(int num) {
                if(num % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }

            public static boolean ehPrimo(int num){
                int num_divisores = 2;

                for(int i = 2; i < 10; i++) {
                    if(num % i == 0 && i != num) {
                        num_divisores += 1;
                    }
                }

                if(num_divisores == 2){
                    return true;
                } else {
                    return false;
                }
            }
}
