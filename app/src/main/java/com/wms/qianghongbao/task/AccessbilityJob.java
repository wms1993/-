package com.wms.qianghongbao.task;

import android.view.accessibility.AccessibilityEvent;

import com.wms.qianghongbao.QiangHongBaoService;

/**
 * @author wms1993
 */
public interface AccessbilityJob {
    String getTargetPackageName();

    void onCreateJob(QiangHongBaoService service);

    void onReceiveJob(AccessibilityEvent event);

    void onStopJob();

    boolean isEnable();
}
