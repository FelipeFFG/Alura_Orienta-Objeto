public class TestaContasemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.saldo);

        // nao vai dar pois nao foi criada a variavel Conta titutlar.
        //contaDaMarcela.titular.nome = "Marcela";
        //System.out.println(contaDaMarcela.titular);




        // uma forma de criar um novo objeto e referenciar o titular a instancia criada.
        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";  //atribuindo um nome a  cliente titular, que esta linkada a conta
        System.out.println(contaDaMarcela.titular.nome);





    }
}
