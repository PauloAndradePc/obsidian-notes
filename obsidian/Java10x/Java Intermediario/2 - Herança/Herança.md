# Principais habilidade e conceitos
* Entender os aspectos básicos da herança
* Chamar construtores de superclasses
* Usa *super* para acessar membros da superclasse
* Criar uma hierarquia de classes com vários níveis
* Saber quando os construtores são chamados
* Entender as referências de superclasses a objetos da subclasse 
* Sobrepor métodos
* Usar métodos sobrepostos para executar os despachos dinâmicos de métodos
* Usar classes abstratas 
* Usar *Final* 
* Conhecer a classe *Object* 

Herança e um dos três pilares principais básicos da programação OOP, porque permite a criação de classificações hierárquicas. Usando a herança, você pode criar classes geral que defina características comuns a um conjunto de itens relacionados. Essa classe poderá então ser herdada por outras classes mais especificamente, <span style="background:rgba(14, 125, 160, 0.55)">podemos adicionar cada uma delas alguma característica exclusiva.</span> A classe que e herdada, conhecida como #superclasse.
A classe que e herda se chama de #subclasse.

## Aspectos básicos de herança
Em Java, a herança permite com que uma classe incorpore outra em sua declaração. Isso e feito com o uso da palavra #extends <span style="background:#b1ffff">extends</span> 

Comecemos com um exemplo curto que ilustra vários dos recursos chave de herança. O programa a seguir cria uma #superclasse  chamada *TwoDShape* que armazena a largura e a altura de um objeto bidimensional, e uma #subclasse chamada *Tryangle* 
[Explicação exercicio](file:///G:/Meu%20Drive/CursoJava/Aula%2004%20-Herança%20-%20O%20primeiro%20pilar%20da%20orientaçao%20a%20objeto/Herança/Aspectos%20basicos%20de%20herança/TwoDShape.java)

## Acesso a membros e a herança
Em Java herdar uma classe *não* invalida a restrição de acesso *private*.
Logo, ainda que uma subclasse inclua todos os membros da sua superclasse, não poderá acessar os membros declarados como *private*. No exemplo que demos la em cima, caso width e heigth forem transformada em *private* TwoDShape, Triangle não poderá acessa-las. <span style="background:rgba(16, 206, 200, 0.5)">Membros privados não podem ser herdados</span>

Lembre-se que os membros de uma classe que foi declarado como *private* permanecera sendo privado de sua classe.<span style="background:rgba(16, 206, 200, 0.5)"> Com isso esses membros não poderam ser acessados por nenhum codigo de fora da classe, incluindo subclasses</span>
Normalmente os programadores Java utilizam *métodos acesadores* para dar acesso aos membros provados de uma classe. **Aqui esta uma versão atualizada das classes TwoDShape e Triangle que usam métodos para acessar as variáveis de instância privadas Width e heigth*.*
[Abrindo arquivo Info.java](file:///G:/Meu%20Drive/CursoJava/Aula%2004%20-Herança%20-%20O%20primeiro%20pilar%20da%20orienta%C3%A7ao%20a%20objeto/Herança/Acesso%20a%20membros%20e%20a%20heran%C3%A7a/Info.java)

## Construtores e herança
Em uma hierarquia, e possível que tanto as superclasses quanto as subclasses tenham seus próprios construtores. Isso levanta uma questão importante: Qual construtor e responsável pela construção de um objeto da <span style="background:rgba(16, 206, 200, 0.5)">subclasse </span> - o da <span style="background:rgba(16, 206, 200, 0.5)">superclasse</span>, o da subclasse ou ambos? 
**O construtor da superclasse constrói a parte do objeto referente a superclasse e o construtor da subclasse constrói a parte da subclasse**.

 Tanto a superclasse quanto a subclasse definem construtores, o processo e um pouco mais  complicado, porque dois construtores devem ser executados. Quando ocorre isso devemos usar a palavra-chave, #super

A primeira chama um construtor da superclasse. A segunda e usada para acessar um membro da superclasse ocultado pelo membro de uma subclasse.

## Usando *super* para chamar construtor da superclasse 
Uma subclasse pode chamar um construtor definido por sua superclasse usando a forma de *super* a seguir: 
```Java 
super(lista-parâmetros);
```
A lista de parâmetros especifica qualquer parâmetro requerido pelo construtor na superclasse. A primeira instrução executada dentro do construtor de uma subclasse deve sempre ser *super()* e usada, considere a versão de **TwoDShape** do programa abaixo. Ele define um construtor de inicializa Width e height
[exemplo](file:///G:/Meu%20Drive/CursoJava/Aula%2004%20-Heran%C3%A7a%20-%20O%20primeiro%20pilar%20da%20orienta%C3%A7ao%20a%20objeto/Heran%C3%A7a/UsandoSuperParaChamarConstrutoresDaSuperclasse/TwoDShape.Java)

Revisemos o conceito chave de *super()*. Quando uma ***subclasse*** chama *super()*, esta chamando o construtor da **superclasse** imediatamente acima da classe chamadora. Além disso *super()* deve ser sempre a primeira instrução a ser executada dentro de um construtor da **subclasse**.

# Usando classes #abstrato 

O método abstrato e criado pela especificação do modificador do tipo *abstract*. Ele não contem corpo e, portanto, não e implementado pela superclasse. Logo, uma subclasse deve sobrepô-lo não pode apenas usar versões definidas na superclasse. Para declarar um método abstrato, use esta forma geral:
```Java
abstract tipo nome(lista-parâmetros);
```
Como ficou claro, não há um corpo de método presente. O modificador *abstract* só pode ser usado em métodos de instância. Ele não pode ser aplicado a métodos *Static* ou *construtor*. 

**Uma classe que contem um ou mais métodos abstratos também deve ser declarada como abstrata perecendo sua declaração** *class* **com o modificador** *abstract* 

Quando uma subclasse herda uma uma classe abstrata, ela deve implementar todos os métodos da superclasse. Portanto o atributo *abstract* e herdado ate uma implementação completa ser obtida.