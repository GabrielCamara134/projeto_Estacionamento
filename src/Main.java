import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(10);
        int opcao = 0;
        String placa,modelo;

        do{
            System.out.println("\n---Menu Estacionamento---");
            System.out.println("1 - Registrar veiculo");
            System.out.println("2-Registrar entrada");
            System.out.println("3 - Registrar Saida");
            System.out.println("4 - Exibir Vagas Livres");
            System.out.println("5 - Sair");
            System.out.print("Esolha um das opcoes:");

            String entradaOpcao = sc.nextLine().trim();
            try {
                opcao = Integer.parseInt(entradaOpcao);
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Entrada inválida. Digite apenas um número de 1 a 5.");
                System.out.println("Tente novamente.");
                continue;
            }

            switch(opcao){
                case 1:

                    System.out.println("Digite o numero da placa do veiculo:");
                    placa = placa.nextLine();
                    System.out.println("Digite o modelo do veiculo:");
                    modelo = modelo.nextLine();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:
                    estacionamento.exibirVagasLivres();
                    break;
            }

        }while(opcao!=4);

    }
}

