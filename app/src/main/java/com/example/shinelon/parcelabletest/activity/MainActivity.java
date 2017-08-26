package com.example.shinelon.parcelabletest.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shinelon.parcelabletest.R;
import com.example.shinelon.parcelabletest.bean.Person;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
    }

    /**
     * 传递的点击事件
     *
     * @param view
     */
    public void btnClick(View view) {
        Person person = new Person();
        person.setId(0);
        person.setName("taeyang");
        person.setAge(18);
        person.setMan(true);
        Intent intent = new Intent(mContext, TwoActivity.class);
        intent.putExtra(TwoActivity.PERSON, person);
        mContext.startActivity(intent);
    }


}
