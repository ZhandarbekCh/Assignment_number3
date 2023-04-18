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
    Button button4;
    Button button8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        auth = FirebaseAuth.getInstance();
        button4 = findViewById(R.id.logout);
        button8 = findViewById(R.id.nextpg);
        user = auth.getCurrentUser();
        if(user == null){
            Intent intent5 = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent5);
            finish();
        }



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent5 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent5);
                finish();
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstpageActivity();
            }
        });
    }

    public void openFirstpageActivity(){
        Intent intent10 = new Intent(this,FirstpageActivity.class);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) return;
        Boolean isAdmin = user.getEmail().equals("qwerty@gmail.com");
        intent10.putExtra("IS_ADMIN", true);
        startActivity(intent10);
    }

}