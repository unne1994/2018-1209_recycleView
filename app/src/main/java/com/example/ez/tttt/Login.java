package com.example.ez.tttt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText account;
    private EditText password;
    private Button login;
    private Button error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        finview();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (account.getText().toString().equals("1")&& password.getText().toString().equals("1")){
                    setResult(RESULT_OK);
                    finish();
                }else {
                    new AlertDialog.Builder(Login.this)
                            .setTitle("錯誤")
                            .setMessage("登入失敗")
                            .setPositiveButton("OK",null)
                            .show();
                }
            }
        });
    }

    private void finview() {
        account = findViewById(R.id.account);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        error = findViewById(R.id.error);
    }
}
