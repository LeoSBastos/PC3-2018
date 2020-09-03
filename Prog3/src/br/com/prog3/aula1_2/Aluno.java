package br.com.prog3.aula1_2;

public class Aluno implements Comparable<Aluno> {
    private Integer matricula;
    private String nome;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*@Override
    public int compareTo(Aluno aluno) {
        if (this.matricula < aluno.getMatricula()) {
            return -1;
        }
        else if (this.matricula > aluno.getMatricula()){
            return 1;
        }
        else {
            return 0;
        }*/

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}
