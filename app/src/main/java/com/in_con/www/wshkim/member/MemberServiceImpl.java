package com.in_con.www.wshkim.member;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-11-12.
 */

public class MemberServiceImpl implements MemberService {
    MemberDAO dao;

    public MemberServiceImpl(Context context) {
       dao = new MemberDAO(context);
    }

    @Override
    public void join(MemberDTO param) {

    }

    @Override
    public void count() {

    }

    @Override
    public MemberDTO detail(String id) {
        return null;
    }

    @Override
    public ArrayList<MemberDTO> list() {
        return null;
    }

    @Override
    public MemberDTO login(String id, String pw) {
        return null;
    }

    @Override
    public void undate(MemberDTO param) {

    }

    @Override
    public void delete(MemberDTO param) {

    }
}
