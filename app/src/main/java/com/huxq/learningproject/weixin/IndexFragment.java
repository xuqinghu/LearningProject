package com.huxq.learningproject.weixin;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.huxq.learningproject.R;
import com.huxq.learningproject.entity.User;
import com.huxq.learningproject.utils.FastJsonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页
 * Created by xuqinghu on 2017/3/20 0020.
 */

public class IndexFragment extends Fragment {
    private TextView tv;
    private String json = "[{\"name\":\"胡绪庆\",\"age\":\"18\",\"sex\":\"男\"},{\"name\":\"陈通\",\"age\":\"18\",\"sex\":\"女\"}]";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_index, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv = (TextView) view.findViewById(R.id.tv);
        ArrayList<User> userList = new ArrayList<User>();
        userList = FastJsonUtils.getBeanAList(json, User.class);
        tv.setText(userList.get(0).getName());
    }
}
