package Map.Exercicio2;

public class Curso {
    
    private Sigla sigla;
    private String descricao;
    
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
    @Override
    public String toString() {
        return "Curso [sigla=" + sigla + ", descricao=" + descricao + "]";
    }
    
}
