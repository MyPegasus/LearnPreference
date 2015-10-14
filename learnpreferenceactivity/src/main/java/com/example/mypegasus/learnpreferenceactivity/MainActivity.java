package com.example.mypegasus.learnpreferenceactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String PREFERENCE_TAG = "MyPreferenceFragment";
    private PreferenceFragment preferenceFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyPreferenceActivity.class));
            }
        });
        findViewById(R.id.btn_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*preferenceFragment = (PreferenceFragment) getFragmentManager().findFragmentByTag(PREFERENCE_TAG);
                if(preferenceFragment == null) {
                    preferenceFragment = new MyPreferenceFragment();
                    getFragmentManager().beginTransaction().addToBackStack(null).add(R.id.root, preferenceFragment, PREFERENCE_TAG).commit();
                } else {
                    getFragmentManager().beginTransaction().addToBackStack(null).show(preferenceFragment).commit();
                }*/
                startActivity(new Intent(MainActivity.this, MyPreference2Activity.class));
            }
        });

        // 从其他的Activity中读取PreferenceActivity中的数据
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isChecked = preferences.getBoolean("checkBox", false);
        Toast.makeText(MainActivity.this, "checkBox :" + isChecked, Toast.LENGTH_SHORT).show();
    }
}
