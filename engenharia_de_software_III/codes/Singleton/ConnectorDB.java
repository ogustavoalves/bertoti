package engenharia_de_software_III.codes.Singleton;

public class ConnectorDB {
    private static ConnectorDB instance;
    private String connectionString;

    private ConnectorDB(String connectionString) {
        this.connectionString = connectionString;
        // Simula inicialização da conexão
        System.out.println("ConnectorDB: Initializing connection...");
    }

    public static ConnectorDB getInstance(String connectionString) {
        if (instance == null) {
            synchronized (ConnectorDB.class) {
                if (instance == null) {
                    instance = new ConnectorDB(connectionString);
                }
            }
        }
        return instance;
    }

// Métodos específicos para interagir com o conector do banco de dados
    public void executeQuery(String query) {
            System.out.println("ConnectorDB: Executing query: " + query);
        }
}