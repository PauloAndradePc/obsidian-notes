Em Java a classe *LocalDate* ela e imutável, significa que depois que criarmos não poderemos fazer modificações.

Utilizada para fornecer e manipular e consultar datas, como adicionar ou subtrair dias, meses ou anos, obter o dia da semana ou verificar se uma data e anterior ou posterior a outra data.

# Principais características
 1. **Representa apenas a data** (ano, mês e dia).
    - Exemplo: `2025-01-17`.
2. **Imutável**.
3. **Sem horário ou fuso horário**.
4. **Fácil manipulação de datas**, como adicionar ou subtrair dias, meses ou anos.


# Como usar #LocaleDate

### Importar a Classe
Antes de usar precisamos importar a classe: 
*import java.time.LocalDate;*

### Criar Instância de *LocalDate*

*a. Data Atual*
Em Java para sabermos a hora atual, devemos utilizar o método estático #now
```Java
LocalDate hoje = LocalDate.now();
System.out.println("Data atual: " + hoje);

```

*b. Data Especifica*
Para criarmos uma data especifica, usamos o método estático #of (ano, mês, dia)
```Java
LocalDate dataEspecifica = LocalDate.of(2025, 1, 17);
System.out.println("Data específica: " + dataEspecifica);
```

*c. Data um Texto*
Podemos criar uma data a partir de uma string, temos que utilizar o #parse
```Java
LocalDate dataTexto = LocalDate.parse("2025-01-17");
System.out.println("Data do texto: " + dataTexto);

```

# Métodos Úteis de *LocalDate*

- `getYear()`: Retorna o ano.

- `getMonth()`: Retorna o mês como um enum (e.g., `JANUARY`).

- `getMonthValue()`: Retorna o mês como número (e.g., `1` para janeiro).

- `getDayOfMonth()`: Retorna o dia do mês.

- `getDayOfWeek()`: Retorna o dia da semana como um enum (e.g., `FRIDAY`).

```Java
LocalDate data = LocalDate.of(2025, 1, 17);
System.out.println("Ano: " + data.getYear());
System.out.println("Mês: " + data.getMonth());
System.out.println("Dia do mês: " + data.getDayOfMonth());
System.out.println("Dia da semana: " + data.getDayOfWeek());

```