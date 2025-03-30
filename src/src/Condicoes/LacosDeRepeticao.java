package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
       /*
      Vão repetir infinitamente ou até você atingir o parâmetro desejado.
     */

        int saldoParaPagarConta = 0;
        int pratosLavados = 1;
        int pratosParaLavar = 39;


        while(saldoParaPagarConta <= pratosParaLavar) {
            saldoParaPagarConta++;
            System.out.println("Pratos lavados: " + pratosLavados++);
        }
    }


}
