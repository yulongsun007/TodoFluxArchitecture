/*
 * BaseFragment      2016-04-19
 *
 */
package com.farseer.todo.flux.base;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

/**
 * Fragment基类
 *
 * @author zhaosc
 * @version 1.0.0
 * @since 2016-04-19
 */
public class BaseFragment extends Fragment {

    @Inject
    protected Resources resources;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        ((BaseActivity)context).getComponent().inject(this);
    }
}