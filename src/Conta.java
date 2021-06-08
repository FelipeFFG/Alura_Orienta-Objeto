public class Conta {

     private double saldo;
     private int agencia;
     private int numero;
     private Cliente titular;
     private static int total;  //static significa que é um atributo da classe e nao do objeto.

     public void depositar(double valor){    //depositar valor na conta
          saldo += valor;
     }



     public Conta(int agencia,int numero){//construtor
          total++;
          this.agencia = agencia;
          this.numero =numero;
          System.out.println("estou criando uma conta");
     }
     
     public boolean transeferir(Conta usuario,double valor){    //transferir valor para outra conta
          if (saldo <valor){
               return false;
          }else{
               usuario.depositar(valor);
               saldo =saldo-valor;
               return true;
          }
     }

     public boolean sacar(double valor){         //sacar o dinheiro
          if (saldo < valor){
               return false;
          }else {
               saldo -=valor;
               return true;
          }
     }

     public double getSaldo(){
          return saldo;
     }


     public int getNumero() {
          return numero;
     }

     public void setNumero(int numero) {
          if (numero <=0){
               System.out.println("nao pode numero menor ou igual a 0");
               return;
          }
          this.numero = numero;
     }

     public void setTitular(Cliente titular) {
          this.titular = titular;
     }

     public int getAgencia() {
          return agencia;
     }
     public void setAgencia(int agencia) {
          if(agencia <= 0){
               System.out.println("nao pode valor menor igual a 0");
               return;
          }
          this.agencia = agencia;

     }

     public Cliente getTitular() {
          return titular;
     }

     public static int getTotal() {
          return Conta.total;
     }
}
