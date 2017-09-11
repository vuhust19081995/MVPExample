package com.workspace.mvpexample.screen.login;

/**
 * Created by workspace on 11/09/2017.
 */

public interface LoginContract {
    interface Presenter{
        void handlingLogin(String userName, String password);
    }
    interface LoginView{
        void onSuccess();
        void  onError();
    }
}
