import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n---Menu Estacionamento---");
            System.out.println("1 - Registrar Estacionamento");
            System.out.println("2 - Registrar Saida");
            System.out.println("3 - Exibir Vagas Livres");
            System.out.println("4 - Sair");
            System.out.print("Esolha um das opcoes:");
            opcao  = sc.nextInt();

            switch(opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(opcao!=4);

    }
}

