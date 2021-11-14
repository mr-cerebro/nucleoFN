class Carro {
    // atributos da class Carro()
    String marca;
    String cor;
    String modelo;
    int numPorta;
    int numIdent;
    double velocidadeMax;
    double velocidadeAtual;

    // métodos da class Carro()
    void ligar(){
        System.out.println("Carro Ligado :) !");
    }

    void desligar(){
        System.out.println("Carro Desligado :( !");
    }

    void acelerar(int valorIntesidade){
        if (velocidadeAtual < velocidadeMax)
            velocidadeAtual += 10 + valorIntesidade * 15 / 100;
        else
            velocidadeAtual = velocidadeMax;
    }

    void travar(int valorIntesidade){
        velocidadeAtual -= valorIntesidade * 50 / 100;
        if (velocidadeAtual < 0)
            velocidadeAtual = 0;
    }
}