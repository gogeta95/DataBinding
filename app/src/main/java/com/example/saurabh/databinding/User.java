package com.example.saurabh.databinding;

/**
 * Created by saurabh on 17/1/17.
 */

public class User {
    private String firstName;
    private String lastName;
    private String btnText;

    public User(String firstName, String lastName, String btnText) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.btnText = btnText;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBtnText() {
        return btnText;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", btnText='" + btnText + '\'' +
                '}';
    }
}
