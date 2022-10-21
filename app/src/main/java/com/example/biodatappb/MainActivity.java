package com.example.biodatappb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jl.+Kunci+No.13,+Banyumanik,+Kec.+Banyumanik,+Kota+Semarang,+Jawa+Tengah+50265/@-7.0791555,110.4053379,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70893f37a33733:0x728de836b0ba7df9!8m2!3d-7.0791608!4d110.4075266"));
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:aditya.aqildarmawan@gmail.com"));
        startActivity(intent);
    }
    public void telepon(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081329341279"));
        startActivity(intent);
    }
}