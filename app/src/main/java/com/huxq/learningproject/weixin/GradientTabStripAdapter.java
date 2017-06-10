package com.huxq.learningproject.weixin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;

import com.huxq.learningproject.R;

/**
 * Created by xuqinghu on 2017/3/20 0020.
 */

public class GradientTabStripAdapter extends FragmentPagerAdapter implements GradientTabStrip.GradientTabAdapter {
    public GradientTabStripAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        String title = getPageTitle(position).toString();
        switch (position) {
            default:
            case 0:
                IndexFragment indexFragment = new IndexFragment();
                return indexFragment;
            case 1:
                return FunctionFragment.newInstance(title);
            case 2:
                return PatientFragment.newInstance(title);
            case 3:
                return StatisticFragment.newInstance(title);
            case 4:
                return SettingFragment.newInstance(title);
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            default:
            case 0:
                return "首页";
            case 1:
                return "功能";
            case 2:
                return "病人";
            case 3:
                return "统计";
            case 4:
                return "设置";
        }
    }

    @Override
    public Drawable getNormalDrawable(int position, Context context) {
        switch (position) {
            default:
            case 0:
                return ContextCompat.getDrawable(context, R.mipmap.tab_start_normal);
            case 1:
                return ContextCompat.getDrawable(context, R.mipmap.tab_tools_normal);
            case 2:
                return ContextCompat.getDrawable(context, R.mipmap.tab_people_list_normal);
            case 3:
                return ContextCompat.getDrawable(context, R.mipmap.tab_workload_normal);
            case 4:
                return ContextCompat.getDrawable(context, R.mipmap.tab_more_normal);
        }

    }

    @Override
    public Drawable getSelectedDrawable(int position, Context context) {
        switch (position) {
            default:
            case 0:
                return ContextCompat.getDrawable(context, R.mipmap.tab_start_selected);
            case 1:
                return ContextCompat.getDrawable(context, R.mipmap.tab_tools_selected);
            case 2:
                return ContextCompat.getDrawable(context, R.mipmap.tab_people_list_selected);
            case 3:
                return ContextCompat.getDrawable(context, R.mipmap.tab_workload_selected);
            case 4:
                return ContextCompat.getDrawable(context, R.mipmap.tab_more_selected);

        }

    }

    @Override
    public boolean isTagEnable(int position) {
        return false;
    }

    @Override
    public String getTag(int position) {
        return null;
    }
}
