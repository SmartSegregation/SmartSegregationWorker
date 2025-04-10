package com.example.smartsegregationworker.ui.videoguidelines;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smartsegregationworker.R;

public class VideoGuidelinesFragment extends Fragment {

    private VideoGuidelinesViewModel mViewModel;

    public static VideoGuidelinesFragment newInstance() {
        return new VideoGuidelinesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_video_guidelines, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(VideoGuidelinesViewModel.class);
        // TODO: Use the ViewModel
    }

}