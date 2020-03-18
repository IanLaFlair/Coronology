package com.zeblogic.coronology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zeblogic.coronology.adapter.MainSliderAdapter;
import com.zeblogic.coronology.utils.PicassoImageLoadingService;

import butterknife.BindView;
import butterknife.ButterKnife;
import ss.com.bannerslider.Slider;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.banner_slider1)
    Slider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Slider.init(new PicassoImageLoadingService(this));
        ButterKnife.bind(this);
        slider.setAdapter(new MainSliderAdapter());

    }
}
