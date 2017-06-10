package com.huxq.learningproject.weixin;

import android.os.Bundle;

/**
 * 设置
 * Created by xuqinghu on 2017/3/20 0020.
 */

public class SettingFragment extends GradientTabStripFragment {
    public static SettingFragment newInstance(String content) {
        SettingFragment fragment = new SettingFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_NAME, content);
        fragment.setArguments(bundle);
        return fragment;
    }
}
