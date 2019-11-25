package com.gandawijaya.klinfix.view.Patner.PatnerProfil;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.gandawijaya.klinfix.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentPatnerUser  extends Fragment {
    View root;
    Intent mIntent;

    public FragmentPatnerUser() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_patner_user, container, false);
        ButterKnife.bind(this, root);
        return root;
    }


    @OnClick(R.id.idRlAskWhiteDraw)
    public void goWhiteDraw(){
        mIntent = new Intent(getContext(), ActivityAskWhiteDraw.class);
        startActivity(mIntent);
    }

    @OnClick(R.id.idRlWhitDraw)
    public void goDraw(){
        mIntent = new Intent(getContext(), ActivityHistoryTransaksi.class);
        startActivity(mIntent);
    }

}
