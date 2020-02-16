import java.util.Objects;

public class Professor {
    private String nomeProf;
    private String sobrenomeProf;
    private Integer tempoDeCasa;
    private Integer codProfessor;


    public Professor() {
    }

    public Professor(String nome, String sobrenome, Integer tempoDeCasa, Integer codProfessor) {
        this.nomeProf = nome;
        this.sobrenomeProf = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codProfessor = codProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Professor professor = (Professor) o;
        return Objects.equals(getCodProfessor(), professor.getCodProfessor());
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getSobrenomeProf() {
        return sobrenomeProf;
    }

    public void setSobrenomeProf(String sobrenomeProf) {
        this.sobrenomeProf = sobrenomeProf;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProf='" + nomeProf + '\'' +
                ", sobrenomeProf='" + sobrenomeProf + '\'' +
                ", tempoDeCasa=" + tempoDeCasa +
                ", codProfessor=" + codProfessor +
                '}';
    }
}
