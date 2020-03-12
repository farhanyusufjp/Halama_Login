package com.example.halamanlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.halamanlogin.MainActivity.Extra_data;

public class Logout extends AppCompatActivity implements View.OnClickListener {

    Button Logout;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        tv = findViewById(R.id.TV);
        Logout = findViewById(R.id.btn_logout);

        Logout.setOnClickListener(this);


        Intent i = getIntent();
        String ipesan = i.getStringExtra(Extra_data);
        tv.setText(ipesan);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_logout:
                Intent pindah = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(pindah);
        }

    }
}
