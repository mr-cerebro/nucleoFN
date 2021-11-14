class Corrida {
    public static void main(String[] args) {
        Carro meuCarro  =  new Carro();
        Carro carro = new Carro();

        meuCarro.marca  =  "Mustang";
        meuCarro.cor  =  "Cinza";
        meuCarro.modelo = "MS-21";
        meuCarro.numPorta = 4;
        meuCarro.numIdent = 0021;
        meuCarro.velocidadeMax = 100;
        meuCarro.velocidadeAtual = 0;

        carro.marca = "Ferrari";
        carro.cor = "Dourado";
        carro.modelo = "FE-21";
        carro.numPorta = 3;
        carro.numIdent = 0020;
        carro.velocidadeMax = 100;
        carro.velocidadeAtual = 0;

        // Carro 1
        System.out.println("Marca do carro: " + meuCarro.marca);
        System.out.print("Estado do carro: ");
        meuCarro.ligar();
        meuCarro.acelerar(100);
        System.out.println("Velocidade atual do carro: " + meuCarro.velocidadeAtual);
        System.out.println();

        // Carro 2
        System.out.println("Marca do carro: " + carro.marca);
        System.out.print("Estado do carro: ");
        carro.ligar();
        carro.acelerar(100);
        System.out.println("Velocidade atual do carro: " + carro.velocidadeAtual);
        System.out.println("Ao longo da travagem!");
        carro.travar(10);
        System.out.println("Nova velocidade do carro: " + carro.velocidadeAtual);
    }
}
