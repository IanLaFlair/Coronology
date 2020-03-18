package com.zeblogic.coronology.adapter;

import ss.com.bannerslider.adapters.SliderAdapter;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class MainSliderAdapter extends SliderAdapter {

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public void onBindImageSlide(int position, ImageSlideViewHolder viewHolder) {
        switch (position) {
            case 0:
                viewHolder.bindImageSlide("https://www.aljazeera.com/mritems/Images/2020/2/1/f5d081747b114dac80f466a7f9702190_18.jpg");
                break;
            case 1:
                viewHolder.bindImageSlide("https://i.ytimg.com/vi/WX9tsh5mR00/maxresdefault.jpg");
                break;
            case 2:
                viewHolder.bindImageSlide("https://dinkes.acehprov.go.id/uploads/Website_Slider_Template_tema_Corona.png");
                break;
        }
    }
}
