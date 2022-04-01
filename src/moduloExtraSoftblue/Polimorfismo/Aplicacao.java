package moduloExtraSoftblue.Polimorfismo;

public class Aplicacao {
    public static void main(String[] args) {

        //Cachorro c = new Cachorro() ;Animal c = new Cachorro()  //Aqui está acontecendo um casting implícito
        //quando eu troco a variável Cachorro para Animal
        //c.falar();

        //se mudar a referência de cachorro para animal, não irá funcionar o código
//        Animal a = new Cachorro();
//        Cachorro c = (Cachorro) a;
//        c.morder();
        //Fazendo o casting explícito o código irá funcionar; mas atenção!! Lembre-se de usar o InstanceOf para validar o casting

        //validando o Casting explícito
//        Animal a = new Cachorro();
//        if (a instanceof Cachorro) {
//        Cachorro c = (Cachorro) a;
//        c.morder();
//        }

        //O método falar da super classe nem sabe o que é o método sobrescrito tanto do objeto Cachorro quanto do Objeto Gato
        //Nesse caso é ótimo, pois esconde a implementação do código
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        falar(c);
        falar(g);

    }

    //qual a vantagem de não colocar métodos na minha SUPER CLASSE? veja o exemplo abaixo

    private static void falar(Animal a){
        a.falar();
    }

}