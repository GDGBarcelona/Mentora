package org.gdg.bcn.mentora.core;

import java.util.ArrayList;
import java.util.List;

public class FakeModelAdapter implements MentorsModelAdapter {
    private MentorsPresenter presenter;

    @Override
    public void setPresenter(MentorsPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void startLoadingData(long latitude, long longitude) {
        List<Mentor> mentors = new ArrayList<Mentor>();
        mentors.add(new Mentor("JMPergar"));
        mentors.add(new Mentor("Nescafemix"));
        mentors.add(new Mentor("Akelael"));
        presenter.notifyDataLoaded(mentors);
    }
}
