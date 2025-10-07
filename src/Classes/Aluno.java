package Classes;

public class Aluno {

    int id;
    String nome;
    String idade;
    String cpf;
    int pacote;
    int instrumento;
    int nivel;

    public Aluno() {

    }

    ;

    public Aluno(String nome, String idade, String cpf, int pacote, int nivel, int instrumento) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.pacote = pacote;
        this.nivel = nivel;
        this.instrumento = instrumento;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPacote() {
        return pacote;
    }

    public void setPacote(int pacote) {
        this.pacote = pacote;
    }

    public int getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(int instrumento) {
        this.instrumento = instrumento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean verificarPresenca(String[] registros, String nomeAluno) {
        if (registros == null || nomeAluno == null || nomeAluno.isEmpty()) {
            throw new IllegalArgumentException("Parâmetros inválidos");
        }

        for (String registro : registros) {
            if (registro.equalsIgnoreCase(nomeAluno)) {
                return true; // o aluno está presente
            }
        }
        return false; // o aluno não está presente
    }

}
