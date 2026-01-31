package javacrudapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UserDAO {

    private Connection connection;

    public UserDAO() throws SQLException {
        connection = DBConnection.getConnection();
    }

    // CREATE user
    public void insertUser(User user) {
        String sql = "INSERT INTO users (first_name, last_name, email, country) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getCountry());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Utilisateur ajouté avec succès ✅");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout ❌");
        }
    }

    // READ : récupérer tous les utilisateurs
    public List<User> getUsers() { 
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while(rs.next()){
                int id = rs.getInt("id");
                String fName = rs.getString("first_name");
                String lName = rs.getString("last_name");
                String email = rs.getString("email");
                String country = rs.getString("country");

                users.add(new User(id, fName, lName ,email , country ));
            }

        } catch(SQLException e){
            e.printStackTrace();
        }

        return users;
    }
    
    //update
    
public int updateUser(User user) {
    String sql = "UPDATE users SET first_name=?, last_name=?, email=?, country=? WHERE id=?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, user.getFirstName());
        stmt.setString(2, user.getLastName());
        stmt.setString(3, user.getEmail());
        stmt.setString(4, user.getCountry());
        stmt.setInt(5, user.getId());

        int rowsUpdated = stmt.executeUpdate();
        return rowsUpdated;  // retourne le nombre de lignes affectées
    } catch (SQLException e) {
        e.printStackTrace();
        return 0;
    }
}

//delete
public void deleteUser(int id) {
    String sql = "DELETE FROM users WHERE id=?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setInt(1,id);
        stmt.executeUpdate();
        
         // retourne le nombre de lignes affectées
    } catch (SQLException e) {
        e.printStackTrace();
       
    }
}

}
