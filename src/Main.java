import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(10);
        int opcao = 0, i = 0;
        String placa, modelo;

        do{
            System.out.println("\n---Menu Estacionamento---");
            System.out.println("1-Registrar entrada");
            System.out.println("2 - Registrar Saida");
            System.out.println("3 - Exibir Vagas Livres");
            System.out.println("4 - Sair");
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
                    if(i<11) {
                        System.out.println("Digite o numero da placa do veiculo:");
                        placa = sc.nextLine();
                        System.out.println("Digite o modelo do veiculo:");
                        modelo = sc.nextLine();
                        Veiculo c1 = new Veiculo(placa, modelo);
                        estacionamento.registrarEntrada(c1);
                        System.out.println("Veiculo registrado com sucesso!");
                        i++;
                    }

                    break;
                case 2:
                    if(i>0) {
                        System.out.println("Vamos registrar a saida do veiculo");
                        System.out.println("Digite o numero da placa do veiculo:");
                        placa = sc.nextLine();
                        estacionamento.registrarSaida(placa);
                        i--;
                    }
                        break;
                case 3:
                    estacionamento.exibirVagasLivres();
                    break;
                case 4:
                    System.out.println("Tchau!!");
                    break;

            }

        }while(opcao!=4);

    }
}

