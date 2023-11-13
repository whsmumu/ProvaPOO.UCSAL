package Map.Exercicio2;

import java.util.List;

public class Disciplina {
    
    private Sigla sigla;
    private String descricao;
    private List<Curso> curso;
   
    public Sigla getSigla() {
        return sigla;
    }
    public void setSigla(Sigla sigla) {
        this.sigla = sigla;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Curso> getCurso() {
        return curso;
    }
    public void setCurso(List<Curso> list) {
        this.curso = list;
    }
    @Override
    public String toString() {
        return "Disciplina [sigla=" + sigla + ", descricao=" + descricao + ", curso=" + curso + "]";
    }
    
}
