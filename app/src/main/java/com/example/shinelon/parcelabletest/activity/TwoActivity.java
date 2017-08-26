package com.example.shinelon.parcelabletest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.shinelon.parcelabletest.R;
import com.example.shinelon.parcelabletest.bean.Person;

public class TwoActivity extends AppCompatActivity {
    public static final String PERSON = "person";
    private Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        person = getIntent().getParcelableExtra(PERSON);
        Log.i("person", person.getId() + "/" + person.getName() + "/"+
                person.getAge() + "/" + person.isMan());
    }
}
