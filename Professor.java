public class Professor {
    private int id_professor;
    private String nome;
    private String departamento;

    public Professor(int id_professor, String nome, String departamento) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.departamento = departamento;
    }

    // Método getId para retornar o ID do professor
    public int getId() {
        return id_professor;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    
}
