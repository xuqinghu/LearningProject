package com.huxq.learningproject.weixin;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.huxq.learningproject.R;

/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class GradientTabStripFragment extends Fragment {
    protected static final String EXTRA_NAME = "name";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gradienttabstrip_base, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R.id.fgb_tv_content);
        String name = getArguments().getString(EXTRA_NAME);
        textView.setText(name);
    }
}
