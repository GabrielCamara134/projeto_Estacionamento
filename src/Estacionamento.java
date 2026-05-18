import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;
    private Tarifario tarifario;

    public Estacionamento(int totalVagas){
         this.vagas = new ArrayList<Vaga>;

         for(int i = 0; i<=totalVagas; i++){
             Vaga novaVaga = new Vaga(i);
             this.vagas.add(novaVaga);
         }
    }

    public void registrarEntrada(Veiculo carro){

    }

    public void registarSaida(String placa){

    }

    public void exibirVagasLivres(){
        for(Vaga vaga: vagas){
            System.out.println("Vaga"  + vaga.getNumero() + " Livre");
        }

    }
}
