public class PessoaFisica implements Contato {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        if (cpf.length() != 11) throw new IllegalArgumentException("CPF inválido");
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getDocumento() { return cpf; }

    @Override
    public String toString() {
        return "Pessoa Física: " + nome + " - CPF: " + cpf;
    }
}