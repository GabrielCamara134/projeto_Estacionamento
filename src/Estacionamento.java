import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;
    private Tarifario tarifario;

    public Estacionamento(int totalVagas){
         this.vagas = new ArrayList<Vaga>();

         for(int i = 1; i<=totalVagas; i++){
             Vaga novaVaga = new Vaga(i);
             this.vagas.add(novaVaga);
         }
    }

    public void registrarEntrada(Veiculo carro){
        for(Vaga vaga : this.vagas){
            if(vaga.getOcupada() == false){
                vaga.estacionar(carro);
                break;
            }

        }

    }

    public void registrarSaida(String placa){
        for(Vaga vaga : vagas){
            if(vaga.getVeiculoEstacionado()!= null && vaga.getVeiculoEstacionado().getPlaca().equals(placa)){
                vaga.liberar();
            }
        }
    }

    public void exibirVagasLivres(){
        for(Vaga vaga: vagas){
            if(vaga.getOcupada() == false){
                System.out.println("Vaga "  + vaga.getNumero() + " Livre");
            }
        }
    }
}
