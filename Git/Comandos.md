### **1. Criar um repositório no GitHub**

1. Vá para [GitHub](https://github.com) e faça login.
2. Crie um novo repositório:
    - Clique em **New** no topo.
    - Dê um nome ao repositório (por exemplo, `obsidian-notes`).
    - Defina como **privado** (se preferir privacidade).
    - Clique em **Create repository**.
---------------------------------------------------------------------
### **2. Configurar o Git no computador**

Certifique-se de que você tem o Git instalado e configurado:

1. Instale o Git:
    - No Windows: [Baixar Git](https://git-scm.com/downloads).
    - No macOS/Linux: Use o gerenciador de pacotes (`brew`, `apt`, etc.).
2. Configure suas credenciais no Git:
    
    bash
    
    CopiarEditar
    
    `git config --global user.name "SeuNome" git config --global user.email "SeuEmail@exemplo.com"`
---------------------------------------------------------------------
---

### **3. Clonar o repositório no seu computador**

1. Abra o terminal e clone o repositório para onde você deseja salvar suas notas do Obsidian:
    
    bash
    
    CopiarEditar
    
    `git clone https://github.com/seu-usuario/obsidian-notes.git`
    
2. Mova sua pasta do Vault do Obsidian para dentro do repositório clonado:
    - Por exemplo: Se sua pasta do Obsidian está em `~/Documentos/Obsidian`, mova-a para a pasta do repositório clonado.

---

### **4. Configurar commits automáticos**

Para sincronizar automaticamente, você pode usar um script com um cron job (Linux/macOS) ou uma tarefa agendada (Windows).

#### **4.1 Criar um script de sincronização**

Crie um arquivo chamado `sync.sh` no diretório do repositório, com o seguinte conteúdo:

bash

CopiarEditar

`#!/bin/bash  # Caminho para o repositório REPO_DIR="/caminho/para/seu/repositorio"  # Navegar para o diretório do repositório cd "$REPO_DIR"  # Adicionar mudanças ao commit git add .  # Fazer commit com uma mensagem automática git commit -m "Sync Obsidian notes: $(date)"  # Enviar para o GitHub git push origin main`

#### **4.2 Tornar o script executável**

No terminal:

bash

CopiarEditar

`chmod +x /caminho/para/seu/script/sync.sh`

---

### **5. Automatizar a execução do script**

Escolha a forma de automação adequada ao seu sistema operacional:

#### **5.1 Linux/macOS: Cron job**

1. Abra o crontab para editar:
    
    bash
    
    CopiarEditar
    
    `crontab -e`
    
2. Adicione uma linha para executar o script a cada 5 minutos:
    
    bash
    
    CopiarEditar
    
    `*/5 * * * * /caminho/para/seu/script/sync.sh`
    

#### **5.2 Windows: Tarefas Agendadas**

1. Abra o Agendador de Tarefas.
2. Crie uma nova tarefa e configure:
    - **Disparador**: Execute a cada 5 minutos.
    - **Ação**: Executar um programa, apontando para o script `sync.sh` (use o Git Bash ou outro terminal para execução).

---

### **6. Verificar e ajustar o processo**

- Teste o script manualmente para garantir que está funcionando:
    
    bash
    
    CopiarEditar
    
    `/caminho/para/seu/script/sync.sh`


---------------------------------------------------------------------

4.1 criar script de sincronizacao como fazer isso

###### O ChatGPT disse:

ChatGPT

Criar um script para sincronizar automaticamente o repositório do Obsidian com o GitHub envolve configurar um arquivo de script que executa os comandos Git necessários para:

1. Adicionar novos arquivos e alterações.
2. Fazer o commit com uma mensagem.
3. Enviar as alterações para o repositório remoto.

Aqui está como criar e configurar esse script:

---

### **Passo 1: Criar o script**

#### Para Windows:

1. Abra um editor de texto, como o Bloco de Notas, ou um editor de código, como o VS Code.
2. Insira o seguinte código:
    
    bash
    
    CopiarEditar
    
    `@echo off cd "C:\caminho\para\sua\pasta\obsidian" git add . git commit -m "Sync: Atualizando notas automaticamente" git push origin main echo Sincronização concluída! pause`
    
3. Salve o arquivo como `sync-notas.bat`.

---

#### Para Linux/Mac:

1. Abra um terminal ou editor de texto.
    
2. Crie o script com o seguinte conteúdo:
    
    bash
    
    CopiarEditar
    
    `#!/bin/bash cd "/caminho/para/sua/pasta/obsidian" git add . git commit -m "Sync: Atualizando notas automaticamente" git push origin main echo "Sincronização concluída!"`
    
3. Salve o arquivo como `sync-notas.sh`.
    
4. Dê permissão de execução ao script:
    
    bash
    
    CopiarEditar
    
    `chmod +x sync-notas.sh`
    

---

### **Passo 2: Agendar a execução automática**

Você pode agendar esse script para ser executado automaticamente em intervalos regulares.

#### No Windows:

1. Pressione `Win + R`, digite `taskschd.msc` e pressione Enter para abrir o Agendador de Tarefas.
2. Clique em **Criar Tarefa Básica**.
3. Dê um nome à tarefa (ex.: "Sincronizar Notas").
4. Escolha a frequência (diária, semanal, etc.).
5. Na etapa **Ação**, escolha **Iniciar um Programa**.
6. Navegue até o arquivo `sync-notas.bat` e selecione-o.
7. Salve a tarefa.

---

#### No Linux/Mac:

1. Abra o terminal e edite o crontab:
    
    bash
    
    CopiarEditar
    
    `crontab -e`
    
2. Adicione a seguinte linha ao final do arquivo para executar o script a cada 30 minutos (por exemplo):
    
    bash
    
    CopiarEditar
    
    `*/30 * * * * /caminho/para/sync-notas.sh`
    
3. Salve o arquivo.

---

### **Passo 3: Testar o Script**

1. Execute o script manualmente para garantir que ele funcione:
    
    - Windows: Clique duas vezes no arquivo `.bat`.
    - Linux/Mac: Execute no terminal:
        
        bash
        
        CopiarEditar
        
        `./sync-notas.sh`
        
2. Verifique se as alterações foram enviadas ao repositório no GitHub.