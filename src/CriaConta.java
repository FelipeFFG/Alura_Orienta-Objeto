public class CriaConta {

    public static void main(String[] args) {
        /*
        //primeira conta
       Conta primeiraConta = new Conta();  //instanciação de uma conta
       primeiraConta.saldo =200;   // atribuição de saldo a instacia primeiraConta
       System.out.println(primeiraConta.saldo);
        // somando 100 ao valor ja existente
       primeiraConta.saldo +=100;
       System.out.println(primeiraConta.saldo);

       System.out.println(primeiraConta.titular); // como nao foi aderido um valor para titular, ele adere o valor default sendo null  a nao ser que tenha sido aderido o valor dentro da classe
        System.out.println(primeiraConta.numero);  //como nao foi aderido um alor ao numero, ele adere o valor default sendo 0 a nao ser que tenha sido aderido o valor dentro da classe.

       //segunda conta;
       Conta segundaConta = new Conta();
       segundaConta.saldo = 50;
        System.out.println("primeira conta tem " + primeiraConta.saldo + " reais");
       System.out.println("segunda conta tem " + segundaConta.saldo + " reais");
*/
         /*
        Conta primeiraConta = new Conta();
        primeiraConta.saldo=300;
        System.out.println("primeira conta  "+primeiraConta.saldo + " saldo ");

        Conta segundaConta = primeiraConta;   //referencia o espaço de memoria  da primeiraConta para a segundaConta, ou seja as duas contas apontam para o mesmo objeto.
        segundaConta.saldo = 9000;
        System.out.println(segundaConta.saldo);

        System.out.println("primeira conta  "+primeiraConta.saldo + " saldo ");
        
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
*/

        /*
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.depositar(50);
        boolean conseguiuRetirar = contaDoPaulo.sacar(20);
        System.out.println("P - "+ contaDoPaulo.saldo);



        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositar(160);
        System.out.println( "M - " + contaDaMarcela.saldo);
        contaDaMarcela.transeferir(contaDoPaulo,80);
        System.out.println("P - "+ contaDoPaulo.saldo);
        System.out.println( "M - " + contaDaMarcela.saldo);

        if (contaDaMarcela.transeferir(contaDoPaulo,900)){
            System.out.println("transferencia com sucesso");
        }else{
            System.out.println("faltou dinheiro");
        }
    }

         */
    }
}
