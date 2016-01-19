package com.wms.qianghongbao.task;

import android.content.Context;

import com.wms.qianghongbao.Config;
import com.wms.qianghongbao.QiangHongBaoService;

/**
 * @author wms1993
 */
public abstract class BaseAccessbilityJob implements AccessbilityJob {

    private QiangHongBaoService service;

    @Override
    public void onCreateJob(QiangHongBaoService service) {
        this.service = service;
    }

    public Context getContext() {
        return service.getApplicationContext();
    }

    public Config getConfig() {
        return service.getConfig();
    }

    public QiangHongBaoService getService() {
        return service;
    }
}
