package com.example.mypegasus.learnpreferenceactivity;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by MyPegasus on 2015/10/13.
 */
public class MyPreferenceActivity extends PreferenceActivity {

    /**
     * checkBoxPreference
     * listPreference
     * edittextPreference
     * */

    PreferenceManager manager;
    CheckBoxPreference checkBoxPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.mypreference);
        manager = getPreferenceManager();
        checkBoxPreference = (CheckBoxPreference) manager.findPreference("checkBox");
        Toast.makeText(MyPreferenceActivity.this, "当前的状态为：" + checkBoxPreference.isChecked(), Toast.LENGTH_SHORT).show();

        ListPreference listPreference = (ListPreference) manager.findPreference("list");
        Toast.makeText(MyPreferenceActivity.this, listPreference.getEntry() + "的开发环境为：" + listPreference.getValue(), Toast.LENGTH_SHORT).show();

        EditTextPreference editTextPreference = (EditTextPreference) manager.findPreference("editText");
        Toast.makeText(MyPreferenceActivity.this, "您输入的内容为：" + editTextPreference.getText(), Toast.LENGTH_SHORT).show();

    }
}
