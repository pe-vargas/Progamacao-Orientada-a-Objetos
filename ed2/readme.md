# Pasta `ed02/` — Estudo Dirigido 02

**Programação Orientada a Objetos | Universidade Tuiuti do Paraná | 2026**

## Sobre o estudo

Dois sistemas em Java que aplicam **classes abstratas, herança, sobrescrita e polimorfismo**: um sistema bancário com três tipos de conta e um sistema de RPG com três classes de personagem.

## Objetivos

- Criar uma classe abstrata com atributos e comportamentos comuns;
- Implementar subclasses que herdam e especializam essa base;
- Usar `@Override` para alterar ou completar comportamentos;
- Tratar objetos de tipos diferentes por meio da classe base (polimorfismo).

## Sistema 1 — Conta bancária (`conta-bancaria/`)

A classe abstrata `Conta` guarda o cliente e o saldo, e define as operações comuns. As subclasses implementam o extrato e os juros diários.

| Classe | Tipo | Juros diários |
|---|---|---|
| `Conta` | Abstrata | Método abstrato |
| `ContaCorrente` | Subclasse | 0,1% |
| `ContaPoupanca` | Subclasse | 0,05% |
| `ContaSalario` | Subclasse | Não aplica |

Operações da classe `Conta`:

- `depositar(valor)`: soma ao saldo se o valor for positivo;
- `sacar(valor)`: subtrai do saldo se houver saldo suficiente;
- `transferir(destino, valor)`: saca desta conta e deposita na conta de destino;
- `getSaldo()`: retorna o saldo atual.

### Exemplo de saída

```text
=== Extrato da Conta Corrente ===
Cliente: Alice
Saldo: R$ 600,60

=== Extrato da Conta Poupança ===
Cliente: Bob
Saldo: R$ 2001,00

=== Extrato da Conta Salário ===
Cliente: Carlos
Saldo: R$ 1300,00
```

## Sistema 2 — RPG (`rpg/`)

A classe abstrata `Personagem` define nome, HP (100 inicial), ataque base, ataque, defesa e status. Cada subclasse tem um ataque base e uma habilidade especial própria.

| Classe | Ataque base | Habilidade especial | Particularidade |
|---|---|---|---|
| `Guerreiro` | 15 | Golpe Duplo (dano em dobro) | Sobrescreve `defender` e recebe metade do dano |
| `Mago` | 12 | Bola de Fogo (ataque base + 5, em área) | Usa a defesa padrão |
| `Arqueiro` | 11 | Chuva de Flechas (3 flechas) | Usa a defesa padrão |

O método `atacar` chama `defender` do alvo, então o dano recebido depende da subclasse do personagem atacado.

### Exemplo de saída

```text
[Guerreiro] Thorgal - HP: 100 | Ataque Base: 15
[Mago] Merlinho - HP: 100 | Ataque Base: 12
[Arqueiro] Legolis - HP: 100 | Ataque Base: 11
Thorgal ataca Merlinho causando 15 de dano.
Merlinho recebe 15 de dano.
Merlinho lança Bola de Fogo!
Causa 17 de dano em área!
Legolis usa Chuva de Flechas!
Flecha 1: 11 de dano.
Flecha 2: 11 de dano.
Flecha 3: 11 de dano.
[Guerreiro] Thorgal - HP: 100 | Ataque Base: 15
[Mago] Merlinho - HP: 85 | Ataque Base: 12
[Arqueiro] Legolis - HP: 100 | Ataque Base: 11
```

## Estrutura da pasta

```text
ed02/
├── conta-bancaria/
│   └── Main.java
└── rpg/
    └── MainRpg.java
```

Cada arquivo contém a classe principal e as demais classes do sistema.

## Como executar

```bash
cd conta-bancaria
javac Main.java
java Main

cd ../rpg
javac MainRpg.java
java MainRpg
```

---

**Observação:** As habilidades especiais do RPG apenas exibem o efeito no console; elas não alteram o HP dos personagens.
