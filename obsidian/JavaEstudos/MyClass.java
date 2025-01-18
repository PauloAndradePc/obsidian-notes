package ModificadoresAcessoJava;

public class MyClass {

    private int alpha; // acesso privado
    public int beta; // acesso publico
    int gamma; // acesso padrão

    // Não a problema em um membro de uma classe acessar um membro privado da mesma classe.


    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public void exibirAlpha(){
        System.out.println("O numero e: " + alpha);
    }


}
