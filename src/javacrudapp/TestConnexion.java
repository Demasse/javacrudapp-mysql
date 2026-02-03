package javacrudapp;

public class TestConnexion {

    public static void main(String[] args) {
        try {
            DBConnection.getConnection();
            System.out.println(" Connexion PostgreSQL réussie");
        } catch (Exception e) {
            System.out.println("❌ Erreur de connexion");
            e.printStackTrace();
        }
    }
}
