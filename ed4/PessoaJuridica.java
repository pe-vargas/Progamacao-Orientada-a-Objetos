public class PessoaJuridica implements Contato {
    private String nome;
    private String telefone;
    private String email;
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        if (cnpj.length() != 14) throw new IllegalArgumentException("CNPJ inválido");
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getDocumento() { return cnpj; }

    @Override
    public String toString() {
        return "Pessoa Jurídica: " + nome + " - CNPJ: " + cnpj;
    }
}