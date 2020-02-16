import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ProfessorTitular professorTitular1 = new ProfessorTitular("Vinny", "idk", 0, 10, "ensinar");
//        ProfessorTitular professorTitular2 = new ProfessorTitular("Joao", "idk", 0, 11, "ensinar");
//        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto("Jonas", "idk", 0, 12, 100);
//        ProfessorAdjunto professorAdjunto2 = new ProfessorAdjunto("Ivo", "idk", 0, 13, 200);
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        digitalHouseManager.registrarAluno("kennedy", "dourado", 100);
        digitalHouseManager.registrarAluno("hycaro", "dourado", 101);
        digitalHouseManager.registrarAluno("paulo", "dourado", 102);
        digitalHouseManager.registrarAluno("washington", "dourado", 103);
        digitalHouseManager.registrarAluno("jao", "dourado", 104);
        digitalHouseManager.registrarAluno("jose", "dourado", 105);
        digitalHouseManager.registrarAluno("dorado", "dourado", 100);
        digitalHouseManager.registrarProfessorTitular("vinny", "idk", 10, "ensinar");
        digitalHouseManager.registrarProfessorTitular("joao", "idk", 11, "ensinar");
        digitalHouseManager.registrarProfessorAdjunto("jonas", "idk", 12, 100);
        digitalHouseManager.registrarProfessorAdjunto("ivo", "idk", 13, 100);
        digitalHouseManager.registrarCurso("fullstack", 7, 1);
        digitalHouseManager.registrarCurso("halfstack", 5, 2);
        digitalHouseManager.registrarCurso("halfstack", 5, 2);
        digitalHouseManager.alocarProfessores(7, 10, 12);
        digitalHouseManager.alocarProfessores(5, 11, 13);
        digitalHouseManager.matricularAluno(100, 7);
        digitalHouseManager.matricularAluno(101, 7);
        digitalHouseManager.matricularAluno(102, 5);
        digitalHouseManager.matricularAluno(103, 5);
        digitalHouseManager.matricularAluno(104, 5);

//        digitalHouseManager.excluirCurso(5);
//        digitalHouseManager.excluirProfessor(11);

        System.out.println(digitalHouseManager.listaDeCursos);
        System.out.println(digitalHouseManager.listaDeAlunos);
        System.out.println(digitalHouseManager.listaDeMatriculas);
        System.out.println(digitalHouseManager.listaDeProfessores);






















































//        Aluno aluno1 = new Aluno("Kennedy", "Dourado", 2020);
//        Aluno aluno2 = new Aluno("Hodor", "Hodor", 2020);
//        Aluno aluno3 = new Aluno("num3", "Hodor", 511);
//        Aluno aluno4 = new Aluno("num4", "Hodor", 53);
//        Aluno aluno5 = new Aluno("num5", "Hodor", 909);
//        Aluno aluno6 = new Aluno("teste", "Hodor", 511);
//        Curso curso1 = new Curso("idk", 1010);
//        Curso curso2 = new Curso("nik", 1010);
//        Professor professor1 = new Professor("Vinny", "kindred", 10, 1020);
//        Professor professor2 = new Professor("Joao", "Felipe", 5, 1020);
//        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto("prof", "adjunto", 2, 10, 123);
//        ProfessorTitular professorTitular = new ProfessorTitular("Prof", "titular", 20, 10, "enrolar");
//        List<Aluno>listaDeAlunos = new ArrayList<>();
//        Curso curso = new Curso("fullstack", 2020, professorTitular, professorAdjunto, 30, listaDeAlunos);
//        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
//
//
//        System.out.println("teste equals aluno");
//        System.out.println(aluno1.equals(aluno2));
//        System.out.println("------------------");
//        System.out.println("teste equals curso");
//        System.out.println(curso1.equals(curso2));
//        System.out.println("-------------------");
//        System.out.println("teste equals professor");
//        System.out.println(professor1.equals(professor2));
//        System.out.println("--------------------");
//        System.out.println("teste equals prof herdados");
//        System.out.println(professorAdjunto.equals(professorTitular));
//        System.out.println("-----------------");
//        System.out.println("prosseguindo após a falha");
//        System.out.println("teste adicionar e remover alunos");
//        System.out.println(curso.adicionarUmAluno(aluno1));
//        System.out.println(curso.adicionarUmAluno(aluno2));
//        System.out.println(curso.adicionarUmAluno(aluno3));
//        System.out.println(curso.adicionarUmAluno(aluno4));
//        System.out.println(curso.adicionarUmAluno(aluno5));
//        System.out.println(curso.adicionarUmAluno(aluno6));
//        System.out.println(curso);
//        curso.excluirAluno(aluno1);
//        digitalHouseManager.registrarCurso("full stack", 20, 20);
//        System.out.println(digitalHouseManager.listaDeCursos);
//        digitalHouseManager.excluirCurso(20);
//        System.out.println(digitalHouseManager.listaDeCursos);
    }
}
