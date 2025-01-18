
## Declarando um Array;
Um array e uma lista de itens de dados, <span style="background:#d4b106">todos do mesmo tipo</span> 

A declaração de um array segue o mesmo estilo de uma variável de qualquer tipo, mas quando declaramos um #array devemos inserir o par de colchetes, logo depois de adicionarmos o tipo de dado. Exemplo de declaração de um array de valor #int 
``` Java 
int[] salesFigure;
```

Arrays unidimensionais são os mais comuns em Java. Um array tem como vantagem a facilidade em tratar todos os dados de uma forma eficiente. Com isso evitamos o código #boilerplate

Podemos criar um array de duas formas diferentes para armazenar os numeros , com um array de inteiros:
``` Java 
int[] idNums;
int idNumes[];
```

1 -  ==int[] idNums;==  Estamos nos referindo a uma forma de declaração mais recente e moderna, com isso deixamos claro que ao colocarmos idNums estamos nos referindo a um array de inteiros.

2. int idNumes[ ]; Essa declaração podemos notar que e  antiga. Hoje em dia poucas empresas utilizam , continua tendo o mesmo proposito porem a diferença e que a notação do array vem após o nome da variável.

### Nomeação de um arrays
Arrays representam grupos de itens, com isso nos programadores seguimos uma convenção de palavras:
* Array armazenam múltiplos itens, costumamos nomeá-los usando sempre o substantivo no plural,  como CarroVendas; adicionando o ( S ) sempre no plurar.* 

### Inicializando um Array
Para iniciarmos um array temos duas alternativas:

Estamos inicializando um array de numeros inteiros, caso nao saibamos o valor a ser impresso podemos declarar dessa forma: 
Forma 1: 
```Java 
int[] salesFigures = new int[] {1,2,3,4,5,6,7,8,9,10};
```

Aqui estamos inicializando um array de numeros inteiros, neste caso estamos inicializando com o tamanho já especificado <span style="background:#d4b106">estamos inicializando com o tamanho já especificado</span>
``` Java 
int[] salesFigures = new int[3];

// Saida 
salesFigures[0] = 1; 
salesFigures[1] = 2; 
salesFigures[2] = 3; 
```

### Imprimindo um array
 Podemos imprimir o array, com o uso de ==loops== e usando ==toString== 

1. Utilizando o loop foreach ( for )
```Java 
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int num : array) {
            System.out.println(num);
        }
    }
}
````

2. Utilizando ==Arrays.toString();==

````Java 
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
    }
}
````
* Aqui estamos imprimindo um array de uma vez só, sem precisar ficar inteirando manualmente.

### Atribuindo valor a um elemento array
Em Java podemos atribuir diferentes valores a um único elemento de um array através do ==índice== 

Exemplo:
```Java 
int[] array {10, 12, 13, 32, 44}

// Atribuindo um novo valor ao primeiro elemento
array[0] = 100;

// Impriminso os valores do array
for(int numero : array){
System.out.println(numero);
}

// Saida 

100
12
13
32
44

```

 * Como podemos ver, atribuímos um novo valor para o array, através do índice [ 0 ]. Antes disso era 10 , após atribuirmos ficou no valor de 100

# Arrays multidimensionais 
O mais usado e o array unidimensional, mas temos alguns casos que se usam os array multidimensionais, nesse caso arrays multidimensionais  se caracterizam por terem duas ou mais dimensões<span style="background:#d4b106">arrays multidimensionais  se caracterizam por terem duas ou mais dimensões</span>

# Arrays bidimensionais
O array #bidimensionais se caracteriza por ser uma lista de arrays #unidimensionais 

### Chamando array bidimensional
 ```Java 
 int table[] [] = new int [10] [20];
