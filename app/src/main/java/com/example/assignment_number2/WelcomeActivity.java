package com.example.assignment_number2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class WelcomeActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;

    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        if(user == null){
            Intent intent5 = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent5);
            finish();
        }

        button3 = (Button) findViewById(R.id.men_btn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenPageActivity();
            }
        });


    }

    public void openMenPageActivity() {
        Intent intent7 = new Intent(this, MenPageActivity.class);
        startActivity(intent7);
    }
}