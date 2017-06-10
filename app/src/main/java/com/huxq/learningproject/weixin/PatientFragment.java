package com.huxq.learningproject.weixin;

import android.os.Bundle;

/**
 * 病人
 * Created by xuqinghu on 2017/3/20 0020.
 */

public class PatientFragment extends GradientTabStripFragment {
    public static PatientFragment newInstance(String content) {
        PatientFragment fragment = new PatientFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_NAME, content);
        fragment.setArguments(bundle);
        return fragment;
    }
}
