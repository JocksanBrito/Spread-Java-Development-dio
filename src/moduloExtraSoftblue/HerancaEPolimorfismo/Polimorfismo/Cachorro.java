package moduloExtraSoftblue.HerancaEPolimorfismo.Polimorfismo;

public class Cachorro extends Animal{

    @Override
    public void falar() {
        System.out.println("AUAU");
    }

    public void morder(){
        System.out.println("NHAC");
    }
}
