package com.example.ngotrackermum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class MainActivity4 extends AppCompatActivity {

    private EditText name,address,number,email,password,cpassword;
    private Button button4;
    private CheckBox checkBox;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        name = findViewById(R.id.editTextTextPersonName);
        address = findViewById(R.id.editTextTextPersonName2);
        number = findViewById(R.id.editTextTextPersonName3);
        email = findViewById(R.id.editTextTextPersonName4);
        password = findViewById(R.id.editTextTextPassword);
        cpassword = findViewById(R.id.editTextTextPassword2);

        button4 = findViewById(R.id.button4);

        fAuth = FirebaseAuth.getInstance();

        if(fAuth.getCurrentUser() != null)
        {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = email.getText().toString().trim();
                String Password = password.getText().toString().trim();
                String CPassword = password.getText().toString().trim();

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
                if(Password.equals(CPassword))
                {
                    button4.setEnabled(true);
                }
                else
                {
                    cpassword.setError("Password and Confirm Password should match.");
                    return;
                    //button4.setEnabled(false);
                }

                Task<AuthResult> account_created = fAuth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(MainActivity4.this, "Account created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        } else {
                            Toast.makeText(MainActivity4.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}