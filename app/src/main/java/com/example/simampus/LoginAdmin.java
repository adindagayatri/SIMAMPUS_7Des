package com.example.simampus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class LoginAdmin extends AppCompatActivity {
    EditText mUsername, mPassword;
    Button btnLogin;
    DBHelperLogin dbHelper;
    TextView btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        dbHelper = new DBHelperLogin(this);
        mUsername = (EditText) findViewById(R.id.admin_username);
        mPassword = (EditText) findViewById(R.id.admin_password);
        btnLogin = (Button) findViewById(R.id.login_admin);
        btnRegister = (TextView) findViewById(R.id.regis);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tUsername = mUsername.getText().toString().trim();
                String tPassword = mPassword.getText().toString().trim();
                Boolean res = dbHelper.checkUser(tUsername, tPassword);
                if(res == true){
                    Intent intent = new Intent(com.example.simampus.LoginAdmin.this, MainActivity.class);
                    Toast.makeText(com.example.simampus.LoginAdmin.this, "Login Success !", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }else{
                    Toast.makeText(com.example.simampus.LoginAdmin.this,"Login Error",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginAdmin.this, RegisterAdmin.class);
                startActivity(intent);
                }
            });
    }
}