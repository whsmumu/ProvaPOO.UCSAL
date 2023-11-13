package Map.Exercicio2;

import java.util.List;

public class Turma{
    
    private String descricao;
    private List<Professor> professor;
    private List<Disciplina> disciplina;
    private List<Aluno> aluno;
    private Integer semestre;
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Professor> getProfessor() {
        return professor;
    }
    public void setProfessor(List<Professor> list) {
        this.professor = list;
    }
    public List<Disciplina> getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(List<Disciplina> list) {
        this.disciplina = list;
    }
    public List<Aluno> getAluno() {
        return aluno;
    }
    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }
    public Integer getSemestre() {
        return semestre;
    }
    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
    @Override
    public String toString() {
        return "Turma [descricao=" + descricao + ", professor=" + professor + ", disciplina=" + disciplina + ", aluno="
                + aluno + ", semestre=" + semestre + "]";
    }
    
}