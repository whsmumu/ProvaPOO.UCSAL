package Map.Exercicio2;

import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private List<Curso> curso;
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public List<Curso> getCurso() {
        return curso;
    }
    public void setCurso(List<Curso> list) {
        this.curso = list;
    }
    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
    }
    
}
