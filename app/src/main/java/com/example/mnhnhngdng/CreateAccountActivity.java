package com.example.mnhnhngdng;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText newUsernameEditText, newPasswordEditText, confirmPasswordEditText;
    private Button createAccountSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        newUsernameEditText = findViewById(R.id.new_username);
        newPasswordEditText = findViewById(R.id.new_password);
        confirmPasswordEditText = findViewById(R.id.confirm_password);
        createAccountSubmitButton = findViewById(R.id.create_account_submit);

        createAccountSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = newUsernameEditText.getText().toString();
                String password = newPasswordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(CreateAccountActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CreateAccountActivity.this, "Account created for " + username, Toast.LENGTH_SHORT).show();
                    finish(); // Quay lại màn hình Login
                }
            }
        });
    }
}