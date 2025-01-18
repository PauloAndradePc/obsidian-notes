
# Método **is.Empty**

O método #isEmpty em Java e utilizado para verificar se uma estrutura de dados, ou ate mesmo coleções e ou String estão vazias. Podemos notar que esse metodo ele pertence a diferentes tipos de classes, e dependendo do contexto. Irei citar alguns exemplos a seguir: 

### 1. Usando *isEmpty* com String
Quando utilizamos esse método em uma String, ele nos retorna um valor booleano que indica se a string esta vazia. ==Uma String e considerada vazia caso seu comprimento seja de 0==  

```Java 
String teste = "";

if(teste.isEmpty()){

System.out.println("String esta vazia! ");
}else {
System.out.println("A string não esta vazia! ");
}
```
Como podemos observar usamos o método #isEmpty para verificar se a String estava vazia. Ao executarmos esse método o programa nos informar a que a ==String está vazia== 

### 2. Usando #isEmpty como um (ArrayList) 

Podemos utilizar o o #isEmpty junto com um ArrayList porque dentro de sua classe ele possui esse método. Esse método verifica se contem elementos ou não, ele nos retorna um valor `true` ou `false` .
Por exemplo : 
```Java
import java.util.ArrayList;
import java.util.List;

List<String> lista = new ArrayList<>();
if (lista.isEmpty()) {
    System.out.println("A lista está vazia!");
} else {
    System.out.println("A lista contém elementos!");
}

```



