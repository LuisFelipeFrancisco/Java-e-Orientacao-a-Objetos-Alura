
public class TestConnection {
   
    public static void main(String[] args) throws Exception {
        
        try (Connection conn = new Connection()) {
            conn.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }
    }
    
}

/*
 * Finally is always executed, even if there is an exception.
 */