
# Abstração em POO com Java 

### O Conceito de Abstração em POO
A #abstração e um principio fundamental em  Java, e na programação Orientada a Objetos que envolve a identificação e a modelagem das características e comportamentos essenciais de um Objeto. ==A abstração permite aos desenvolvedores criar modelos simplificados de entidades complexas, focando apenas nos aspectos importantes da aplicação.== 

### Por que a Abstração e importante?
* **Simplificação**: Reduz a complexidade do desenvolvimento de software, permitindo que os desenvolvedores se concentrem nos aspectos relevantes.
* **Reusabilidade**: Promove a reusabilidade do código, uma vez que as abstrações podem ser usadas em diferentes partes de um aplicativo ou em diferentes projetos.

## Classe Abstrata **Animal**
Em Java, uma classe abstrata e usada para definir um template para outras classe.<span style="background:rgba(16, 206, 200, 0.5)"> Ela pode conter métodos abstratos, que devem ser implementados pelas classes filhas.</span> 

```Java
public abstract class Animal { 
private String nome; 
private String especie; 
private String nomeDoDono;

//Construtor
public void Animal(String nome, String especie, String nomeDono){
this.nome = nome;
this.especie = especie;
this.nomeDono = nomedon;
}

//Metodos abstratos
public abstract void mostrarInfo();

}
```

### Implementando Classes Concretas
A classe `cachorro` abaixo e uma implementação especifica de `Animal` 