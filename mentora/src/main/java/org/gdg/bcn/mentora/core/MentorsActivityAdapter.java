package org.gdg.bcn.mentora.core;

import android.widget.ArrayAdapter;

import org.gdg.bcn.mentora.MentorsActivity;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MentorsActivityAdapter implements MentorsUIAdapter {
    private MentorsPresenter presenter;
    private MentorsActivity activity;

    public static MentorsActivityAdapter newInstance(MentorsModelAdapter modelAdapter) {
        MentorsActivityAdapter uiAdapter = new MentorsActivityAdapter();
        MentorsPresenter.newInstance(uiAdapter, modelAdapter);
        return uiAdapter;
    }

    private MentorsActivityAdapter() {}

    @Override
    public void setPresenter(MentorsPresenter presenter) {
        this.presenter = presenter;
    }

    public void setActivity(MentorsActivity activity) {
        this.activity = activity;
    }

    @Override
    public void notifyDataLoaded(List<Mentor> mentors) {
        ArrayAdapter<Mentor> mentorArrayAdapter
                = new ArrayAdapter<Mentor>(activity,
                                           android.R.layout.simple_list_item_1,
                                           android.R.id.text1,
                                           mentors);
        activity.setAdapter(mentorArrayAdapter);
    }

    public void createView() {
        presenter.startLoadingData(0, 0);
    }
}
