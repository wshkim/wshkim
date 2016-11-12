package com.in_con.www.wshkim.member;

/**
 * Created by 1027 on 2016-11-12.
 */

public class MemberDTO {
    private String id,pw,mame,email,photo,addr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "회원정보{" +
                "아이디='" + id + '\'' +
                ", 비번='" + pw + '\'' +
                ", 이름='" + mame + '\'' +
                ", email='" + email + '\'' +
                ", 이미지='" + photo + '\'' +
                ", 주소='" + addr + '\'' +
                '}';
    }
}
