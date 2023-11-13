package Map.Exercicio2;

import java.util.List;

public class Professor extends Pessoa{
    private List<Disciplina> disciplina;

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> list) {
        this.disciplina = list;
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + "]";
    }
    
}
