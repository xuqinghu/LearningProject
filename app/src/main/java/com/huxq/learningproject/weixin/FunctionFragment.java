package com.huxq.learningproject.weixin;

import android.os.Bundle;

/**
 * 功能
 * Created by xuqinghu on 2017/3/20 0020.
 */

public class FunctionFragment extends GradientTabStripFragment {
    public static FunctionFragment newInstance(String content) {
        FunctionFragment fragment = new FunctionFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_NAME, content);
        fragment.setArguments(bundle);
        return fragment;
    }
}
