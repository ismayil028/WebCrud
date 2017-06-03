/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.crud.Worker;

import com.web.crud.Admin;
import com.web.crud.Database.*;
import com.web.crud.Result;
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
            String query = "select * from admin where username='" + a.getUsername() + "' and password ='"
                    + a.getPasswod() + "';";
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
