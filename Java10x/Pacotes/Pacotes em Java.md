
# Pacotes
Em programação, utilizamos pacotes par agrupar partes relacionadas de um programa. Em Java podemos fazer isso utilizando pacote.

* <span style="background:#b1ffff">As classes definidas dentro de um pacote devem ser acessadas com o uso do nome de seus pacotes</span>.
* Classes definidas dentro de um pacote podem ser tornar privadas desse pacote sem poder ser acessadas por códigos de fora dele. Portanto, o pacote fornece um meio pelo qual classes podem ser encapsuladas.

### Definindo um pacote 
Em Java, todas as classes possuem algum pacote. Mesmo quando não especificamos uma instrução *package*, o programa ele adiciona o pacote padrão (global) . *Pacotes padrões (global) não tem nome, o que o torna transparente.* 

Para criamos um *package*, devemos inserir o comando ``package``. Uma vez que um pacote defini um espaço de nomes, os nomes das classes que você inserir no arquivo se tornarão parte do espaço de nomes do pacote.
Esta e a forma geral da instrução ``package``: 
```Java 
package meu.pacote.exemplo;
```
como podemos notar, o nome do nosso pacote `exercicio.heranca;`

<font color="#58d642">por exemplo: </font>
```Java 
src -> meu -> pacote -> exemplo -> criando a classe: MinhaClasse.Java
```
Isso e o que exatamente o que o livro descreve,<span style="background:#b1ffff"> o diretorio preecisa seguir a hierarquia definida pelo nome do pacote</span>. Assim o, Java consegue localizar corretamente as classes durante a compilação e execução.
 
## Pacotes e o acesso a membros
 A visibilidade de um elemento e e determinada por sua especificações de acesso *private*, *public*, *protected* ou padrão.

Se o membro de uma classe não tiver um modificador de acesso explicito, todos poderão ser vistos dentro de seu pacote, mas não poderá ser visto fora dele.
Membros declarados explicitamente como *public* podem ser vistos em todos os locais.

Um membro #private só pode ser acessado por outros membros de sua classe. Um membro especificado como #protected poder ser acessado dentro de seus pacotes e por todas as suas subclasses, inclusive subclasses de outros pacotes.

### Exemplo de acesso a pacote
Tanto `book` quanto `BookDemo` estavam no mesmo pacote, logo, não havia problema em `BookDemo` usar `Book`, porque e concedido o privilegio de acesso padrão a todos os membros do mesmo pacote.

Caso `Book` estivesse em um pacote diferente, ele não teria acesso a `Book` e seria negado. Para disponibilizar `Book` para outros pacotes, precisamos fazer três alterações.
* Em primeiro  devemos declarar `Book` como *public* fazendo com o que ele seja visível fora de `bookpack`.
* Em segundo lugar, devemos tornar o seu *construtor* como *public*, e devemos tornar seu método `Show()` tem que ser *public*.

```Java 
package bookpack;  
  
public class Book { // --> Book e seus membros devem ser public para serem usados por outros pacotes.  
    private String title;  
    private String author;  
    private int pubDate;  
  
    //Agora e publico.  
    public Book(String title, String author, int pubDate) {  
        this.title = title;  
        this.author = author;  
        this.pubDate = pubDate;  
    }  
  
    //Agora e publico.  
    public void Show(){  
        System.out.println(title);  
        System.out.println(author);  
        System.out.println(pubDate);  
        System.out.println();  
    }  
}
```
[Exemplo](file:///G:/Meu%20Drive/Java10x/Estudo%202%20-%20Pacotes%20e%20interfaces/Pcotes%20e%20acesso%20a%20membros/BookDemo.Java ) 

Para usamos ``Book``, a partir de outro pacote, devemos empregar a instrução #import. Por exemplo, esta e uma classe chamada `UseBook`, que esta contida no pacote `Bookpackext`. Ela qualifica `Book` totalmente para usa-la.  
```Java 
package otherpack;  // Pacote do arquivo Main.java  
  
import bookpack.Book;  // Importação da classe Book  
  
public class Main {  
    public static void main(String[] args) {  
        // Criando um objeto da classe Book  
        Book myBook = new Book("Java Programming", "John Doe", 2022);  
  
        // Chamando o método Show() da classe Book  
        myBook.Show();  
    }  
}
```
Como podemos notar, fizemos o uso da palavra *import* --> digitamos o nome do pacote e no nome da classe. [Usando a partir de outro pacote](file:///G:/Meu%20Drive/Java10x/Estudo%202%20-%20Pacotes%20e%20interfaces/Pcotes%20e%20acesso%20a%20membros/otherpack.Java)

