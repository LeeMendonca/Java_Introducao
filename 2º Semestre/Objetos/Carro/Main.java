public class Main {
    public static void main(String[] args) {
        
        //Criando objetos da classe Clarro.
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        //Atrinuindo valores aos atributos dos objetos.
        carro1.marca = "Toyota";
        carro1.modelo = "Carolla";
        carro1.ano = 2020;
        
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2019;
        
        //Chamando métodos dos objetos
        carro1.ligar();     //Saída: O carro está ligado.
        carro2.acelerar();  //Saída: O carro está acelerando.
    }
}