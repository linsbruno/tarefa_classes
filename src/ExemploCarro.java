/**
 * @author BrunoLins
 * @version 1.0
 */

public class ExemploCarro {

    public static void main(String[] args) {
        // Criando um objeto carro
        Carro meuCarro = new Carro();

        // Definindo as propriedades do carro usando os métodos setters
        meuCarro.setMarca("Toyota");
        meuCarro.setModelo("Corolla");
        meuCarro.setAno(2022);

        // Obtendo as propriedades do carro usando os métodos getters
        String marca = meuCarro.getMarca();
        String modelo = meuCarro.getModelo();
        int ano = meuCarro.getAno();

        // Exibindo as informações do carro
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
