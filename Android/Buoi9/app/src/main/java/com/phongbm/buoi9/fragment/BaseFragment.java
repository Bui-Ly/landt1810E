package com.phongbm.buoi9.fragment;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phongbm.buoi9.MainActivity;

import java.util.ArrayList;

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(getLayoutRes(), container, false);
        return v;
    }

    protected <T extends View> T findViewById(@IdRes int id) {
        return getActivity().findViewById(id);
    }

    protected MainActivity getParent() {
        return (MainActivity) getActivity();
    }

    protected abstract int getLayoutRes();
}
