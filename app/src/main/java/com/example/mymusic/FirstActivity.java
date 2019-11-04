package com.example.mymusic;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class FirstActivity extends AppCompatActivity {

    ImageView chatimage1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        chatimage1 = findViewById(R.id.chatimage1);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

       /* fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(FirstActivity.this,"Messages Fab Clicked ",Toast.LENGTH_LONG).show();

            }
        });*/
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);

        Toolbar toolbar = findViewById(R.id.toolbar);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        MessageFragment MessageFragment = new MessageFragment();
        adapter.addFragment(MessageFragment, "Messages");

        MsgReqFragment msgReqFragment = new MsgReqFragment();
        adapter.addFragment(msgReqFragment, "Request");

        viewPager.setAdapter(adapter);
    }



}
