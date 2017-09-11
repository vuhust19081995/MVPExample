package com.workspace.mvpexample.screen.login;

/**
 * Created by workspace on 11/09/2017.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.LoginView mLoginView;

    public LoginPresenter(LoginContract.LoginView loginView) {
        this.mLoginView = loginView;
    }

    @Override
    public void handlingLogin(String userName, String password) {
        if(userName.equals("Nguyen Van Vu") && password.equals("123456")){
            mLoginView.onSuccess();
        }else{
            mLoginView.onError();
        }
    }
}
