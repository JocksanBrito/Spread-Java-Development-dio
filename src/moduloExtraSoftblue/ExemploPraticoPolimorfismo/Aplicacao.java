package moduloExtraSoftblue.ExemploPraticoPolimorfismo;

public class Aplicacao {
    public static void main(String[] args) {

        PreparadorBebida preparador = new PreparadorBebida();

//        LeiteQuente leite = new LeiteQuente();
//        preparador.prepararBebida(leite);

        Refrigerante refrigerante = new Refrigerante();
        preparador.prepararBebida(refrigerante);


    }
}
