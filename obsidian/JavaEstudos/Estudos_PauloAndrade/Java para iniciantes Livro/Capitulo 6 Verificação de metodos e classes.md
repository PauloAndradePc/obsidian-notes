## Principais habilidades e conceitos
* Controlar o acesso a membros 
* Passar objetos para um metodo 
* Retornar objetos de um metodo 
* Sobrecarregar construtores 
* Usar recursão
* Aplicar *Static* 
* Usar classes internas
* Usar varargs

------------------------------------------------------------------------
## Membro *publico* e *privado*

 #public pode ser acessado livremente por um codigo fora da classe criamos.
 
#privado só pode ser acessado por outros métodos definidos por sua classes.

### Modificadores de acesso da linguagem Java 

O controlador de acesso a membros e obtido com o uso de três `modificadores de acesso`: 
#public, #private e #protected . Utilizaremos o metodo protected somente no capitulo 8, aonde e mais utilizado quando possuem #Herança 

* Quando utilizamos o #public ele pode ser *acessado* por qualquer codigo do programa, *incluindo métodos definidos em outras classes *

* Quando utilizamos o metodo #private *ele só pode ser acessado dentro da sua própria classe*. Não podemos acessar membros #private de outras classes.

### Utilizando o *private* 

![[AcessDemo 1.java]]

![[MyClass.java]]

* Já que *Alpha* e privado, não podemos acessar ele por um codigo fora de sua classe. Logo, dentro da *AcesDemo, alpha* não podem ser chamados diretamente. Deve ser acessado por intermédio de seus  métodos acossadores : *setAlpha()* e *getAlpha()* 

* Porem os metodos definidos dentro de *MyClass* podem ser acessados livremente, no codigo utilizamos um metodo de *exibirAlpha* e como podemos ver , conseguimos acessar e exibir livremente.

* Um membro privado pode ser usado livremente por outros membros de sua classe, mas não pode ser acessado por um codigo de fora dela.


# Sobrecarga de metodos


