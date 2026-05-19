public class Tarifario {
    private double valorHora = 10.0;
    private double valorDiaria = 240.0;
    private double valorMes = 7200.0;

    public double calcularValor(int totalHoras){
        System.out.println("Voce permaneceu por:" + totalHoras);
        if(totalHoras < 24){
            System.out.println("Total a pagar:");
            return totalHoras*this.valorHora;
        }else{
            if(totalHoras < 720){
                double dias = totalHoras/24;
                System.out.println("Total a pagar:");
                return this.valorDiaria*dias;
            }else{
                double meses = totalHoras/720;
                System.out.println("Total a pagar:");
                return this.valorMes*meses;
            }
        }
    }
}
