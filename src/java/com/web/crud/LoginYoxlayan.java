/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.crud;

import com.web.crud.Database.*;
import java.sql.*;

/**
 *
 * @author ismayil
 */
public class LoginYoxlayan {

    public static String yoxla(Admin a) {
        String result = "";
        try {
            Statement stmt = DatabaseQosulma.getStatement();
            String query = "select * from admin where username='" + a.username + "' and password ='"
                    + a.password + "';";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                result = Result.SUCCESS;
            } else {
                result = Result.ACCESS;
            }
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e);
            result = Result.FAILURE;
        }

        return result;
    }
}
