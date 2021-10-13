package javaPilha;

public class Conexao implements AutoCloseable {
    public Conexao() throws IllegalAccessException {
        System.out.println("Abrindo conexão");
        throw new IllegalAccessException();
    }

    public void leDados() throws IllegalAccessException {
        System.out.println("Recebendo dados");
        throw new IllegalAccessException();
    }

    @Override
    public void close() {
        System.out.println("Fechando conexão");
    }
}
