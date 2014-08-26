package org.gdg.bcn.mentora.core;

import android.widget.ArrayAdapter;

import org.gdg.bcn.mentora.MentorsActivity;

import java.util.List;

import javax.inject.Inject;

import dagger.ObjectGraph;

public class MentorsActivityAdapter implements MentorsUIAdapter {
    @Inject MentorsPresenter presenter;
    private MentorsActivity activity;

    public MentorsActivityAdapter(MentorsActivity activity) {
        this.activity = activity;
        ObjectGraph graph = ObjectGraph.create(new MentorsMVPModule(this));
        graph.inject(this);
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
