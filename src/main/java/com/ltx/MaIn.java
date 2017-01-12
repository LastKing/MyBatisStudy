package com.ltx;

import java.io.IOException;

/**
 * Created by Rain on 2017/1/12.
 */
public class MaIn {

    public static void main(String[] args) throws IOException {
        Test testUser = new Test();
        testUser.getUserById(1);
        testUser.getUserList("%");
//        testUser.addUser();
        testUser.updateUser();
        testUser.deleteUser(2);
    }

}
