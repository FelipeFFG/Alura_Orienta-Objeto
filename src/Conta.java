public class Conta {

     private double saldo;
     private int agencia;
     private int numero;
     private Cliente titular;

     public void depositar(double valor){    //depositar valor na conta
          saldo += valor;
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


}
