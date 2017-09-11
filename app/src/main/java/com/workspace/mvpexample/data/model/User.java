package com.workspace.mvpexample.data.model;

/**
 * Created by workspace on 10/09/2017.
 */

public class User {
    private int mID;
    private String mUserName;
    private String mPassword;

    public User(int ID, String userName, String password) {
        mID = ID;
        mUserName = userName;
        mPassword = password;
    }

    public int getID() {
        return mID;
    }

    public void setID(int ID) {
        mID = ID;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }
}
