package com.xander.interactivestory.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.xander.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private EditText nameField;
    private Button startButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            nameField = (EditText) findViewById(R.id.nameEditText);
            startButton = (Button) findViewById(R.id.startButtom);

            startButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {
                    String name = nameField.getText().toString();
                    startStory(name);
                }
            });
        }

        protected  void onResume() {
            super.onResume();
            nameField.setText("");
        }

        private void startStory(String name) {
            Intent intent = new Intent(getApplicationContext(), StoryActivity.class);
            Resources resources = getResources();
            String key = resources.getString(R.string.key_name);
            intent.putExtra(key,name);
            startActivity(intent);
        }
}