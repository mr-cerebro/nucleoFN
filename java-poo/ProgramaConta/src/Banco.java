class Banco {
    public static void main(String[] args) {

        // Criar os objetos para class Conta()
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        // Atribuir os respectivos valores
        c1.titularConta = "Paulo Pessoa";
        c1.numConta = 12345;
        c1.saldoConta = 0.0;

        c2.titularConta = "Catarina Pessoa";
        c2.numConta = 123456;
        c2.saldoConta = 0.0;

        // Depositar
        c1.depositar(100000);
        c2.depositar(20000);

        // Imprimir
        c1.impimirDados();
        c2.impimirDados();

        // Sacar
        System.out.println();
        System.out.print("CONTA 1 - ");
        c1.sacar(70000);
        System.out.print("CONTA 2 - ");
        c2.sacar(25000);

        // Imprimir novamente
        c1.impimirDados();
        c2.impimirDados();
    }
}
