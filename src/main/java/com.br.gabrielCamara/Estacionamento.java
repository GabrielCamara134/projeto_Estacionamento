import java.time.LocalDateTime;
import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;
    private Tarifario tarifario;


    public Estacionamento(int totalVagas){
         this.vagas = new ArrayList<Vaga>();
         this.ticketsAbertos = new ArrayList<Ticket>();

         for(int i = 1; i<=totalVagas; i++){
             Vaga novaVaga = new Vaga(i);
             this.vagas.add(novaVaga);
             Ticket ticket = new Ticket();
             this.ticketsAbertos.add(ticket);
         }
    }

    public void registrarEntrada(Veiculo carro){
        for(Vaga vaga : this.vagas){
            if(vaga.getOcupada() == false){
                vaga.estacionar(carro);
                break;
            }

        }
        for(Ticket ticket : this.ticketsAbertos){
            if(ticket.getUsado() == false){
                ticket.setHoraEntrada(LocalDateTime.now());
                ticket.setCarro(carro);
                ticket.setUsado(true);
                break;
            }
        }

    }

    public void registrarSaida(String placa){
        for(Ticket ticket : this.ticketsAbertos){
            if(ticket.getCarro()!= null && ticket.getCarro().getPlaca().equals(placa)){
                ticket.registrarSaida();
                Tarifario tarifario = new Tarifario();
                tarifario.calcularValor(ticket.calcularTempoEmHoras());

                break;
            }
        }
        for(Vaga vaga : vagas){
            if(vaga.getVeiculoEstacionado()!= null && vaga.getVeiculoEstacionado().getPlaca().equals(placa)){
                vaga.liberar();
                break;
            }
        }
    }

    public void exibirVagasLivres(){
        for(Vaga vaga: vagas){
            if(vaga.getOcupada() == false){
                System.out.println("Vaga "  + vaga.getNumero() + " Livre");
            }else{
                System.out.println("Vaga " + vaga.getNumero() + " Ocupada pela placa:" + vaga.getVeiculoEstacionado().getPlaca());
            }
        }
    }
}
