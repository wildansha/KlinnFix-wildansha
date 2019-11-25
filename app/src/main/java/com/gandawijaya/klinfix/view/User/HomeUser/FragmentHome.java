package com.gandawijaya.klinfix.view.User.HomeUser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.User.HistoryUser.FragmentFix;
import com.gandawijaya.klinfix.view.User.HistoryUser.FragmentKlin;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentHome extends Fragment {

    @BindView(R.id.btn_navigation_home)
    BottomNavigationView btn_navigation_home;

    Fragment fragment;
    FragmentManager fragmentManager;
    Menu menu;
    View root;

    public FragmentHome() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_user_home, container, false);
        ButterKnife.bind(this, root);
        setupNavigationView();
        return root;
    }


    private void setupNavigationView() {
        if (btn_navigation_home != null) {
            // Select first menu item by default and show Fragment accordingly.
            menu = btn_navigation_home.getMenu();
            selectmInfo(menu.getItem(0));
            // Set action to perform when any menu-item is selected.
            btn_navigation_home.setOnNavigationItemSelectedListener(
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
                pushFragment(new FragmentHomeKlin());
                break;
            case R.id.idFix:
                pushFragment(new FragmentHomeFix());
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
                ft.replace(R.id.frame_home, fragment);
                ft.commit();
            }
        }
    }


}
