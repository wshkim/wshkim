package com.in_con.www.wshkim.member;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.in_con.www.wshkim.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    MemberService service;

    EditText et_id, et_pw;
    Button bt_submit, bt_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        service = new MemberServiceImpl(this.getApplicationContext());

        et_id = (EditText) findViewById(R.id.et_id);
        et_pw = (EditText) findViewById(R.id.et_pw);

        bt_submit = (Button) findViewById(R.id.bt_submit);
        bt_cancel = (Button) findViewById(R.id.bt_cancel);

        bt_submit.setOnClickListener(this);
        bt_cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_submit :
                MemberDTO param = new MemberDTO();
                param.setId(et_id.getText().toString());
                param.setPw(et_pw.getText().toString());
                service.login(param);
                break;
            case R.id.bt_cancel :

                break;
        }
    }
}