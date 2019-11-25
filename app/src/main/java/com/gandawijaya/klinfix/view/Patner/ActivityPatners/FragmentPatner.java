package com.gandawijaya.klinfix.view.Patner.ActivityPatners;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.Patner.PatnerHistory.FragmentPatnerHistory;
import com.gandawijaya.klinfix.view.Patner.PatnerHome.FragmentPatnerHome;
import com.gandawijaya.klinfix.view.Patner.PatnerProfil.FragmentPatnerUser;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentPatner extends Fragment {

    View root;
    @BindView(R.id.idBnPatner)
    BottomNavigationView idBnPatner;
    Fragment fragment;
    FragmentManager fragmentManager;
    Menu menu;

    public FragmentPatner() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_patner, container, false);
        ButterKnife.bind(this, root);
        setupNavigationView();
        return root;
    }


    private void setupNavigationView() {
        if (idBnPatner != null) {
            // Select first menu item by default and show Fragment accordingly.
            menu = idBnPatner.getMenu();
            selectmInfo(menu.getItem(0));
            // Set action to perform when any menu-item is selected.
            idBnPatner.setOnNavigationItemSelectedListener(
                    item -> {
                        selectmInfo(item);
                        return false;
                    });
        }
    }

    private void selectmInfo(MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()) {
            case R.id.idHome:
                pushFragment(new FragmentPatnerHome());
                break;
            case R.id.idHistory:
                pushFragment(new FragmentPatnerHistory());
                break;
            case R.id.idProfil:
                pushFragment(new FragmentPatnerUser());
                break;
        }
    }

    private void pushFragment(Fragment fragment) {
        if (fragment == null)
            return;
        fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.replace(R.id.frame_patner, fragment);
                ft.commit();
            }
        }
    }
}
