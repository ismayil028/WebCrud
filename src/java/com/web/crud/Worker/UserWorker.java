package com.web.crud.Worker;

import java.sql.*;
import com.web.crud.*;
import com.web.crud.Database.DatabaseQosulma;

public class UserWorker {

    public static String addUser(User a) {
        String result = "";
        try {
            String query = "insert into user(name,age,gender) values(?,?,);";
            PreparedStatement ps = DatabaseQosulma.getPreparedStatement(query);
            ps.setString(1, a.getName());
            ps.setInt(2, a.getAge());
            ps.setString(3, a.getGender());
            int i = ps.executeUpdate();
            if (i == 1) {
                result = Result.SUCCESS;
            } else {
                result = Result.PROBLEM;
            }

        } catch (SQLException e) {
            result = Result.FAILURE;
        }

        return result;
    }
}
