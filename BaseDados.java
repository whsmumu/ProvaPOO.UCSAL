package Map.Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BaseDados {
    public Map<Integer,List<Professor>> mapP(int tamanho){
        try {
            
            Professor prof;
            Map<Integer, List<Professor>> mapProfessor = new TreeMap<>();
            List<Professor> listP = new ArrayList<>();
           
            for (int i = 0; i < tamanho; i++) {
            prof = new Professor();
            prof.setNome("PROFESSOR 0"+(i+1));
            prof.setDisciplina(mapDis(1).get(0));
            listP.add(prof);   
            
        }
        mapProfessor.put(0, listP);
            return mapProfessor;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<Integer, List<Disciplina>> mapDis(int tamanho){
        try {
            Disciplina dis;
            Map<Integer, List<Disciplina>> mapDisciplina = new TreeMap<>();
            List<Disciplina> listD = new ArrayList<>();
            
            for (int i = 0; i < tamanho; i++) {
                dis = new Disciplina();
                dis.setSigla(Sigla.POO);
                dis.setDescricao("DESCRIÇÃO_D 0"+(i+1));
                dis.setCurso(mapCs(1).get(0));
                listD.add(dis);
                
            }
            mapDisciplina.put(0, listD);
            return mapDisciplina;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<Integer, List<Curso>> mapCs(int tamanho){
        
        try {
            Curso cs;
            Map<Integer, List<Curso>> mapCurso = new TreeMap<>();
            List<Curso> listC = new ArrayList<>();
            for (int i = 0; i < tamanho; i++) {
                cs = new Curso();
                cs.setSigla(Sigla.ENGSOFTWARE);
                cs.setDescricao("DESCRIÇÃO_C 0"+(i+1));
                listC.add(cs);
                
                
            }
            mapCurso.put(0, listC);
            return mapCurso;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<Integer, List<Aluno>> mapAluno(int tamanho){
        
        try {
            Aluno al;
            Map<Integer, List<Aluno>> mapAl = new TreeMap<>();
            List<Aluno> listA = new ArrayList<>();
            for (int i = 0; i < tamanho; i++) {
                al = new Aluno();
                al.setNome("ALUNO 0"+(i+1));
                al.setMatricula("MATRICULA 0"+(i+1));
                al.setCurso(mapCs(1).get(0));
                listA.add(al);
                
                
            }
            mapAl.put(0, listA);
            return mapAl;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<Integer, List<Turma>> mapTurma(int tamanho){
        
        try {
            Turma tm;
            Map<Integer, List<Turma>> mapT = new TreeMap<>();
            List<Turma> listT = new ArrayList<>();
            for (int i = 0; i < tamanho; i++) {
                tm = new Turma();
                tm.setAluno(mapAluno(5).get(0));
                tm.setDescricao("TURMA_POO 2023");
                tm.setDisciplina(mapDis(1).get(0));
                tm.setProfessor(mapP(1).get(0));
                tm.setSemestre(2023_2);
                listT.add(tm);
                
                
            }
            mapT.put(0, listT);
            return mapT;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
