import java.util.Scanner;

public class Atividade01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char opcao;
        double num1, num2;

        do{
            System.out.println("Selecione a operação desejada:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Raiz Quadrada");
            System.out.println("Q. Sair");
            opcao = input.next().charAt(0);

            System.out.println("Digite o primeiro número");
            num1 = input.nextDouble();
            System.out.println("Digite o segundo número");
            num2 = input.nextDouble();


            switch (opcao) {
                case '1':
                    Soma soma = new Soma(num1, num2);
                    soma.calcular();
                    break;
                case '2':
                    Subtracao subtracao = new Subtracao(num1, num2);
                    subtracao.calcular();
                    break;
                case '3':
                    Multiplicacao multiplicacao = new Multiplicacao(num1, num2);
                     multiplicacao.calcular();
                    break;
                case '4':
                    if (num2 == 0) {
                        System.out.println("Não existe divisão por 0!");
                        break;
                    }else{
                        Divisao divisao = new Divisao(num1, num2);
                        divisao.calcular();
                        break;
                    }
                case '5':
                    if (num2 == 0) {
                        System.out.println("Resultado: 1");
                        break;
                    }else{
                        Potencia potencia = new Potencia(num1, num2);
                        potencia.calcular();
                        break;
                    }
                case '6':
                    if (num1 < 0) {
                        System.out.println("Não existe raiz negativa!");
                        break;
                    }else{
                        Raiz raiz = new Raiz(num1, num2);
                        raiz.calcular();
                        break;
                    }
                default:
                    break;
            }

        }while(opcao != 'Q' && opcao != 'q');

        input.close();
    }
}