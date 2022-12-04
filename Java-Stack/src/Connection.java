
public class Connection implements AutoCloseable {

    public Connection() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() throws Exception {  
        System.out.println("Fechando conexao");      
    }
}

/*
 * AutoCloseable is a interface that has a method close() that is called when
 */