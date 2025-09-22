package Classes;

public class Entrada {

    int id;
    int aluno;
    String data;
    Double valor;
    int formaPagamento;
    int usuario;

    public Entrada(String data, Double valor, int aluno, int formaPagamento, int usuario) {
        this.aluno = aluno;
        this.data = data;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.usuario = usuario;
    }

    public Entrada() {

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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

}
