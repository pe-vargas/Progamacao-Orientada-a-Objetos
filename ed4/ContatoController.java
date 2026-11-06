import java.util.*;

public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        for (Contato c : contatos) {
            if (c.getDocumento().equals(contato.getDocumento())) {
                System.out.println("Contato com documento já cadastrado.");
                return;
            }
        }
        contatos.add(contato);
    }

    public void listarContatos() {
        contatos.forEach(System.out::println);
    }

    public void removerContatoPorDocumento(String documento) {
        contatos.removeIf(c -> c.getDocumento().equals(documento));
    }
}