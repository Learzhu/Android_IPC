package com.learzhu.model;

import java.io.Serializable;

/**
 * @author Learzhu
 * @version $Rev$
 * @time 2016/8/1 20:06
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$  20:06
 * @updateDes ${TODO}
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private int userId;
    private String userName;
    private boolean isMale;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public User() {
    }

    public User(int userId, String userName, boolean isMale) {
        this.userId = userId;
        this.userName = userName;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
