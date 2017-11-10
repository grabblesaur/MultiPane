package com.bbayar.multipane;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailFragment extends Fragment {

    int position;

    @BindView(R.id.detail_textview)
    TextView mTextView;

    public DetailFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        ButterKnife.bind(this, view);

        position = getArguments().getInt("position");

        StringBuilder text = new StringBuilder();
        switch (position) {
            case 0: text.append("Ant"); break;
            case 1: text.append("Bug"); break;
        }

        mTextView.setText(text);
        return view;
    }
}
