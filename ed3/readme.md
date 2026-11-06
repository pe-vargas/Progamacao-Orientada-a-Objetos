# Pasta `ed03/` — Estudo Dirigido 03

**Programação Orientada a Objetos | Universidade Tuiuti do Paraná | 2026**

## Sobre o estudo

Três pequenos sistemas em Java, reunidos em um único arquivo, que aplicam **interfaces, herança e polimorfismo**. Em cada sistema, uma classe gerenciadora trabalha apenas com a interface, sem conhecer as classes concretas.

## Objetivos

- Definir contratos de comportamento com interfaces;
- Implementar a mesma interface em classes diferentes;
- Usar listas tipadas pela interface para tratar objetos de forma polimórfica;
- Combinar interface e herança em um mesmo sistema.

## Sistema 1 — Folha de pagamento

| Classe / Interface | Função |
|---|---|
| `Pagavel` | Interface com `getNome()` e `getSalario()` |
| `Funcionario` | Implementa `Pagavel` com nome e salário |
| `FolhaPagamento` | Guarda uma lista de `Pagavel` e imprime a folha |

## Sistema 2 — Gráfica online

| Classe / Interface | Função |
|---|---|
| `Imprimivel` | Interface com o método `imprimir()` |
| `Imagem` | Imprime o título da imagem |
| `Texto` | Imprime o conteúdo do texto |
| `Impressora` | Guarda uma lista de `Imprimivel` e imprime todos os itens |

## Sistema 3 — Login

| Classe / Interface | Função |
|---|---|
| `Autenticavel` | Interface com `autenticar(senha)` |
| `Usuario` | Implementa `Autenticavel` com login e senha |
| `Cliente` | Estende `Usuario` |
| `Administrador` | Estende `Usuario` |
| `SistemaLogin` | Busca o usuário pelo login e valida a senha |

O `SistemaLogin` informa uma de três situações: login bem-sucedido, senha incorreta ou usuário não encontrado. Para acessar o login, ele usa `instanceof Usuario u` (*pattern matching*), recurso que exige o **JDK 16 ou superior**.

## Exemplo de saída

```text
== Folha de Pagamento ==
Nome: Carlos
Salário: 2000.0
Nome: Ana
Salário: 3000.0

== Gráfica Online ==
Imagem: logo.png
Texto: Relatório mensal

== Sistema de Login ==
Login bem-sucedido.
Senha incorreta.
Usuário não encontrado.
```

## Estrutura da pasta

```text
ed03/
└── SistemaCompleto.java
```

A classe `SistemaCompleto` contém o método `main`, que executa os três sistemas em sequência.

## Como executar

```bash
javac SistemaCompleto.java
java SistemaCompleto
```

---

**Observação:** Por ser um exercício didático, as senhas são armazenadas em texto simples. Em um sistema real, devem ser guardadas com *hash*.
