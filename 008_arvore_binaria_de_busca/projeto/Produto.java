import java.lang.StringBuilder;

public class Produto {
    public int codigo;
    public String nome;

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\tCódigo: ").append(codigo);
        return sb.toString();
    }
}