Caso eu crie uma classe abstrata e não posso criar um objeto diretamente dela, podemos chamar essa classe abstrata de *superclasse*. Por ser abstrata, ==ela não pode ser estanciada==, ou seja, não podemos criar objetos diretamente dessa classe. Agora, se eu estender a classe **Hokage** de uma classe #abstrata, ==todos os objetos criados a partir dessa classe deverão seguir as regras que essa superclasse impões.== 

Por exemplo, ao criar a classe **Hokage**, eu posso garantir que qualquer classe que a estenda obrigatoriamente implementara determinados métodos  ou características.
Com isso será obrigatoriamente seguir todas as características daquela classe *abstrata*.

==Apenas as classes que estendem poderão ser instanciadas==

# Deixando métodos abstratos 
Em Java nos podemos deixar métodos abstratos. ==Um método abstrato e um método que e declarado na classe abstrata, mas não possui implementação==.
Ela apenas define a assinatura do método , como (Nome, parâmetros e tipos de retorno) 
Tem como objetivo garantir que as classes que estenderem a classe abstrata implementem esse método, fornecendo uma implementação concreta para ele.

### Definindo a classe abstrata 
Para definirmos devemos utilizar a palavra #abstract , e a classe que ela se encontra deve ser abstrata também.

```Java 
abstract class Animal {
    // Método abstrato
    abstract void fazerSom();

    // Método normal, pode ter implementação
    void respirar() {
        System.out.println("O animal está respirando.");
    }
}

class Cachorro extends Animal {
    // Implementação do método abstrato
    void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

class Gato extends Animal {
    // Implementação do método abstrato
    void fazerSom() {
        System.out.println("O gato mia.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom(); // Saída: O cachorro late.
        
        Animal gato = new Gato();
        gato.fazerSom(); // Saída: O gato mia.
        
        cachorro.respirar(); // Saída: O animal está respirando.
    }
}

```

 ### Resumo: 
 * *Método abstrato* não possui implementação na classe abstrata, só a assinatura.
 * *classes abstracts* contem métodos abstratos que as classes filhas devem implementar.
 * *Subclasses* devem fornecer implementação concreta para os métodos abstratos, ou também se tornar abstratas.

# Regras abstract
1. Métodos abstratos não podem ter corpo.