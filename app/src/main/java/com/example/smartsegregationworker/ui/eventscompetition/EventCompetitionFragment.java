package com.example.smartsegregationworker.ui.eventscompetition;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smartsegregationworker.R;

public class EventCompetitionFragment extends Fragment {

    private EventCompetitionViewModel mViewModel;

    public static EventCompetitionFragment newInstance() {
        return new EventCompetitionFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_event_competition, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(EventCompetitionViewModel.class);
        // TODO: Use the ViewModel
    }

}