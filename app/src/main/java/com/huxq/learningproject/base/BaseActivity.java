package com.huxq.learningproject.base;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by xuqinghu on 2017/3/17 0017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        initIntent();
        initView();
        initData();
        initListener();
    }

    public abstract void setContentView();


    public abstract void initView();

    public abstract void initData();

    public abstract void initListener();

    public abstract void initIntent();

    /**
     * 设置Toolbar 为ActionBar
     *
     * @param toolbarId Toolbar资源ID
     * @param showTitle 是否显示标题
     */
    public void setSupportActionBar(@IdRes int toolbarId, boolean showTitle) {
        Toolbar mToolbar = (Toolbar) findViewById(toolbarId);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
            mToolbar.setNavigationOnClickListener(new NavigationOnClickListener());
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayShowTitleEnabled(showTitle);
            }
        }
    }

    /**
     * 设置Toolbar 为ActionBar
     *
     * @param toolbarId Toolbar资源ID
     */
    public void setSupportActionBar(@IdRes int toolbarId) {
        setSupportActionBar(toolbarId, false);
    }

    /**
     * Toolbar 返回按钮点击
     */
    protected void onNavigationClick() {
        onBackPressed();
    }

    private class NavigationOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            onNavigationClick();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
