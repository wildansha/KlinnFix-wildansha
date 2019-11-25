package com.gandawijaya.klinfix.view.Patner.PatnerProfil;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gandawijaya.klinfix.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityAskWhiteDraw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patner_askwhitedraw);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.idBack)
    public void goBack(){
        onBackPressed();
    }
}