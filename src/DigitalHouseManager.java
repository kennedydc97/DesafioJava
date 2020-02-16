import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno> listaDeAlunos = new ArrayList<>();
    List<Professor> listaDeProfessores = new ArrayList<>();
    List<Matricula> listaDeMatriculas = new ArrayList<>();
    List<Curso> listaDeCursos = new ArrayList<>();

    public DigitalHouseManager() {
    }

    public DigitalHouseManager(List<Aluno> listaDeAlunos, List<Professor> listaDeProfessores, List<Matricula> listaDeMatriculas, List<Curso> listaDeCursos) {
        this.listaDeAlunos = listaDeAlunos;
        this.listaDeProfessores = listaDeProfessores;
        this.listaDeMatriculas = listaDeMatriculas;
        this.listaDeCursos = listaDeCursos;
    }

    public void registrarCurso(String nome, Integer codCurso, Integer qtdMaxAlunos) {
        Curso curso = new Curso(nome, codCurso, qtdMaxAlunos);
//        for (Curso i : listaDeCursos) {
//            if (i.getCodCurso().equals(codCurso)) {
//                System.out.println("curso ja registrado");
//                break;
//            }
//        }
//        listaDeCursos.add(curso);
//        System.out.println("curso de " + curso.getNomeCurso() + " registrado com sucesso");
        if (listaDeCursos.contains(curso)) {
            System.out.println("curso ja registrado");
        } else {
            listaDeCursos.add(curso);
            System.out.println("curso registrado com sucesso");
        }
    }

    public void excluirCurso(Integer codCurso) {
        for (Curso i : listaDeCursos) {
            if (i.getCodCurso().equals(codCurso)) {
                listaDeCursos.remove(i);
                System.out.println("curso de " + i.getNomeCurso() + " excluido com sucesso");
                break;
            } else {
                System.out.println("curso não encontrado");
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codProf, Integer qtdDeHrs) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0, codProf, qtdDeHrs);
        if(listaDeProfessores.contains(professorAdjunto)){
            System.out.println("professor ja registrado");
        }else{
            listaDeProfessores.add(professorAdjunto);
            System.out.println("professor " + professorAdjunto.getNomeProf() + " registrado com sucesso.");
        }
//        for (Professor i : listaDeProfessores) {
//            if (i.getCodProfessor().equals(professorAdjunto.getCodProfessor())) {
//                System.out.println("professor ja registrado");
//                break;
//            }
//        }
//        listaDeProfessores.add(professorAdjunto);
//        System.out.println("professor " + professorAdjunto.getNomeProf() + " registrado com sucesso.");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codProf, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, 0, codProf, especialidade);

        if (listaDeProfessores.contains(professorTitular)) {
            System.out.println("professor ja registrado");
        } else {
            listaDeProfessores.add(professorTitular);
            System.out.println("professor " + professorTitular.getNomeProf() + " registrado com sucesso");
        }
//        for (Professor i : listaDeProfessores) {
//            if (i.getCodProfessor().equals(professorTitular.getCodProfessor())) {
//                System.out.println("professor ja registrado");
//                break;
//            }
//        }
//        listaDeProfessores.add(professorTitular);
//        System.out.println("professor " + professorTitular.getNomeProf() + " registrado com sucesso.");
    }

    public void excluirProfessor(Integer codProf) {
//        for (Professor i : listaDeProfessores) {
//            if(i.getCodProfessor().equals(codProf)){
//                listaDeProfessores.remove(i);
//            }
//        }
        if (listaDeProfessores.removeIf(i -> i.getCodProfessor().equals(codProf))) {
            System.out.println("professor removido com sucesso");
        } else {
            System.out.println("professor não encontrado");
        }
    }

    public void registrarAluno(String nome, String sobrenome, Integer codAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codAluno);
        if (listaDeAlunos.contains(aluno)) {
            System.out.println("aluno ja registrado");
        } else {
            listaDeAlunos.add(aluno);
            System.out.println("aluno " + aluno.getNome() + " registrado com sucesso");
        }
    }

    public void matricularAluno(Integer codAluno, Integer codCurso) {
        Curso curso = null;
        Aluno aluno = null;
        Matricula matricula = new Matricula(aluno, curso, new Date());
        for (Curso i : listaDeCursos) {
            if (i.getCodCurso().equals(codCurso)) {
                curso = i;
                if (curso.listaDeAlunos.size() < curso.getQtdMaxAlunos()) {
                    for (Aluno j : listaDeAlunos) {
                        if (j.getCodAluno().equals(codAluno)) {
                            aluno = j;
                            matricula.setAluno(aluno);
                            matricula.setCurso(curso);
                            matricula.setDataDeMatricula(new Date());
                            listaDeMatriculas.add(matricula);
                            curso.listaDeAlunos.add(aluno);
                            break;
                        }
                    }
                } else {
                    System.out.println("não há vagas");
                    break;
                }
            }
        }
    }

    public void alocarProfessores(Integer codCurso, Integer codProfTit, Integer codProfAdj) {
        ProfessorTitular professorTitular = null;
        ProfessorAdjunto professorAdjunto = null;
        Curso curso = null;

        for (Professor i : listaDeProfessores) {
            if (i.getCodProfessor().equals(codProfTit)) {
                professorTitular = (ProfessorTitular) i;
                break;
            }
        }
        if (professorTitular == null) {
            System.out.println("professor titular não encontrado");
        }

        for (Professor j : listaDeProfessores) {
            if (j.getCodProfessor().equals(codProfAdj)) {
                professorAdjunto = (ProfessorAdjunto) j;
                break;
            }
        }
        if (professorAdjunto == null) {
            System.out.println("professor adjunto não encontrado");
        }

        for (Curso k : listaDeCursos) {
            if (k.getCodCurso().equals(codCurso)) {
                curso = k;
                curso.setProfessorTitular(professorTitular);
                curso.setProfessorAdjunto(professorAdjunto);
                break;
            }
        }
        if (curso == null) {
            System.out.println("curso não encontrado");
        }
    }

    @Override
    public String toString() {
        return "DigitalHouseManager{" +
                "listaDeAlunos=" + listaDeAlunos +
                ", listaDeProfessores=" + listaDeProfessores +
                ", listaDeMatriculas=" + listaDeMatriculas +
                ", listaDeCursos=" + listaDeCursos +
                '}';
    }
}