```

Em outras linguagem de programação se utilizam virgulas, em Java cada dimensão tem seu próprio conjunto de colchetes.


# Array de três ou mais dimensões 
Em Java podemos criar arrays com com mais de uma dimensão. 
``` Java 
int multidim[] [] [] = new tipo *tamanho1* *tamanho2* *tamanho3* ;
```

Criando um array tridimensional inteiro de 4 x 10 x 3:
```java
int multidim[][][] = new int [4] [10] [3];
```

## Usando o membro lenght 
Já que os #array são implementados como objetos, cada arrays tem uma variável de instância #length  associada que contem o numero de elementos que ele pode conter.
#length contem o tamanho do #array 
[[LengthDemo.java | Código utilizando Length]]


## O laço for de estilo for-each
Quando trabalhamos com arrays, e comum encontrarmos situações em que um array deve ser examinado do inicio ao fim, elemento por elemento. A mesma coisa acontece quando queremos calcular a media, tanto na busca de um valor, na copia de um array, e assim por diante, Java definiu uma segunda forma do laço for que otimiza a operação.

A segunda forma de **for** implementa uma laço de estilo #for-each. Um laço for-each percorre um conjunto de objetos, como por exemplo um array, de maneira #sequencial . O estilo for-each de for também chamado de *laço* for *melhorado*. Os dois termos são bem conhecidos, e muito utilizados neste livro.

A forma geral do laço for-each melhorado e mostrado a baixo.
```Java 
for(tipo itr-var : conjunto) bloco de intrução 
```
* Tipo - especifica o tipo exemplo: ==int, double ou String ==
*  **var-iter** - especifica o nome de uma variável de iteração que receberá os elementos de um conjunto;*

O laço **for** de estilo for-each muito utilizado por automatizar o laço anterior, com ele não precisamos adicionar o contador de laço. Assim determinando o valor inicial e final e indexando manualmente o nosso #array . Por exemplo, aqui esta o fragmento anterior reescrito com o uso de uma versão for-each de **For** 
```Java 
int nums [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

int sum = o;
 for (int x : sums) sum += x;
 
```
A cada passagem do laço, **==x==** recebe automaticamente um valor igual ao próximo elemento de *==nums==* 

Vejam um programa inteiro que demonstra a versão de estilo for-each de **for** que descrevi.
```Java 
int nums [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
int sum = o;

// Usando o laço for para somar os valores.
 for (int x : sums){
 System.out.println("Value is: " + x);
 sum += x;
 }
System.out.println("A somatoria dos numeros deu : " + sum);

```

# ArrayList

## Listas e uma estrutura de dados: 
* Homogênea (dados do mesmo tipo ) ou seja caso a lista seja do tipo #int tudo que for em relação a ela será do tipo int. Dentro de uma #lista serão guardados  dados idênticos. 
* Ordenadas (elementos são acessados por meio de posições) ela sempre começa na posição 0 .
* Em listas você inicia ela vazia, e conforme você vai precisando você pode ir adicionando, removendo ou alterando um elemento.

**List** e uma (interface) a interface nao pode ser instanciada, precisaremos de uma classe  que implemente essa interface.

Para instanciar um tipo que e #List preciso de uma classe que implemente essa interface, por exemplo: 

A interface #List e implementada pelas classes abaixo:
#Vector - um array redimensionável com sincronização segura.
#ArrayList - um array mais performático.
#LinkedList - uma lista encadeada com mais recursos de inserção de elementos.

# **Diferença de Arrays e Listas 

## 1. Tamanho:
**Array**: Tem tamanho fixo, com array podemos declarar e iniciar com valores ja declarados.
```Java 
int[] teste = new int[10] // Estamos iniciando o array com 10 elementos.
```
* **List**: Sempre se inicializa vazia, com isso contendo um **tamanho dinâmico**. Podendo adicionar, remover  e com isso seu tamanho e ajustado automaticamente.*
```Java 
List<tipo> variavel(nome) = new ArrayList();
```

## 2. Tipos de dados
**List**: podemos armazenar apenas  **objetos** . Caso queiramos trabalhar com tipos primitivo, devemos utilizar classes empacotadores, como #Integer no lugar de #int .

## 3. Funcionalidade 
Em #List podemos fazer a manipulação dos dados de uma forma mais fácil, podemos fazer isso utilizando, #add, #remove, #contains 

### Utilizando a operação **add** 
Para adicionarmos algum elemento em nossa #List podemos utilizar a palavra #add, como podemos ver no exemplo abaixo: 
```Java 
List<Interger> teste = new ArrayList< >();

// Adicionando elementos 
teste.add(); // Dentro do parenteses escrevemos o numero que queremos adicionar.

// A saida desse programa vai ser o numero que adicionamos. 
```

### Utilizando a operação **remove** 
Para removermos algum elemento de nossa lista, devemos utilizar a operação #remove , sua sintaxe e parecida com a operação de #add. Ao invés de escrevermos a palavra add, nos devemos substituir ela pela palavra #remove,  por exemplo: 
```Java 
List<String> lista = new ArrayList<String>();

//Elementos adicionados
System.out.println("Adicionando elementos na lista");  
lista.add("Paulo");  
lista.add("Carlos");

//Removendo o elemento (Carlos) da lista.  
System.out.println("Removendo elementos da minha lista");  
lista.remove("Carlos");  
```
Como podemos analisar o elemento "Carlos" foi removido da nossa lista. 
### Tamanho da **lista** 
Para sabermos o tamanho da lista, utilizando a palavra ==size() ==
```Java 
//Como ver o tamanho da nossa lista, utilizando a palavra (size)
System.out.println("Tamnho da Lista: " + lista.size());
```
A palavra #sise esta sendo utilizada quando nos vamos imprimir algo relacionado a nossa lista.

Importante lembrar que quando formos fazer o uso dessa palavra devemos adicionar o *Nome da nossa lista* seguindo de um *ponto* e por fim devemos adicionar a palavra *size()* 

### Inserindo elemento entre os elementos
Para inserirmos elementos em nossa lista, ou seja substituir algo podemos fazer da seguinte forma : 
```Java 
//Inserindo um elemento entre os elementos da lista.  
System.out.println("Inserindo um elemmento entre os elementos da minha lista: ");  
lista.add(2, "Arthur");
```
Neste exemplo, podemos ver que o que fizemos foi utilizar a operação de #add como já tínhamos vistos, porem podemos ==notar que dentro do parêntese colocamos o numero 2 e o nome que queremos que seja inserido ==

* O numero (2) esta representando o #índice , isso significa que estamos querendo que o programa acesse o ==índice (2)== e dentro do índice adicione o #elemento"Arthur" 

![[ListasEmJava 2.java]]

### Utilizando o #contains  em Java 

O metodo `Contains()` e utilizado em Java para sabermos se um elemento especifico esta presente em uma #Coleção (ArrayList)

Quando chamamos o metodo `Contains()` em um #ArrayList ele verifica se uma determinada palavra esta dentro da lista. Método `contains()` retorna uma valor #booleano , caso o elemento esteja presente ele retorna como #true se não estiver presente ele retorna como #false 

