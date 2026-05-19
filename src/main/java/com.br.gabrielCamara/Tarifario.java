public class Tarifario {
    private double valorHora = 10.0;
    private double valorDiaria = 240.0;
    private double valorMes = 7200.0;

    public void calcularValor(int totalHoras){
        if(totalHoras <=0){
            System.out.println("Voce permaneceu por menos de uma hora, mas voce pagara:");

            System.out.print(this.valorHora + " R$");
        }else{
            System.out.println("Voce permaneceu por:" + totalHoras);
            if(totalHoras < 24){
                System.out.println("Total a pagar:");
                System.out.println(totalHoras*this.valorHora + ( " R$"));
            }else{
                if(totalHoras < 720){
                    double dias = totalHoras/24;
                    System.out.println("Total a pagar:");
                    System.out.println(this.valorDiaria*dias + " R$");
                }else{
                    double meses = totalHoras/720;
                    System.out.println("Total a pagar:");
                    System.out.println(this.valorMes*meses + " R$");
                }
            }
        }
    }
}
