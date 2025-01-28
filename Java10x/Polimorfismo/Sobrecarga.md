## Polimorfismo -> Sobrecarga
A sobrecarga de métodos ocorre quando criamos vários métodos com o mesmo nome, mas com assinaturas diferentes.

### Exemplo de método para todos os Ninjas 
```Java
public void Jutsu() {
    System.out.println("Todos os ninjas sabem fazer o Jutsu das sombras");
}
```
Neste caso todos os ninjas terão o Jutsu das sombras.

-------------------------------------------------------
## Como sobrecarregar métodos em Java 
Devemos criar um método com o mesmo nome do anterior, porem devemos adicionar uma assinatura (parâmetro) diferentes.

A assinatura de um método e <span style="background:rgba(16, 206, 200, 0.5)">definida pelo tipo/numero dos parâmetros que ele recebe</span> 

```Java
public void Jutsu(String nome) {
    System.out.println(nome + " sabe fazer o Jutsu das sombras");
}
```
Neste caso adicionamos um parâmetro do tipo `String` 

--------------------------------------------------------

## Sobrecarregando com tipos diferentes

Podemos criar vario métodos com tipos diferentes, <span style="background:rgba(16, 206, 200, 0.5)">desde que os parâmetros sejam de tipos diferentes ou combinações diferentes.</span>

```Java
public void Jutsu(int idade) {
    System.out.println("Um ninja de " + idade + " anos sabe fazer o Jutsu das sombras");
}
```
Criamos um método que contem o mesmo nome, porem com uma assinatura diferente.

----------------------------------------------------------

## Regra importante 

*  Não podemos sobrecarregar o método, utilizando o mesmo tipo de dado.
*  No método anterior, utilizamos o (“String” nome) nesse que criamos não podemos utilizar o mesmo tipo de dado.

