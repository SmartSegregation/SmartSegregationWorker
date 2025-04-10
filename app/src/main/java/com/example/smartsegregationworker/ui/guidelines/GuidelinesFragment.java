package com.example.smartsegregationworker.ui.guidelines;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smartsegregationworker.R;

public class GuidelinesFragment extends Fragment {

    private GuidelinesViewModel mViewModel;

    public static GuidelinesFragment newInstance() {
        return new GuidelinesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guidelines, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(GuidelinesViewModel.class);
        // TODO: Use the ViewModel
    }

}