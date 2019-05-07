package com.bitlove.fetlife.legacy.view.screen;

import androidx.fragment.app.Fragment;

import com.bitlove.fetlife.common.app.FetLifeApplication;
import com.bitlove.fetlife.common.view.BaseActivity;

public class BaseFragment extends Fragment {

    @Override
    public void onStart() {
        super.onStart();
        FetLifeApplication.getInstance().getEventBus().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        FetLifeApplication.getInstance().getEventBus().unregister(this);
    }

    protected void showProgress() {
        getBaseActivity().showProgress();
    }

    protected void dismissProgress() {
        getBaseActivity().dismissProgress();
    }

    protected BaseActivity getBaseActivity() {
        return (BaseActivity) getActivity();
    }

    protected FetLifeApplication getFetLifeApplication() {
        return getBaseActivity().getFetLifeApplication();
    }

}
