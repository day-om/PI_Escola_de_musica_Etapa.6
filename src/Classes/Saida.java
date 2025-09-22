package Classes;

public class Saida {

    int id;
    String descricao;
    String data;
    Double valor;
    int usuario;

    public Saida(String descricao, String data, Double valor, int usuario) {
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.usuario = usuario;
    }

    public Saida() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

}
