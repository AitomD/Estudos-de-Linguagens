public class User {
    private Integer cpf;
    private String nome;
    private Integer dataNascimento;
    private String endereco;

    public User(Integer cpf, String nome, Integer dataNascimento, String endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Integer getCpf() {return cpf; }
    public String getNome() {return nome;}
    public Integer getDataNascimento() {return dataNascimento;}
    public String getEndereco() {return endereco;}

}
