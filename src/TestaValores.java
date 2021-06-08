public class TestaValores {

    public static void main(String[] args) {
        Conta conta23 = new Conta(1234,5553);
        Conta conta2= new Conta(53214,6456);
        Conta conta3 = new Conta(61234,7435);

        //conta esta inconsistente
        conta23.setAgencia(-50);
        conta23.setNumero(-330);

        System.out.println("agencia " +conta23.getAgencia());
        System.out.println("numero "+conta23.getNumero());

        System.out.println(Conta.getTotal());

    }
}
