package com.ict.mw_android;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Category_play extends Fragment {

    Category category;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.category_play, container, false);
        return vg;
    }

    // Fragment가 activity에 올라갔을 때 getActivity() 메소드를 통해서 호출
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        category = (Category) getActivity();
    }

    // Fragment 가 종료될 때
    @Override
    public void onDetach() {
        super.onDetach();
        category = null;
    }
}
