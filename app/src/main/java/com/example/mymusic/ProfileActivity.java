package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    ImageView imageView47;
    TextView textView52,profile_desc;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        initUI();

        textView52 = findViewById(R.id.textView52);
        profile_desc = findViewById(R.id.profile_desc);
        imageView47 = findViewById(R.id.imageView47);
        imageView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });

        ImageView message_1 = findViewById(R.id.message_1);
        message_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this,MessageFabActivity.class));
            }
        });


        ImageView bookacall_1 = findViewById(R.id.bookacall_1);
        bookacall_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this,MsgReqFabActivity.class));

            }
        });

        SpannableString content = new SpannableString("India");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        textView52.setText(content);

        SpannableString desc = new SpannableString("Description :");
        desc.setSpan(new UnderlineSpan(), 0, desc.length(), 0);
        profile_desc.setText(desc);

    }

/*
    @Override
    public void onBackPressed() {
        //this is only needed if you have specific things
        //that you want to do when the user presses the back button.
        */
/* your specific things...*//*

        super.onBackPressed();
    }
*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void initUI() {
        ImageView imageView1 = findViewById(R.id.profileImageView);

        Utils.setCircleImageToImageView(this, imageView1, R.drawable.pic3, 0, 0);

    }
}