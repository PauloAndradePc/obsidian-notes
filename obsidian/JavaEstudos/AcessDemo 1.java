package ModificadoresAcessoJava;

public class AcessDemo {

    public static void main(String[] args) {

        // Chamando a classe, instanciando
        MyClass ob = new MyClass();

          // Definindo o valor do campo 'numero' através do setter
        ob.setAlpha(10);
        // Exibindo o valor de 'numero' usando o getter ou diretamente com o metodo 'exibirNumero'
        System.out.println("O número é: " + ob.getAlpha());  // Usando o getter
        ob.exibirAlpha();  // Usando o metodo da própria classe

        // Não podemos acessar o 'Alpha' dessa forma:

          // ob.Alpha = 10; Não podemos acessar desta maneira, Alpha e privado
    }
}
