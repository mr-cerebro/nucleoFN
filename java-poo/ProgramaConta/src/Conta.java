class Conta {
    boolean estadoConta;
    String titularConta;
    int numConta;
    double saldoConta;

    //Criar construtor sem parâmetro
    Conta() {
        estadoConta = true;
    }

    //Criar construtor com parâmetro
    Conta(String nomeConta, int n_Conta) {
        estadoConta = true;
        titularConta = nomeConta;
        numConta = n_Conta;
    }

    Conta(String nomeConta, int n_Conta, double valorConta) {
        estadoConta = true;
        titularConta = nomeConta;
        numConta = n_Conta;
        saldoConta = valorConta;
    }

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
        System.out.println("Estado da conta: " + estadoConta);
        System.out.println("Nome do titular da conta: " + titularConta);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo da conta: " + saldoConta);
    }
}
