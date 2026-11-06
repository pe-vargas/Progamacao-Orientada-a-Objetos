public class Main {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();

        Contato pf = new PessoaFisica("João", "1111-1111", "joao@email.com", "12345678901");
        Contato pj = new PessoaJuridica("EmpresaX", "2222-2222", "empresa@email.com", "12345678000199");

        controller.adicionarContato(pf);
        controller.adicionarContato(pj);

        controller.listarContatos();
    }
}