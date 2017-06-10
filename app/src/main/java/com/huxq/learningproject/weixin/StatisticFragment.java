package com.huxq.learningproject.weixin;

import android.os.Bundle;

/**
 * 统计
 * Created by xuqinghu on 2017/3/20 0020.
 */

public class StatisticFragment extends GradientTabStripFragment {
    public static StatisticFragment newInstance(String content) {
        StatisticFragment fragment = new StatisticFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_NAME, content);
        fragment.setArguments(bundle);
        return fragment;
    }
}
