package Classes;

public class Adm {

    int id;
    String nome;
    int funcao;

    public Adm() {

    }

    public Adm(String nome, int funcao) {
        this.nome = nome;
        this.funcao = funcao;
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

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }
}
