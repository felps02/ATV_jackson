public class Aluno {
    private int id_aluno;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private Curso curso;

    public Aluno(int id_aluno, String nome, String dataNascimento, String cpf, Curso curso) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public Curso getCurso() {
        return curso;
    }

    
}
