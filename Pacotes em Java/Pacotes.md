### Estrutura Típica de Pacotes em Java

Uma estrutura comum de pacotes em projetos Java, especialmente usando o padrão de arquitetura como **MVC (Model-View-Controller)** ou **camadas**, é algo assim:

```
src
 └── com
     └── exemplo
         ├── model
         ├── service
         ├── controller
         ├── repository
         └── exception
```

### Explicação dos Pacotes

1. **Pacote `model`**:
    
    - Contém as classes que representam os dados ou entidades do seu sistema.
    - Essas classes geralmente são utilizadas para mapear as informações que a aplicação vai manipular.
    - Exemplo: `Produto`, `Cliente`, `Pedido`.
    
    ```java
    package com.exemplo.model;
    
    public class Produto {
        private int id;
        private String nome;
        private double preco;
    
        // Getters e setters
    }
    ```
    
2. **Pacote `service`**:
    
    - Contém as classes que implementam a lógica de negócios.
    - Essas classes costumam usar as classes do pacote `model` para manipular os dados e realizar operações, como cálculos, validações e outras regras de negócios.
    - Exemplo: `ProdutoService`, `ClienteService`.
    
    ```java
    package com.exemplo.service;
    
    import com.exemplo.model.Produto;
    
    public class ProdutoService {
        public void aplicarDesconto(Produto produto, double desconto) {
            produto.setPreco(produto.getPreco() - desconto);
        }
    }
    ```
    
3. **Pacote `controller`**:
    
    - Usado em padrões como o **MVC**, o pacote `controller` contém as classes que recebem as solicitações do usuário (geralmente, em aplicativos web) e interagem com os pacotes `model` e `service`.
    - Exemplo: `ProdutoController`, `ClienteController`.
    
    ```java
    package com.exemplo.controller;
    
    import com.exemplo.service.ProdutoService;
    import com.exemplo.model.Produto;
    
    public class ProdutoController {
        private ProdutoService produtoService = new ProdutoService();
    
        public void aplicarDesconto(Produto produto, double desconto) {
            produtoService.aplicarDesconto(produto, desconto);
        }
    }
    ```
    
4. **Pacote `repository`**:
    
    - Contém classes responsáveis pela persistência de dados, ou seja, a interação com o banco de dados ou outras fontes de dados.
    - Exemplo: `ProdutoRepository`, `ClienteRepository`.
    
    ```java
    package com.exemplo.repository;
    
    import com.exemplo.model.Produto;
    
    public class ProdutoRepository {
        public void salvar(Produto produto) {
            // Lógica para salvar no banco de dados
        }
    
        public Produto buscarPorId(int id) {
            // Lógica para buscar do banco de dados
            return new Produto();
        }
    }
    ```
    
5. **Pacote `exception`**:
    
    - Contém classes que definem exceções customizadas para a aplicação.
    - Exemplo: `ProdutoNotFoundException`, `ValidationException`.
    
    ```java
    package com.exemplo.exception;
    
    public class ProdutoNotFoundException extends RuntimeException {
        public ProdutoNotFoundException(String message) {
            super(message);
        }
    }
    ```
    

### Criando e Organizando os Pacotes no IntelliJ IDEA

Para criar essa estrutura no IntelliJ IDEA, basta seguir alguns passos simples:

1. **Criando pacotes**:
    
    - Clique com o botão direito no diretório `src`, selecione `New` > `Package`, e crie pacotes como `model`, `service`, `controller`, etc.
2. **Criando classes**:
    
    - Após criar os pacotes, clique com o botão direito no pacote desejado, escolha `New` > `Java Class` e crie suas classes (como `Produto`, `ProdutoService`, etc.).
3. **Refatoração**:
    
    - O IntelliJ IDEA possui várias ferramentas de refatoração. Se você precisar mover uma classe de um pacote para outro, por exemplo, basta clicar com o botão direito na classe e escolher `Refactor` > `Move`.
4. **Estrutura de Módulos**:
    
    - Se seu projeto for mais complexo, pode ser interessante usar **módulos** dentro do IntelliJ IDEA. Isso permite agrupar pacotes relacionados e melhorar a organização do projeto.

### Exemplo Prático com MVC

Aqui está um exemplo de como ficaria a interação entre esses pacotes com um padrão MVC:

- O **Controller** (como `ProdutoController`) receberia as entradas (por exemplo, o nome de um produto).
- O **Service** (como `ProdutoService`) processaria a lógica de negócios (aplicar descontos, calcular preços, etc.).
- O **Model** (`Produto`) manteria os dados relacionados ao produto.
- O **Repository** salvaria ou recuperaria o produto de um banco de dados.

### Como Organizar no IntelliJ

No IntelliJ, ao digitar o código, a IDE vai automaticamente sugerir importações dos pacotes. Além disso, você pode navegar entre classes e pacotes de maneira rápida usando atalhos como `Ctrl + N` (para encontrar classes) e `Ctrl + Shift + N` (para encontrar arquivos).

### Resumo

- **Pacote `model`**: Contém as entidades ou dados da aplicação.
- **Pacote `service`**: Contém a lógica de negócios.
- **Pacote `controller`**: Controla a interação entre o usuário e os serviços da aplicação.
- **Pacote `repository`**: Lida com a persistência de dados.
- **Pacote `exception`**: Contém exceções personalizadas.

Organizar seu projeto dessa maneira torna o código mais modular, reutilizável e fácil de entender, especialmente quando o projeto cresce.