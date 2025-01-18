## Método 

* Podemos dizer que o metodo contem uma ou mais instruções. Um metodo deve executar apenas uma  tarefa.
* Cada metodo tem seu nome próprio e com esse nome que podemos chamar esse metodo. 

```Java 
public String transformarMaiscula(){
// dentro de encontra o corpo do metodo
}
```

Também temos os métodos que não retornam nenhum valor, no caso esse podemos chamar de #void 
```Java 
void String testandoMetodo(){
// aqui dentro se enconta o metodo
}
```

### Metodos que recebem parâmetros
Em Java temos métodos que recebem parâmetros, conhecidos como uma sequência de pares separados por virgulas que são compostos por ==tipo== e ==identificador== 

Podemos dizer que parâmetros são basicamente variáveis que recebem o valor do #argumentos  passados para o metodo quando eles são chamados.
```Java 
  
  
    // Criando metodo com parâmetros  
      public static int  testandoMetodoParametos(int a, int b){  
          return a + b;// Como podemos ver o metodo ele retornou o valor atribuido             no parâmetro.  
  
    }  
    public static void main(String[] args) {  
  
          // Chamando o metodo que criamos.  
        int resultado = testandoMetodoParametos(5, 55);  
        System.out.println(resultado);
```

* Criamos um metodo que faz a soma de a + b.
* O metodo ==testandoMetodoParametos== recebe dois parâmetros do tipo ==int== 
* No caso esse metodo ele tem retorno, para fazermos isso utilizamos a palavra #return 
* No MAIN chamamos o metodo ==testandoMetodoParametos( 5, 55 )== que retorna o valor da soma. 

Podemos notar que ao criamos um metodo devemos declarar dois parâmetros ==Exemplo : parâmetros do tipo int==  

--------------------------------------------------------------------------
# Construtores
Um construtor inicializa um objeto quando e criado. #Construtor se caracteriza por ter o mesmo nome da sua classe.

Normalmente utilizamos o construtor para fornecer valores para as variáveis de instancias que criamos.  Quando definimos nosso próprio construtor.

### Construtor Simples 
``` Java 
public class ConstrutorSimples {  
  
    int x;  
  
    // Cosntrutor da Classe  
    public ConstrutorSimples() {  
        x = 10;  
    }  
  
    public static void main(String[] args) {  
        ConstrutorSimples c = new ConstrutorSimples();  
  
        System.out.println(c.x);  
    }    
}

}
```
* Criamos a variável do tipo int x
* Atribuímos ao construtor o valor de 10 na variável x, que passou a valer 10
* Quando chamamos devemos usar a palavra #new quando um objeto e criado.

No construtor simples não utilizamos argumentos, sua utilidade e apenas chamar o construtor da superclasse.

### Construtor parametrizados
As vezes precisaremos de construtores que precisem de um ou mais parâmetros. Podemos adicionar o parâmetro em um construtor da mesma forma que fazemos com os métodos. 




