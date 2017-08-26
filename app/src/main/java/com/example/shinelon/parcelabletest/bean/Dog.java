package com.example.shinelon.parcelabletest.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Peng on 2017/8/26.
 */

public class Dog implements Parcelable {

    private String name;
    private int age;
    private boolean isMan;

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
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
        dest.writeByte(this.isMan ? (byte) 1 : (byte) 0);
    }

    public Dog() {
    }

    protected Dog(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.isMan = in.readByte() != 0;
    }

    public static final Creator<Dog> CREATOR = new Creator<Dog>() {
        @Override
        public Dog createFromParcel(Parcel source) {
            return new Dog(source);
        }

        @Override
        public Dog[] newArray(int size) {
            return new Dog[size];
        }
    };
}
