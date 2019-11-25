package com.gandawijaya.klinfix.view.User.HistoryUser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.User.HomeUser.FragmentHome;
import com.gandawijaya.klinfix.view.User.ProfilUser.FragmentProfil;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class FragmentHistory extends Fragment {

    @BindView(R.id.btn_navigation_history)
    BottomNavigationView btn_navigation_history;

    Fragment fragment;
    FragmentManager fragmentManager;
    Menu menu;
    View root;

    public FragmentHistory(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_user_history, container, false);
        ButterKnife.bind(this, root);
        setupNavigationView();
        return root;
    }

    private void setupNavigationView() {
        if (btn_navigation_history != null) {
            // Select first menu item by default and show Fragment accordingly.
            menu = btn_navigation_history.getMenu();
            selectmInfo(menu.getItem(0));
            // Set action to perform when any menu-item is selected.
            btn_navigation_history.setOnNavigationItemSelectedListener(
                    item -> {
                        selectmInfo(item);
                        return false;
                    });
        }
    }

    private void selectmInfo(MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()) {
            case R.id.idKlin:
                pushFragment(new FragmentKlin());
                break;
            case R.id.idFix:
                pushFragment(new FragmentFix());
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
                ft.replace(R.id.frame_history, fragment);
                ft.commit();
            }
        }
    }
}
