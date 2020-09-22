package sample;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private String dataNascimento;

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    public Pessoa setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }
    public String whatYou(){
        return "Seu nome é "+nome+" "+sobreNome+" e você \nnasceu em "+dataNascimento+".";
    }
}
