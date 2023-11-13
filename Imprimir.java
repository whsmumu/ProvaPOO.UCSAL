package Map.Exercicio2;

public class Imprimir {
    static BaseDados base = new BaseDados();
   public void impCs(){
    System.out.println("**** CURSOS: **** ");
    System.out.println(base.mapCs(1));
    System.out.println("\n");
   }
   public void impDis(){
    System.out.println("**** DISCIPLINAS: ****");
    System.out.println(base.mapDis(2));
    System.out.println("\n");
   }
   public void impProf(){
    System.out.println("**** PROFESSORES: **** ");
    System.out.println(base.mapP(1));
    System.out.println("\n");
   }
   public void impAln(){
    System.out.println("**** ALUNOS: **** ");
    System.out.println(base.mapAluno(3));
    System.out.println("\n");
   }
   public void impTurma(){
    System.out.println("**** TURMAS: ****");
    System.out.println(base.mapTurma(1));
    System.out.println("\n");
   }
}
