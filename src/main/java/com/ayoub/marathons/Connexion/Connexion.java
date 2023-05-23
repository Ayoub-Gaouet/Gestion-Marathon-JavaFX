package com.ayoub.atelier_8.Connexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    public static Connection Connexion() {
        Connection con = null ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/article", "root", "");
            System.out.println("connexion effectuee");

        } catch (Exception e) {
            System.out.println("impossible de se connecter à la base de donnes");
            e.printStackTrace();

        }
        return con;
    }
}
