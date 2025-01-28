
# Pacotes
Em programação, utilizamos pacotes par agrupar partes relacionadas de um programa. Em Java podemos fazer isso utilizando pacote.

* <span style="background:#b1ffff">As classes definidas dentro de um pacote devem ser acessadas com o uso do nome de seus pacotes</span>.
* Classes definidas dentro de um pacote podem ser tornar privadas desse pacote sem poder ser acessadas por códigos de fora dele. Portanto, o pacote fornece um meio pelo qual classes podem ser encapsuladas.

### Definindo um pacote 
Em Java, todas as classes possuem algum pacote. Mesmo quando não especificamos uma instrução *package*, o programa ele adiciona o pacote padrão (global) . *Pacotes padrões (global) não tem nome, o que o torna transparente.* 

Para criamos um *package*, devemos inserir o comando ``package``. Uma vez que um pacote defini um espaço de nomes, os nomes das classes que você inserir no arquivo se tornarão parte do espaço de nomes do pacote.
Esta e a forma geral da instrução ``package``: 
```Java 
package meu.pacote.exemplo;
```
como podemos notar, o nome do nosso pacote `exercicio.heranca;`

<font color="#58d642">por exemplo: </font>
```Java 
src -> meu -> pacote -> exemplo -> criando a classe: MinhaClasse.Java
```
Isso e o que exatamente o que o livro descreve,<span style="background:#b1ffff"> o diretorio preecisa seguir a hierarquia definida pelo nome do pacote</span>. Assim o, Java consegue localizar corretamente as classes durante a compilação e execução.
 
## Pacotes e o acesso a membros

