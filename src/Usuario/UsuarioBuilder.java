package Usuario;

public class UsuarioBuilder implements UsuarioInterface {
    private String nome = "Desconhecido";
    private String email = "exampĺe@email.com";
    private int idade = 0;
    private String endereco = "Rua desconhecida";
    private String telefone = "(00) 0000-0000";

    @Override
    public UsuarioInterface nome (String nome){
        System.out.print("[");
        System.out.print("Nome: " + nome);
        this.nome = nome;
        return this;
    }

    @Override
    public UsuarioInterface email(String email){
        System.out.print("\nEmail: " + email);
        this.email = email;
        return this;
    }

    @Override
    public UsuarioInterface idade(int idade){
        System.out.print("\nIdade: " + idade);
        this.idade = idade;
        return this;
    }

    @Override
    public UsuarioInterface endereco(String endereco){
        System.out.print("\nEndereço: " + endereco);
        this.endereco = endereco;
        return this;
    }

    @Override
    public UsuarioInterface telefone(String telefone){
        System.out.print("\nTelefone: " + telefone);
        this.telefone = telefone;
        return this;
    }

    @Override
    public Usuario build() {
        if(nome == null || email == null){
            throw new IllegalStateException("Nome e Email são obrigatórios!!!");
        }
        System.out.print("]\n");
        return new Usuario(nome,email,idade,endereco,telefone);
    }
}
