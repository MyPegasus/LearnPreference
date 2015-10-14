package com.example.mypegasus.learnpreferenceactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyPreference2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_preference2);

        getFragmentManager().beginTransaction().add(R.id.root, new MyPreferenceFragment()).commit();
    }
}
