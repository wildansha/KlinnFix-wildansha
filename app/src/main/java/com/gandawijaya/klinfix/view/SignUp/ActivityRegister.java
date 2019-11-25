package com.gandawijaya.klinfix.view.SignUp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gandawijaya.klinfix.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityRegister  extends AppCompatActivity {

    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.idLiniearLayoutRegister)
    public void goRegister(){
        Toast.makeText(this, "Register", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.idGoLogin)
    public void goLogin(){
        mIntent = new Intent(this, ActivityLogin.class);
        startActivity(mIntent);
    }

}