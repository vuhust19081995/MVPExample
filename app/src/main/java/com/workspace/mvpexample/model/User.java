package com.workspace.mvpexample.model;

/**
 * Created by workspace on 10/09/2017.
 */

public class User {
    private int mID;
    private String mUserName;
    private String mPassword;

    public User(int mID, String mUserName, String mPassword) {
        this.mID = mID;
        this.mUserName = mUserName;
        this.mPassword = mPassword;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
}
