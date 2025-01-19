
## **Exercício 5: Gerenciamento de Animais (Com Herança)**

### **Diagrama de Classes**

CopiarEditar

`Animal ├── Cachorro ├── Gato └── Ave`

### **Passo a Passo**

1. **Criar a classe base `Animal`:**
    
    - Atributos comuns a todos os animais:
        - `nome` (String)
        - `especie` (String)
        - `idade` (int)
    - Métodos:
        - Construtor para inicializar os atributos.
        - Getters e Setters para acessar os atributos.
        - Método `toString()` para exibir as informações do animal.
2. **Criar subclasses específicas:**
    
    - **`Cachorro`**
        - Atributo adicional:
            - `raca` (String)
        - Método adicional:
            - `latir()`: Exibe uma mensagem como "O cachorro está latindo!".
        - Construtor para inicializar os atributos da classe base e o atributo adicional.
    - **`Gato`**
        - Atributo adicional:
            - `raca` (String)
        - Método adicional:
            - `miar()`: Exibe uma mensagem como "O gato está miando!".
        - Construtor para inicializar os atributos da classe base e o atributo adicional.
    - **`Ave`**
        - Atributo adicional:
            - `tipoAsa` (String)
        - Construtor para inicializar os atributos da classe base e o atributo adicional.
3. **Criar a classe `PetShop`:**
    
    - Atributos:
        - `nome` (String)
        - `animais` (ArrayList do tipo `Animal`)
    - Métodos:
        - `adicionarAnimal(Animal animal)`: Adiciona um animal à lista.
        - `listarAnimais()`: Exibe as informações de todos os animais.
4. **No método `main`:**
    
    - Instancie o pet shop.
    - Adicione diferentes tipos de animais ao pet shop.
    - Liste os animais cadastrados.
============================================================= =============================================================

com.petshop
├── modelo
│   ├── Animal.java
│   ├── Cachorro.java
│   ├── Gato.java
│   └── Ave.java
├── servico
│   └── PetShop.java
└── main
    └── Main.java
