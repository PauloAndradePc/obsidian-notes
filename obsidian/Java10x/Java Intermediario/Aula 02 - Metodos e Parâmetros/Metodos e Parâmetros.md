Quando falamos de metodos, temos que ter em mente que estamos falando de dois tipos #void e #return , esses são dois metodos básicos em java.

### Criando meu próprio metodo *public*  

1.  Inicializamos dizendo que ele e *public* , desta forma teremos acesso a esse metodo a qualquer parte do nosso codigo.
2.  Primeiro metodo que vamos criar e o metodo #void 
3.  Passamos o nome do nosso metodo : *SharingaAtivado* 
 
![[Metodos.java]]

![[Ninjas 1.java]]

### Criando um metodo *return* 
Quando criamos um metodo com #return devemos colocar o ==tipo do metodo== caso escolhermos um metodo do tipo *String* ele *obrigatoriamente deve retornar uma frase ou uma palavra*, não podemos retornar numeros.

por exemplo :

1. Devemos adicionar o *public* 
2. Adicionamos o *tipo* do metodo Ex: *String* , *int* ou *booleano* 
3. Adicionamos o nome do nosso metodo (*EuSouUmNinja*) 
4. Utilizamos a palavra reservada no chamada #return 
5. No final usamos assim *return " Oi, eu sou um ninja "*
6. Para ser exibido precisamos ==guardar essa variavel dentro de outra variavel== *String chamandoMetodo = EuSouUmNinja();*  
7. Para finalizar utilizamos o *System.out.println(chamandoMetodo);* 
*teste* 