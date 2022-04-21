package com.atlantic.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

public class profile extends AppCompatActivity {
    //21 April 2022 | 10119289 | Dhifo Aksa Hermawan |IF7
    MaterialButtonToggleGroup toggleGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toggleGroup = findViewById(R.id.btnToggleGroup);
        toggleGroup.addOnButtonCheckedListener((group, checkedId, isChecked) -> {
            MaterialButton btnLogout = findViewById(R.id.logout);
            MaterialButton btnProfile = findViewById(R.id.profile);
            MaterialButton btnHome = findViewById(R.id.home);

            if (btnLogout.isChecked()) {
                startActivity(new Intent(getApplicationContext(),login.class));
                Toast.makeText(getApplicationContext(), "Anda Berhasil Logout", Toast.LENGTH_SHORT).show();
            } else if (btnProfile.isChecked()) {
                startActivity(new Intent(getApplicationContext(),profile.class));
                Toast.makeText(getApplicationContext(), "Halaman Profile", Toast.LENGTH_SHORT).show();
            } else if (btnHome.isChecked()) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                Toast.makeText(getApplicationContext(), "Halaman Utama", Toast.LENGTH_SHORT).show();
            }
        });
    }
}