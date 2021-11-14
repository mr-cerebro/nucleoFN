class Teste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.marca = "Hyundai";
        c1.cor = "Azul";
        c1.modelo = "I10";
        c1.numPortas = 4;

        c2.marca = "Toyota";
        c2.cor = "Verde";
        c2.modelo = "Land Cruiser";
        c2.numPortas = 5;

        System.out.println("Dados do Carro 1");
        System.out.println("Marca: " + c1.marca);
        System.out.println("Cor: " + c1.cor);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Nº de Portas: " + c1.numPortas);

        System.out.println();

        System.out.println("Dados do Carro 2");
        System.out.println("Marca: " + c2.marca);
        System.out.println("Cor: " + c2.cor);
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Nº de Portas: " + c2.numPortas);
    }    
}
