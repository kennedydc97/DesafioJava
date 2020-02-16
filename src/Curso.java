import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private Integer codCurso;
    private Integer qtdMaxAlunos;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    List<Aluno> listaDeAlunos = new ArrayList<>();


    public Curso() {
    }

    public Curso(String nomeCurso, Integer codCurso) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
    }

    public Curso(String nomeCurso, Integer codCurso, Integer qtdMaxAlunos) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public Curso(String nomeCurso, Integer codCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer qtdMaxAlunos, List<Aluno>listaDeAlunos) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.qtdMaxAlunos = qtdMaxAlunos;
        this.listaDeAlunos = listaDeAlunos;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
//        for (Aluno i : listaDeAlunos) {
//            if (umAluno.equals(i)) {
//                System.out.println("aluno ja adicionado");
//                return false;
//            }
//        }
//        if (listaDeAlunos.size() < qtdMaxAlunos) {
//            listaDeAlunos.add(umAluno);
//            return true;
//        } else {
//            System.out.println("não há vagas disponiveis para esse curso");
//            return false;
//        }
        if (listaDeAlunos.size() < qtdMaxAlunos) {
            if (listaDeAlunos.contains(umAluno)) {
                System.out.println("aluno ja adicionado");
                return false;
            } else {
                listaDeAlunos.add(umAluno);
                return true;
            }
        } else {
            System.out.println("não há vagas disponiveis para esse curso");
            return false;
        }
    }

    /**
    * @param umAluno
    * @
    *
    * */
    public void excluirAluno(Aluno umAluno) {
//        for (Aluno i : listaDeAlunos) {
//            if(umAluno.equals(i)){
//                listaDeAlunos.remove(i);
//                System.out.println("aluno " + umAluno.getNome() + " removido com sucesso");
//                break;
//            }else{
//                System.out.println("aluno " + umAluno + " não encontrado");
//            }
//        }
        listaDeAlunos.remove(umAluno);
        System.out.println("aluno " + umAluno.getNome() + " removido com sucesso");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codCurso.equals(curso.codCurso);
    }


    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public Integer getQtdMaxAlunos() {
        return qtdMaxAlunos;
    }

    public void setQtdMaxAlunos(Integer qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", codCurso=" + codCurso +
                ", qtdMaxAlunos=" + qtdMaxAlunos +
                ", professorTitular=" + professorTitular +
                ", professorAdjunto=" + professorAdjunto +
                ", listaDeAlunos=" + listaDeAlunos +
                '}';
    }
}
