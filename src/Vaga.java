public class Vaga {
    private int numero;
    private boolean ocupada = false;
    private Veiculo veiculoEstacionado;

    public Vaga(int numero){

        this.numero = numero;
    }
    public int getNumero(){

        return this.numero;
    }
    public boolean getOcupada(){
        return this.ocupada;
    }
    public Veiculo getVeiculoEstacionado(){

        return this.veiculoEstacionado;
    }
    public void estacionar(Veiculo carro){
        this.veiculoEstacionado = carro;
        this.ocupada = true;
    }

    public void liberar(){
        this.veiculoEstacionado = null;
        ocupada = false;
    }
}
