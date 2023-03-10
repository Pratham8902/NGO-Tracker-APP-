package com.example.ngotrackermum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity5 extends AppCompatActivity {

    private EditText email,password;
    private Button button3;
    private ProgressBar progressBar;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        email = findViewById(R.id.editTextTextPersonName5);
        password = findViewById(R.id.editTextTextPassword3);
        progressBar = findViewById(R.id.progressBar);

        button3 = findViewById(R.id.button3);

        fAuth = FirebaseAuth.getInstance();

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = email.getText().toString().trim();
                String Password = password.getText().toString().trim();
                //String CPassword = password.getText().toString().trim();

                if(TextUtils.isEmpty(Email))
                {
                    email.setError("Email is required.");
                    return;
                }
                if(TextUtils.isEmpty(Password))
                {
                    password.setError("Password is required.");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);

                fAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(MainActivity5.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                        }
                        else
                        {
                            Toast.makeText(MainActivity5.this, "Invalid Email-ID or Password", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}