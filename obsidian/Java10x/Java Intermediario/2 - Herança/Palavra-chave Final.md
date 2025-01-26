## Usando final
Por exemplo, podemos ter uma classe que encapsule o controle de algum dispositivo de hardware. Essa classe pode dar ao usuário a oportunidade de inicializar o dispositivo, fazendo uso de informações privadas. Não iriamos querer que os usuários de nossa classe possam sobrepor o método de inicialização. *Em Java, com os uso da palavra-chave #final, e fácil impedir que um método seja sobreposto ou uma classe seja herdada.* 

## A palavra-chave final impede a sobreposição
Em Java podemos usar a palavra-chave #final para impedir que um método seja sobreposto. Métodos declarados com a palavra *final* não podem ser sobrepostos.
O fragmento a seguir ilustra *final* 
[Abrindo arquivo Final.java](file:///G:/Meu%20Drive/CursoJava/Aula04HerancaPrimeiroPilarOrientacaoObjeto/Heran%C3%A7a/Usando%20a%20palavra-chave%20Final/Final.java)

Já que *meth()* e declarado como *final*, não pode ser sobreposto em *B*. Se você tentar fazê-lo, ocorrera um erro de tempo de compilação.

## A palavra-chave final impede a herança 
Você pode impedir que uma classe seja herdada adicionando o #final A declaração de uma classe como *final* também e declara implicitamente todos os seus métodos como *final*. E invalido declarar uma classe como *abstract* e *final*, uma vez que uma classe abstrata e individualmente incompleta e depende de suas subclasses para fornecer implementações completas.
Aqui esta o exemplo de uma classe *final*:
[Abrindo arquivo Heranca_Final.java](file:///G:/Meu%20Drive/CursoJava/Aula04HerancaPrimeiroPilarOrientacaoObjeto/Heran%C3%A7a/Usando%20a%20palavra-chave%20Final/Heranca_Final.java)

<span style="background:rgba(16, 206, 200, 0.5)">Como podemos ver caso eu utilize a palavra *final* na classe, essa classe não poderá ser herdada. Ira ocorrer um erro de compilação </span>





