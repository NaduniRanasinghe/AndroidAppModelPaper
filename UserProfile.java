package com.example.naduniranasinghe.androidappmodelpaoer;

import android.provider.BaseColumns;

public final class UserProfile {
    private UserProfile(){


    }

    public static UserProfile getProfile(){
        UserProfile userprofile = new UserProfile();
        return userprofile;
    }


    class Users implements BaseColumns {

        public static final String TABLE_NAME = "UserInfo";
        public static final String COL_ID ="_ID";
        public static final String COL_USERNAME="Username";
        public static final String COL_PASSWORD = "Password";
        public static final String COL_GENDER ="Gender";
        public static final String COL_DOB ="dob";

        int Id;
        String userName;

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        String passWord;
        String gender;
        String dob;





    }
    public  Users getUser(){
        Users users = new Users();
        return users;
    }
}
