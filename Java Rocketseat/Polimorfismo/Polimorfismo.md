# O que e #polimorfismo

Polimorfismo e a capacidade de um objeto se comportar de múltiplas maneiras e formas. Em Java, isso ocorre quando uma classe possui método que podem ser usados de maneiras  diferentes.

Podemos dividir o polimorfismo em duas categorias principais:

1. *Polimorfismo de Sobrecarga*: Ocorre quando você define *múltiplos métodos com o mesmo nome, mas com assinaturas diferentes*. Isso e resolvido em tempo de compilação.
2. *Polimorfismo de Sobrescrita*: #Override Envolve redefinir métodos em classes derivadas. *Isso permite que a classe filha forneça sua própria implementação de um método definido na classe pai*. 

## Polimorfismo de Sobrecarga
Em Java e uma forma de polimorfismo em tempo de compilação. Que ocorre <span style="background:rgba(16, 206, 200, 0.5)">quando uma classe define métodos com o mesmo nome, mas com assinaturas diferentes.</span> 

A sobrecarga de métodos permite que uma classe forneça varias implementações de um método para atender a diferentes tipos de chamadas, dependendo dos argumentos fornecidos. Isso melhora a flexibilidade e a legibilidade do código.

### Características principais:
* Assinatura Única: A assinatura do método inclui o nome do método e a lista de parâmetros. O tipo de retorno não faz parte da assinatura.
* *Assinaturas*: E o conjunto que identifica exclusivamente o método. Composta por: <span style="background:rgba(16, 206, 200, 0.5)">Nome do metodo</span> e <span style="background:rgba(16, 206, 200, 0.5)">Lista de parâmetros ( tipo, Numero e Ordem )</span> 
  