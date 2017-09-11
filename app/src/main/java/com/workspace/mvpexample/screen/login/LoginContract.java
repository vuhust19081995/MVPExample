package com.workspace.mvpexample.screen.login;

/**
 * Created by workspace on 11/09/2017.
 */

public interface LoginContract {
    interface View {
        void onSuccess();

        void onError();
    }

    interface Presenter {
        void handlingLogin(String userName, String password);
    }


}
