# Programação Orientada a Objetos — Estudos Dirigidos

**Universidade Tuiuti do Paraná | 2026**

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)

## Sobre o trabalho

Repositório com os estudos dirigidos desenvolvidos na disciplina de **Programação Orientada a Objetos**, do curso de Análise e Desenvolvimento de Sistemas da Universidade Tuiuti do Paraná (UTP).

Cada estudo dirigido aplica, em Java, conceitos centrais da orientação a objetos por meio de pequenos sistemas: contas bancárias, personagens de RPG, folha de pagamento, gráfica online, login de usuários e agenda de contatos.

## Objetivos

Praticar e consolidar os pilares da programação orientada a objetos:

- Encapsulamento;
- Herança;
- Polimorfismo;
- Abstração, com classes abstratas e interfaces;
- Organização do código em camadas (modelo, visão e controlador).

## Tecnologias utilizadas

- Java (JDK 16 ou superior)

## Estudos dirigidos

| Estudo | Pasta | Sistemas | Conceitos aplicados |
|---|---|---|---|
| ED02 | `ed02/` | Conta bancária e RPG | Classes abstratas, herança, sobrescrita (`@Override`) e polimorfismo |
| ED03 | `ed03/` | Folha de pagamento, gráfica online e login | Interfaces, herança, polimorfismo e listas (`ArrayList`) |
| ED04 | `ed04/` | Agenda de contatos | Interface, padrão MVC, validação de dados e encapsulamento |

## Implementação

### ED02 — Conta bancária e RPG

- **Conta bancária** (`conta-bancaria/`): a classe abstrata `Conta` define depósito, saque, transferência e saldo. As subclasses `ContaCorrente`, `ContaPoupanca` e `ContaSalario` implementam o extrato e os juros diários (0,1%, 0,05% e sem juros, respectivamente).
- **RPG** (`rpg/`): a classe abstrata `Personagem` define nome, HP, ataque e defesa. As subclasses `Guerreiro`, `Mago` e `Arqueiro` implementam habilidades especiais próprias, e o `Guerreiro` sobrescreve a defesa para reduzir o dano pela metade.

### ED03 — Interfaces

- **Folha de pagamento**: a interface `Pagavel` é implementada por `Funcionario` e usada pela `FolhaPagamento`.
- **Gráfica online**: a interface `Imprimivel` é implementada por `Imagem` e `Texto`, e a `Impressora` imprime qualquer item da lista.
- **Sistema de login**: a interface `Autenticavel` é implementada por `Usuario`, que é estendida por `Cliente` e `Administrador`. O `SistemaLogin` informa se o login foi bem-sucedido, se a senha está incorreta ou se o usuário não existe.

### ED04 — Agenda de contatos

- A interface `Contato` é implementada por `PessoaFisica` (CPF com 11 dígitos) e `PessoaJuridica` (CNPJ com 14 dígitos). Documentos inválidos lançam `IllegalArgumentException`.
- O `ContatoController` adiciona contatos sem permitir documentos repetidos, lista e remove por documento.
- O `ContatoView` exibe um contato.
- As classes `Endereco` e `Telefone` modelam dados complementares do contato.

## Estrutura do projeto

```text
ed02/
├── conta-bancaria/
│   └── Main.java
└── rpg/
    └── MainRpg.java

ed03/
└── SistemaCompleto.java

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

Requer o **JDK 16 ou superior**. Em cada pasta, compile e execute a classe principal:

```bash
# ED02 — Conta bancária
cd ed02/conta-bancaria
javac Main.java
java Main

# ED02 — RPG
cd ed02/rpg
javac MainRpg.java
java MainRpg

# ED03
cd ed03
javac SistemaCompleto.java
java SistemaCompleto

# ED04
cd ed04
javac *.java
java Main
```

## Limitações

- As classes `Endereco` e `Telefone` do ED04 ainda não estão ligadas aos contatos;
- Os dados dos sistemas são armazenados apenas em memória, sem persistência em arquivo ou banco de dados;
- Os programas são executados pelo console, sem interface gráfica.

## Autor

- Pedro Dambiski de Vargas

## Informações acadêmicas

| Informação | Detalhes |
|---|---|
| Instituição | Universidade Tuiuti do Paraná (UTP) |
| Curso | Análise e Desenvolvimento de Sistemas |
| Disciplina | Programação Orientada a Objetos |
| Professor | Diógenes Cogo Furlan|

---

**Observação:** Este repositório tem finalidade acadêmica e documental, reunindo os arquivos desenvolvidos para as atividades propostas na disciplina.
