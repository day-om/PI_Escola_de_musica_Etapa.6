package Classes;

public class Diario {

    int id;
    int aluno;
    String data;
    String presenca;
    String descricao_aula;
    String desempenho;

    public Diario() {

    }

    public Diario(int id, int aluno, String data, String presenca, String descricao_aula, String desempenho) {
        this.id = id;
        this.aluno = aluno;
        this.data = data;
        this.presenca = presenca;
        this.descricao_aula = descricao_aula;
        this.desempenho = desempenho;
    }

    public Diario(int aluno, String data, String presenca, String descricao, String desempenho) {
        this.aluno = aluno;
        this.data = data;
        this.presenca = presenca;
        this.descricao_aula = descricao;
        this.desempenho = desempenho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAluno() {
        return aluno;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPresenca() {
        return presenca;
    }

    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }

    public String getDescricao_aula() {
        return descricao_aula;
    }

    public void setDescricao_aula(String descricao_aula) {
        this.descricao_aula = descricao_aula;
    }

    public String getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(String desempenho) {
        this.desempenho = desempenho;
    }

}
