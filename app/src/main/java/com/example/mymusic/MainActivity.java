package com.example.mymusic;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView bookacall_1;
    Context context;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookacall_1 = findViewById(R.id.bookacall_1);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener((@NonNull MenuItem item) -> {
            switch (item.getItemId()) {

                case R.id.home_landing:
                    startActivity(new Intent(MainActivity.this,MainActivity.class));
                    break;
                case R.id.Landing:
                    startActivity(new Intent(MainActivity.this,CoachesActivity.class));
                    break;
                case R.id.masg:
                   startActivity(new Intent(MainActivity.this,FirstActivity.class));
                    break;
                case R.id.calender:
                    startActivity(new Intent(MainActivity.this,Calls.class));
                    break;
                case R.id.Profile:
                    startActivity(new Intent(MainActivity.this,ProfileActivity.class));
                    break;
            }
            return false;
        });
      /*  bookacall_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,Book_a_call_Activity.class);
                startActivity(intent1);
            }
        });*/
//Tabs
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        Toolbar toolbar = findViewById(R.id.toolbar);

//       toolbar.setTitle("Coach Customer");

  //appbar
        ViewPager viewP = findViewById(R.id.viewPager2);
        setupViewPag(viewP);

        TabLayout tabLayou = findViewById(R.id.tabLayout1);
        tabLayou.setupWithViewPager(viewP);



    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        BrowserFragment BrowserFragment = new BrowserFragment();
        adapter.addFragment(BrowserFragment, "Browse");

        SavedFragment SavedFragment = new SavedFragment();
        adapter.addFragment(SavedFragment, "Saved");

        HiredFragment HiredFragment = new HiredFragment();
        adapter.addFragment(HiredFragment, "Hired");


     /*   FilterFragment iredFragment = new FilterFragment();
        adapter.addFragment(iredFragment, "filter");*/

        viewPager.setAdapter(adapter);
    }

    private void setupViewPag(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

   /*     BrowserFragment BrowserFragment = new BrowserFragment();
        adapter.addFragment(BrowserFragment, "Browser");

        SavedFragment SavedFragment = new SavedFragment();
        adapter.addFragment(SavedFragment, "Saved");

        HiredFragment HiredFragment = new HiredFragment();
        adapter.addFragment(HiredFragment, "Hired");*/


        UiContainerTabLayoutTab1Fragment HiredFragmen = new UiContainerTabLayoutTab1Fragment();
        adapter.addFragment(HiredFragmen, "Branding");

        UiContainerTabLayoutTab2Fragment HiredFragme = new UiContainerTabLayoutTab2Fragment();
        adapter.addFragment(HiredFragme, "Shopping");

        UiContainerTabLayoutTab3Fragment HiredFragm = new UiContainerTabLayoutTab3Fragment();
        adapter.addFragment(HiredFragm, "Instuments");

        UiContainerTabLayoutTab4Fragment tab4 = new UiContainerTabLayoutTab4Fragment();
        adapter.addFragment(tab4, "Following");

        UiContainerTabLayoutTab5Fragment tab5 = new UiContainerTabLayoutTab5Fragment();
        adapter.addFragment(tab5, "Branding");

        UiContainerTabLayoutTab6Fragment tab6 = new UiContainerTabLayoutTab6Fragment();
        adapter.addFragment(tab6, "Shopping");


        viewPager.setAdapter(adapter);
    }

}
