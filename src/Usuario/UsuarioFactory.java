package Usuario;

public class UsuarioFactory {
    public static Usuario CriarJoao(){
        return new UsuarioBuilder()
                .nome("João")
                .idade(24)
                .email("joao@email.com")
                .endereco("Rua de Joao")
                .telefone("(81) 99188-0066")
                .build();
    }

    public static Usuario CriarAna(){
        return new UsuarioBuilder()
                .nome("Ana")
                .idade(32)
                .email("Ana@email.com")
                .endereco("Rua de Ana")
                .telefone("(81) 9999-8276")
                .build();
    }
}
