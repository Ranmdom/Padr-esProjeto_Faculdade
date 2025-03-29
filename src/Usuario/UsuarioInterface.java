package Usuario;

public interface UsuarioInterface {
    UsuarioInterface nome(String nome);
    UsuarioInterface email(String email);
    UsuarioInterface idade(int idade);
    UsuarioInterface endereco(String endereco);
    UsuarioInterface telefone(String telefone);
    Usuario build();
}
