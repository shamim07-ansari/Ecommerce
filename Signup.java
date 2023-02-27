package com.example.ecomm;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.ecomm.Login.toHexString;

public class Signup {
    String name;
    String pass;
    String email;
    String mobile;
    String address;

    public static void customerSignup(String userName, String userMobile, String userEmail, String userPass, String userAddress) throws NoSuchAlgorithmException {
        String encryptedPassword = toHexString(userPass);
        String query = "insert into customers(name, email, mobile, password)values('"+userName+"','"+userEmail+"','"+userMobile+"','"+encryptedPassword+"')";
        DataBaseConnection dbConn = new DataBaseConnection();
        dbConn.insertUpdate(query);
    }
}
