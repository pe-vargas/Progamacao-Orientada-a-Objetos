/**
 * Sistema de RPG com personagens e habilidades especiais.
 * Cada personagem possui nome, HP e ataque base.
 * 
 * Subclasses implementam comportamentos específicos de ataque,
 * defesa e habilidades especiais.
 */
public class MainRpg {
    /**
     * Método principal que testa o sistema RPG com três personagens.
     * 
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlinho");
        Arqueiro a = new Arqueiro("Legolis");

        g.status();
        m.status();
        a.status();

        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        g.status();
        m.status();
        a.status();
    }
}

/**
 * Classe base que representa um personagem genérico.
 */
abstract class Personagem {
    /** Nome do personagem */
    protected String nome;

    /** Pontos de vida (HP) */
    protected int hp;

    /** Valor base de ataque */
    protected int ataqueBase;

    /**
     * Construtor da classe Personagem.
     * 
     * @param nome Nome do personagem.
     */
    public Personagem(String nome) {
        this.nome = nome;
        this.hp = 100; // Valor inicial de HP
        this.ataqueBase = 10; // Valor inicial de ataque base
    }

    /**
     * Realiza um ataque em outro personagem.
     * 
     * @param inimigo Personagem alvo do ataque.
     */
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca " + inimigo.nome + " causando " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }

    /**
     * Reduz o HP com base no dano recebido.
     * 
     * @param dano Valor de dano a ser aplicado.
     */
    public void defender(int dano) {
        this.hp -= dano;
        System.out.println(nome + " recebe " + dano + " de dano.");
    }

    /**
     * Executa a habilidade especial da classe.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Mostra o status atual do personagem.
     */
    public void status() {
        System.out.println("[" + getClass().getSimpleName() + "] " + nome + " - HP: " + hp + " | Ataque Base: " + ataqueBase);
    }
}

/**
 * Classe que representa um Guerreiro.
 * Ataque forte e defesa com redução de dano.
 */
class Guerreiro extends Personagem {
    /**
     * Construtor do Guerreiro.
     * 
     * @param nome Nome do guerreiro.
     */
    public Guerreiro(String nome) {
        super(nome);
        this.ataqueBase = 15;
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        this.hp -= danoReduzido;
        System.out.println(nome + " defende com escudo e recebe apenas " + danoReduzido + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        System.out.println("Causa " + (ataqueBase * 2) + " de dano!");
    }
}

/**
 * Classe que representa um Mago.
 * Ataque mágico em área com baixa defesa.
 */
class Mago extends Personagem {
    /**
     * Construtor do Mago.
     * 
     * @param nome Nome do mago.
     */
    public Mago(String nome) {
        super(nome);
        this.ataqueBase = 12;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo!");
        System.out.println("Causa " + (ataqueBase + 5) + " de dano em área!");
    }
}

/**
 * Classe que representa um Arqueiro.
 * Tem chance de ataque crítico.
 */
class Arqueiro extends Personagem {
    /**
     * Construtor do Arqueiro.
     * 
     * @param nome Nome do arqueiro.
     */
    public Arqueiro(String nome) {
        super(nome);
        this.ataqueBase = 11;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Flecha " + i + ": " + ataqueBase + " de dano.");
        }
    }
}
