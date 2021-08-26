package pilha_livro_dinamica;

import java.util.Scanner;

public class Pilha_Livro_Dinamica {


    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Pilha<String> p1 = new Pilha();
        int op;
        
        do{
            
        System.out.println("Opções:");
        System.out.println("1 - Pilha vazia?");
        System.out.println("2 - Tamanho da pilha");
        System.out.println("3 - Inserir livro");
        System.out.println("4 - Remover livro");
        System.out.println("5 - Consultar o útimo livro da pilha");
        System.out.println("0 - Sair");
        op = entrada.nextInt();
        
            switch(op){
                case 1:
                    System.out.println(p1.isVazia());
                    break;
                case 2:
                    System.out.println(p1.getTamanho());
                    break;
                case 3:
                    System.out.println("Digite o nome do livro:");
                    String livro = entrada.next();
                    p1.inserir(livro);
                    System.out.println("Livro inserido.");
                    break;
                case 4:
                    p1.remover();
                    System.out.println("Último livro da pilha removido.");
                    break;
                case 5:
                    System.out.println(p1.get());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opção inválida, tente novamente!");
                    break;
            }
            System.out.println(".............................................");
        }while(op!=0);
    }
}
