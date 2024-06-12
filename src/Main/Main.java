package Main;

import Implements.Supermercado;
import Implements.SupermercadoArray;

import java.util.Scanner;

public class Main {

    private final static int SIZE = 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Supermercado supermercado = new SupermercadoArray(SIZE);
        int opcao;

        do {
            System.out.println("---------- Lista de supermercado -------------");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar items");
            System.out.println("3 - Remover item");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item: ");
                    String item = sc.next();
                    supermercado.add(item);
                    supermercado.print();
                    break;
                case 2:
                    supermercado.print();
                    break;
                case 3:
                    System.out.println("Digite o índice do item: ");
                    int index = sc.nextInt();
                    supermercado.remove(index);
                    supermercado.print();
                    break;
                case 4:
                    System.err.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while (opcao != 4);

        sc.close();
    }
}
