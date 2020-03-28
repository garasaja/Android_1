package com.example.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ItemFragment extends Fragment {

    //반복되는 코드를 재사용하여 뷰페이지를 최적화 하는 소스
    public static ItemFragment newInstance(int position) {

        Bundle args = new Bundle();
        args.putInt("position",position);
        ItemFragment fragment = new ItemFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.item,container,false);// item.xml과 itemfragment연결
        ImageView imageView = (ImageView)view.findViewById(R.id.item_imageview);
        imageView.setImageResource(getArguments().getInt("position"));

        return view;
    }
}
