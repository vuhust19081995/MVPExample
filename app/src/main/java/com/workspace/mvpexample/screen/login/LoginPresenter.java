package com.workspace.mvpexample.screen.login;

import com.workspace.mvpexample.data.model.User;
import com.workspace.mvpexample.data.soure.AuthenicationDataSource;

/**
 * Created by workspace on 11/09/2017.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View mLoginView;
    private AuthenicationDataSource mRepository;

    public LoginPresenter(LoginContract.View view, AuthenicationDataSource repository) {
        mLoginView = view;
        mRepository = repository;
    }

    @Override
    public void handlingLogin(String userName, String password) {
        mRepository.login(userName, password, new AuthenicationDataSource.CallBack<User>() {
            @Override
            public void onSuccess(User data) {
                mLoginView.onSuccess();
            }

            @Override
            public void onFailed(String msg) {
                mLoginView.onError();
            }
        });
    }
}
