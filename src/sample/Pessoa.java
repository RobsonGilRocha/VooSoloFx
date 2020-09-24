package sample;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sNome;
    private LocalDate nascimento;

    public Pessoa() {
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa setsNome(String sNome) {
        this.sNome = sNome;
        return this;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Pessoa setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    public String whatYou() {
        return "Seu nome é " + nome + " " + sNome + " e você \nnasceu em " +nascimento+ ".";
    }


}

