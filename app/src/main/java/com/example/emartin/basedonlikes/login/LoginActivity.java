package com.example.emartin.basedonlikes.login;

//Login
//  https://code.tutsplus.com/tutorials/creating-a-login-screen-using-textinputlayout--cms-24168
//  https://examples.javacodegeeks.com/android/android-login-example/
//  http://www.androidhive.info/2012/01/android-login-and-registration-with-php-mysql-and-sqlite/
//~http://javapapers.com/android/beautiful-android-login-screen-design-tutorial/
//http://techblogon.com/android-login-registration-screen-with-sqlite-database-example/
//http://www.androhub.com/login-signup-and-forgot-password-screen-design-android/


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.emartin.basedonlikes.R;

public class LoginActivity extends AppCompatActivity{

    private EditText username;
    private EditText password;
    private Button enter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        setupVariables();

        Button loginButton = (Button) findViewById(R.id.email_sign_in_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                authenticateLogin(view);
            }
        });
    }

    public void authenticateLogin(View view){

    }

    private void setupVariables(){

    }

}
