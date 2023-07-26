package com.cookandroid.login_front;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // 회원가입 버튼
    Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 회원가입 버튼
        signupButton = findViewById(R.id.signup_button);
        // 회원가입 버튼 이벤트
        signupButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SignupIntent.class);
            startActivity(intent);
        });
    }

}