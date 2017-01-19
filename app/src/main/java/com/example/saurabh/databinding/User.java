package com.example.saurabh.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by saurabh on 17/1/17.
 */

public class User extends BaseObservable {
    private boolean b;
    private String firstName;
    private String lastName;
    private String btnText;

    public User(String firstName, String lastName, String btnText) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.btnText = btnText;
        b = true;
    }

    @Bindable
    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
        notifyPropertyChanged(BR.b);
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getBtnText() {
        return btnText;
    }

    public void setBtnText(String btnText) {
        this.btnText = btnText;
        notifyPropertyChanged(BR.btnText);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", btnText='" + btnText + '\'' +
                ", b=" + b +
                '}';
    }
}
