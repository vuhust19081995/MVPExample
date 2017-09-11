package com.workspace.mvpexample.data.soure;

import com.workspace.mvpexample.data.model.User;

/**
 * Created by workspace on 11/09/2017.
 */

public class AuthenicationRepository implements AuthenicationDataSource {
    private  AuthenicationDataSource mLocalDataSource;
    private  AuthenicationDataSource mRemoteDataSOurce;

    public AuthenicationRepository(AuthenicationDataSource localDataSource) {
        mLocalDataSource = localDataSource;
    }

    @Override
    public void login(String userName, String password, CallBack<User> callback) {
        mLocalDataSource.login(userName, password, callback);
    }
}
