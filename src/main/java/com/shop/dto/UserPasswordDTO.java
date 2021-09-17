package com.shop.dto;

public class UserPasswordDTO {

    private Long userId;

    private String oldPassword;

    private String newPassword;

    private String repeatedPassword;


    public Long getUserId() {
        return userId;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }
}
