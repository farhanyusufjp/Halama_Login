package com.example.halamanlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.EthiopicCalendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String Extra_data = "Extra_data";

    String data;
    Button login;
    Button reset;
    EditText username;
    EditText password;
    String pass, user, userpassword, userDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.btn_login);
        reset = findViewById(R.id.btn_reset);
        username = findViewById(R.id.et_id);
        password = findViewById(R.id.et_password);
        login.setOnClickListener(this);
        reset.setOnClickListener(this);
        userDB = "dennys";
        userpassword = "dennys";
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.btn_login:
                user = username.getText().toString();
                pass = password.getText().toString();
                data = username.getText().toString();

                if (user.equals(userDB) && (pass.equals(userpassword))) {
                    Intent intent = new Intent(MainActivity.this, Logout.class);
                    intent.putExtra(Extra_data, data);
                    startActivity(intent);
                }
                else  {
                    //Toast toast = Toast.makeText(this, "username atau password salah", Toast.LENGTH_LONG);
                    //toast.show();
                    // cara lain toast
                    Toast.makeText(getApplicationContext(), "username atau password salah", Toast.LENGTH_LONG).show();
                }


                break;
            case R.id.btn_reset:
                username.setText("");
                password.setText("");


        }
    }

}

