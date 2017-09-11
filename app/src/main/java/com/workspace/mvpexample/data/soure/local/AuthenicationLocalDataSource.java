package com.workspace.mvpexample.data.soure.local;

import com.workspace.mvpexample.data.model.User;
import com.workspace.mvpexample.data.soure.AuthenicationDataSource;
import java.util.Random;

/**
 * Created by workspace on 11/09/2017.
 */

public class AuthenicationLocalDataSource implements AuthenicationDataSource {
    @Override
    public void login(String userName, String password, CallBack<User> callback) {
        if (userName.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("admin")){
            callback.onSuccess(new User(new Random().nextInt(), userName, password));
        }else {
            callback.onFailed("........... ");
        }
    }
}
