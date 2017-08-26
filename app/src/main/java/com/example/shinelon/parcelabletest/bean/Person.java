package com.example.shinelon.parcelabletest.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;


/**
 * Created by Peng on 2017/8/26.
 */

public class Person implements Parcelable {
    private int id;
    private String name;
    private int age;
    private boolean isMan;

    public Person() {
    }


    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(age);
        parcel.writeByte((byte) (isMan ? 1 : 0));
        parcel.writeString(name);
    }

    protected Person(Parcel in) {
        id = in.readInt();
        age = in.readInt();
        isMan = in.readByte() != 0;
        name = in.readString();
    }
}
