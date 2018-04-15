package com.example.sagar.evhack;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;

public class Login extends AppCompatActivity {

    Button signIn,signUp;
    TextView slogan;
    LoginButton loginButton;
    CallbackManager callbackManager;
    public static final String ISLOGIN ="ISLOGIN";
    public static final String Login="LOGIN";
    private static final String EMAIL = "EMAIL";
    public static boolean isLogin;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.parseColor("#20111111"));
        getWindow().setNavigationBarColor(Color.parseColor("#20111111"));
        sharedPreferences = getSharedPreferences(Login, MODE_PRIVATE);
        isLogin = sharedPreferences.getBoolean(ISLOGIN, false);
        if (isLogin) {
            Intent i = new Intent(Login.this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        } else {
            setContentView(R.layout.activity_login);
            signIn = findViewById(R.id.signIn);
            signUp = findViewById(R.id.signUp);
            callbackManager = CallbackManager.Factory.create();
            signIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Login.this, SignIn.class);
                    startActivity(intent);
                }
            });
            signUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Login.this, SignUp.class);
                    startActivity(intent);
                }
            });
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
}

