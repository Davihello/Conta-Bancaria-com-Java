public class Main {
    public static void main(String[] args) {
        conta p1 = new conta();
        p1.setNumConta(111);
        p1.setDono("David");
        p1.abrirConta("CP");
        p1.pagarMensal();
        p1.estadoAtual();
    }

}