public class Conta {

     double saldo;
     int agencia;
     int numero;
     String titular;

     public void depositar(double valor){    //depositar valor na conta
          saldo += valor;
          System.out.println(saldo);
     }
     
     public void transeferir(Conta usuario,double valor){    //transferir valor para outra conta
          if (saldo <valor){
               System.out.println("nao foi possivel transferir");
          }else{
               usuario.depositar(valor);
               saldo =saldo-valor;
          }
     }

     public boolean sacar(double valor){         //sacar o dinheiro
          if (saldo < valor){
               return false;
          }else {
               saldo -=valor;
               System.out.println(saldo);
               return true;
          }
     }
     
}
