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

Quando chamamos o método `Contains()` em um #ArrayList ele verifica se uma determinada palavra esta dentro da lista. Método `contains()` retorna uma valor #booleano , caso o elemento esteja presente ele retorna como #true se não estiver presente ele retorna como #false 

