package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    int images[] = {R.drawable.image_1,R.drawable.image_2,R.drawable.image_3};
    public MyViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return ItemFragment.newInstance(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
