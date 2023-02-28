public class programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.numero=1;
        minhaConta.titular="Leo Valle";
        minhaConta.saldo=600;

        Conta minhaConta2;
        minhaConta2 = new Conta();
        minhaConta2.numero=2;
        minhaConta2.titular="João Mil";
        minhaConta2.saldo=390;

        System.out.println("Referente a conta: " +minhaConta.numero);
        System.out.println("Titular: " +minhaConta.titular);
        System.out.println("O saldo da conata é: " +minhaConta.saldo);

        System.out.println(" \n");

        System.out.println("Referente a conta: " +minhaConta2.numero);
        System.out.println("Titular: " +minhaConta2.titular);
        System.out.println("O saldo da conata é: " +minhaConta2.saldo);
        


    }
}
