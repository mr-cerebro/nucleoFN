class Conta {
    String titularConta;
    int numConta;
    double saldoConta;

    void depositar(double valorDepositar){
        saldoConta += valorDepositar;
        System.out.println("SUCESSO! Depósito efectuado com sucesso :) !");
    }

    void sacar(double valorSacar){
        if(saldoConta > 0){
            if(saldoConta >= valorSacar){
                saldoConta -= valorSacar;
                System.out.println("SUCESSO! Valor descontado com sucesso :) !");
            }
            else{
                System.out.println("ERRO! Valor de saldo é inferior ao valor do saque :( !");
            }
        }
        else
            System.out.println("ERRO! Valor negativo :( !");
    }

    void impimirDados(){
        System.out.println();
        System.out.println("DADOS DA CONTA");
        System.out.println("Nome do titular da conta: " + titularConta);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo da conta: " + saldoConta);
    }
}
