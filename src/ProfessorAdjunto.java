import java.util.Objects;

public class ProfessorAdjunto extends Professor {
    private Integer qtdHrsMonitoria;

    public ProfessorAdjunto() {
    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codProfessor, Integer qtdHrsMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codProfessor);
        this.qtdHrsMonitoria = qtdHrsMonitoria;
    }

    public Integer getQtdHrsMonitoria() {
        return qtdHrsMonitoria;
    }

    public void setQtdHrsMonitoria(Integer qtdHrsMonitoria) {
        this.qtdHrsMonitoria = qtdHrsMonitoria;
    }


}
