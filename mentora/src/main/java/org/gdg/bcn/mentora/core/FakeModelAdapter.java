package org.gdg.bcn.mentora.core;

import org.gdg.bcn.mentora.interactors.MentorMDO;
import org.gdg.bcn.mentora.interactors.MentorsFakeListInteractor;

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
        List<MentorMDO> mentorMDOs = getMentorMDOs();
        List<Mentor> mentors = getMentors(mentorMDOs);
        presenter.notifyDataLoaded(mentors);
    }

    private List<Mentor> getMentors(List<MentorMDO> mentorMDOs) {
        List<Mentor> mentors = new ArrayList<Mentor>();
        for (MentorMDO mentorMDO : mentorMDOs) {
            Mentor mentor = new Mentor(mentorMDO.getName());
            mentors.add(mentor);
        }
        return mentors;
    }

    private List<MentorMDO> getMentorMDOs() {
        MentorsFakeListInteractor fakeListInteractor = new MentorsFakeListInteractor();
        return fakeListInteractor.execute();
    }
}
