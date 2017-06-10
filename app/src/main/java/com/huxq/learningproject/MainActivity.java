package com.huxq.learningproject;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.huxq.learningproject.base.BaseActivity;
import com.huxq.learningproject.weixin.GradientTabStrip;
import com.huxq.learningproject.weixin.GradientTabStripAdapter;

import am.widget.basetabstrip.BaseTabStrip;

public class MainActivity extends BaseActivity implements
        ViewPager.OnPageChangeListener, BaseTabStrip.OnItemClickListener {
    private ViewPager vpFragments;
    private GradientTabStripAdapter adapter;
    private TextView tvTitle;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        setSupportActionBar(R.id.gts_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        tvTitle = (TextView) findViewById(R.id.gts_tv_title);
        vpFragments = (ViewPager) findViewById(R.id.gts_vp_fragments);
        GradientTabStrip tabStrip = (GradientTabStrip) findViewById(R.id.gts_gts_tabs);
        adapter = new GradientTabStripAdapter(getSupportFragmentManager());
        vpFragments.setAdapter(adapter);
        tabStrip.setAdapter(adapter);
        vpFragments.addOnPageChangeListener(this);
        tabStrip.bindViewPager(vpFragments);
        tabStrip.setOnItemClickListener(this);
        setTitle(adapter.getPageTitle(vpFragments.getCurrentItem()));

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initIntent() {

    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        tvTitle.setText(title);
    }

    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onSelectedClick(int position) {

    }

    @Override
    public void onDoubleClick(int position) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        setTitle(adapter.getPageTitle(vpFragments.getCurrentItem()));
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
