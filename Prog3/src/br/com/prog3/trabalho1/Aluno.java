package br.com.prog3.trabalho1;

import java.time.LocalDate;
import java.util.Objects;

public class Aluno {
    private String nome;
    private LocalDate dataNascimento;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(this.rg, aluno.getRg());
    }
}
