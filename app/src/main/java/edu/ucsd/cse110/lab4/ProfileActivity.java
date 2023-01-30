package edu.ucsd.cse110.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        loadProfile();
    }

    public void onGoBackClicked(View view) {
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveProfile();
    }

    public void loadProfile() {
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        String name = preferences.getString("name", "");
        String status = preferences.getString("status", "");

        TextView nameText = findViewById(R.id.name_textview);
        TextView statusText = findViewById(R.id.status_textview);

        nameText.setText(name);
        statusText.setText(status);
    }

    public void saveProfile() {
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        String name = ((TextView) findViewById(R.id.name_textview)).getText().toString();
        String status = ((TextView) findViewById(R.id.status_textview)).getText().toString();

        editor.putString("name", name);
        editor.putString("status", status);

        editor.apply();
    }
}