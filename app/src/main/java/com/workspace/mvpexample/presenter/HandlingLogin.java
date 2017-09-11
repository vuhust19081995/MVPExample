package com.workspace.mvpexample.presenter;


import com.workspace.mvpexample.view.ViewHandlingLogin;

/**
 * Created by workspace on 10/09/2017.
 */

public class HandlingLogin implements LoginPresenterContract {
    private ViewHandlingLogin viewHandlingLogin;

    public HandlingLogin(ViewHandlingLogin viewHandlingLogin) {
        this.viewHandlingLogin = viewHandlingLogin;
    }

    @Override
    public void handlingLogin(String userName, String password) {
        if(userName.equals("Nguyen Van Vu") && password.equals("123456")){
            viewHandlingLogin.onSuccess();
        }else{
            viewHandlingLogin.onError();
        }
    }
}
