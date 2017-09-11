package com.workspace.mvpexample.screen.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.workspace.mvpexample.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView,View.OnClickListener {
    private EditText edtUserName;
    private EditText edtPassword;
    private Button btnButton;
    private LoginContract.Presenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUserName = (EditText) findViewById(R.id.edtUserName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnButton = (Button) findViewById(R.id.btnLogin);
        btnButton.setOnClickListener(this);
        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public void onClick(View view) {
        String userName = edtUserName.getText().toString();
        String password = edtPassword.getText().toString();
        loginPresenter.handlingLogin(userName,password);
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {
        Toast.makeText(this, "Login fail!", Toast.LENGTH_SHORT).show();
    }
}
