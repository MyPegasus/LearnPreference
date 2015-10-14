package com.example.mypegasus.learnpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String KEY = "key";
    private EditText editText;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getPreferences(MODE_PRIVATE);
        editor = preferences.edit();

        editText = (EditText) findViewById(R.id.editText);

        findViewById(R.id.btn_read).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = preferences.getString(KEY, "当前数值不存在");
                Toast.makeText(MainActivity.this, input, Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_write).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(KEY, editText.getText().toString());
                if(editor.commit()) {
                    Toast.makeText(MainActivity.this, "写入成功", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
