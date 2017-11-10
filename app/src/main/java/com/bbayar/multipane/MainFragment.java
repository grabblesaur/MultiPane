package com.bbayar.multipane;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainFragment extends Fragment {

    public interface onCardSelectedInterface {
        void onCardSelected(int position);
    }

    onCardSelectedInterface mListener;

    @BindViews({R.id.name1, R.id.name2})
    List<TextView> names;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mListener = (onCardSelectedInterface) getActivity();

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.cardview1) void onClickCardView1(View view) {
        Snackbar.make(view, names.get(0).getText().toString(), Snackbar.LENGTH_LONG).show();
        mListener.onCardSelected(0);
    }

    @OnClick(R.id.cardview2) void onClickCardView2(View view) {
        Snackbar.make(view, names.get(1).getText().toString(), Snackbar.LENGTH_LONG).show();
        mListener.onCardSelected(1);
    }
}
