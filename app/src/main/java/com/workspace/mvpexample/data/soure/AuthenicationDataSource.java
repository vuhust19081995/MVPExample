package com.workspace.mvpexample.data.soure;

import com.workspace.mvpexample.data.model.User;

/**
 * Created by workspace on 11/09/2017.
 */

public  interface AuthenicationDataSource {
    interface CallBack<T>{
        void onSuccess(T data);

        void onFailed(String msg);
    }

    void login(String userName, String password, CallBack<User> callback);
}
