package Classes;

public class Aula {

    int id;
    int aluno;
    int horario;
    String data;

    public Aula(int aluno, String data, int horario) {
        this.aluno = aluno;
        this.data = data;
        this.horario = horario;
    }

    public Aula() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

}
