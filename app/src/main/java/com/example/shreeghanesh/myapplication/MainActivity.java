package com.example.shreeghanesh.myapplication;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.main_tab);
        viewPager = findViewById(R.id.view_pager);
        appBarLayout = findViewById(R.id.app_bar);
        ViewPagert viewPagert = new ViewPagert(getSupportFragmentManager());
        viewPagert.addFragment(new FragmentOne(), "Tab-One");
        viewPagert.addFragment(new FragmentTwo(), "Tab-two");
        viewPager.setAdapter(viewPagert);
        tabLayout.setupWithViewPager(viewPager);
    }
}
