package moduloExtraSoftblue.Herança;

public class Aplicacao {
    public static void main(String[] args) {

        System.out.println("CARRO");
        Carro v = new Carro();
        v.setMarca("Volks");
        v.setModelo("Gol");
        v.setAno(2005);
        v.setQuatroPortas(true);
        v.imprimirDados();
        //        v.buzinar();


        System.out.println("MOTOCICLETA");
        Motocicleta m = new Motocicleta();
        m.setModelo("Dezinha");
        m.setMarca("Caloi");
        m.setAno(2009);
        m.imprimirDados();
//        m.empinar();
//        m.buzinar();


//        Caminhao cam = new Caminhao();
//        cam.buzinar();

//        v.imprimirDados();


    }
}
