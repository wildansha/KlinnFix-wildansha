package com.gandawijaya.klinfix.view.Patner.PatnerHome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.gandawijaya.klinfix.R;

import butterknife.ButterKnife;

public class FragmentPatnerHome  extends Fragment {

    View root;

    public FragmentPatnerHome() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_patner_home, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

}
