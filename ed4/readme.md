# Pasta `ed04/` — Estudo Dirigido 04

**Programação Orientada a Objetos | Universidade Tuiuti do Paraná | 2026**

## Sobre o estudo

Uma agenda de contatos em Java que aplica **interface, encapsulamento, validação de dados e separação em camadas (MVC)**. A agenda aceita pessoas físicas e jurídicas, identificadas por CPF ou CNPJ.

## Objetivos

- Definir uma interface comum para tipos diferentes de contato;
- Validar os dados no construtor e lançar exceções para valores inválidos;
- Separar o modelo, a visão e o controlador em classes distintas;
- Usar recursos da coleção `List`, como `forEach` e `removeIf`.

## Classes do projeto

| Classe / Interface | Camada | Função |
|---|---|---|
| `Contato` | Modelo | Interface com nome, telefone, e-mail, documento e `toString()` |
| `PessoaFisica` | Modelo | Contato com CPF; exige 11 caracteres |
| `PessoaJuridica` | Modelo | Contato com CNPJ; exige 14 caracteres |
| `Endereco` | Modelo | Rua, número e CEP |
| `Telefone` | Modelo | Número e tipo |
| `ContatoController` | Controlador | Adiciona, lista e remove contatos |
| `ContatoView` | Visão | Exibe um contato no console |
| `Main` | — | Cria os contatos e executa a listagem |

## Regras do sistema

- **Documento inválido**: CPF diferente de 11 caracteres ou CNPJ diferente de 14 caracteres lança `IllegalArgumentException`;
- **Sem duplicidade**: o controlador não adiciona um contato cujo documento já esteja cadastrado e exibe a mensagem *"Contato com documento já cadastrado."*;
- **Remoção**: `removerContatoPorDocumento` remove o contato pelo documento.

## Exemplo de saída

```text
Pessoa Física: João - CPF: 12345678901
Pessoa Jurídica: EmpresaX - CNPJ: 12345678000199
```

## Estrutura da pasta

```text
ed04/
├── Main.java
├── Contato.java
├── PessoaFisica.java
├── PessoaJuridica.java
├── Endereco.java
├── Telefone.java
├── ContatoController.java
└── ContatoView.java
```

## Como executar

Todas as classes ficam na mesma pasta, então compile todos os arquivos juntos:

```bash
javac *.java
java Main
```

---

**Observação:** A validação confere apenas a quantidade de caracteres do CPF e do CNPJ, sem verificar os dígitos verificadores. As classes `Endereco` e `Telefone` foram criadas, mas ainda não estão ligadas aos contatos, e o `ContatoView` ainda não é utilizado pelo `Main`.
