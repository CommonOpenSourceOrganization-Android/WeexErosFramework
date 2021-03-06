package com.benmu.framework.manager.impl;

import android.content.Context;

import com.benmu.framework.adapter.DefaultStorageAdapter;
import com.benmu.framework.manager.Manager;

import java.io.Serializable;

/**
 * Created by Carry on 2017/8/21.
 */

public class StorageManager extends Manager {

    public boolean setData(Context context, String key, Serializable value) {
        return DefaultStorageAdapter.getInstance().setData(context, key, value);
    }

    public String getData(Context context, String key) {
        return DefaultStorageAdapter.getInstance().getData(context, key, String.class);
    }

    public boolean deleteData(Context context, String key) {
        return DefaultStorageAdapter.getInstance().deleteData(context, key);
    }

    public boolean removeData(Context context) {
        return DefaultStorageAdapter.getInstance().removeData(context);
    }
}
