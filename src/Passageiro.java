import java.util.Date;

public class Passageiro {
    private String nome;
    private String cpf;
    private String endereco;
    private Date dataDeNascimento;

    // Construtor público
    public Passageiro(String nome, String cpf, String endereco, Date dataDeNascimento ) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
