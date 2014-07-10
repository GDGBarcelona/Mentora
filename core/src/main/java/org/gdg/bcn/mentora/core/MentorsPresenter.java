package org.gdg.bcn.mentora.core;

import java.util.List;

class MentorsPresenter {
    private MentorsUIAdapter uiAdapter;
    private MentorsModelAdapter modelAdapter;

    static MentorsPresenter newInstance(MentorsUIAdapter uiAdapter,
                                        MentorsModelAdapter modelAdapter) {
        MentorsPresenter presenter = new MentorsPresenter(uiAdapter, modelAdapter);
        presenter.initialize();
        return presenter;
    }

    private void initialize() {
        uiAdapter.setPresenter(this);
        modelAdapter.setPresenter(this);
    }

    private MentorsPresenter(MentorsUIAdapter uiAdapter, MentorsModelAdapter modelAdapter) {
        this.uiAdapter = uiAdapter;
        this.modelAdapter = modelAdapter;
    }

    public void startLoadingData(long latitude, long longitude) {
        modelAdapter.startLoadingData(latitude, longitude);
    }

    public void notifyDataLoaded(List<Mentor> mentorsList) {
        uiAdapter.notifyDataLoaded(mentorsList);
    }
}
