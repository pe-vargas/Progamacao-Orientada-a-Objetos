public class Endereco {
    private String rua;
    private String numero;
    private String cep;

    public Endereco(String rua, String numero, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getCep() { return cep; }
}