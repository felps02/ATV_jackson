import java.util.ArrayList;

public class Curso {
    private int id_curso;
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();  // Lista de alunos do curso

    public Curso(int id_curso, String nome, int cargaHoraria, Professor professor) {
        this.id_curso = id_curso;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    // Método getId para retornar o ID do curso
    public int getId() {
        return id_curso;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    // Método para adicionar aluno ao curso
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método getAlunos para retornar a lista de alunos do curso
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

   
}
