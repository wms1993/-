package com.wms.qianghongbao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author wms1993
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        QHBApplication.activityCreateStatistics(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        QHBApplication.activityResumeStatistics(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        QHBApplication.activityPauseStatistics(this);
    }
}
