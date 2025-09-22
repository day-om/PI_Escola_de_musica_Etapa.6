package Classes;

public class Professor {

    int idProfessor;
    String nome;
    int instrumento;
    String instru;

    public Professor() {

    }

    public Professor(String nome, int instrumento) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.instrumento = instrumento;

    }

    public Professor(int idProfessor, String nome, int instrumento) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.instrumento = instrumento;

    }

    public String getInstru() {
        return instru;
    }

    public void setInstru(String instru) {
        this.instru = instru;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(int instrumento) {
        this.instrumento = instrumento;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

}
