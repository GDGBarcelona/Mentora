package org.gdg.bcn.mentora.core;

interface MentorsModelAdapter {
    void setPresenter(MentorsPresenter presenter);
    void startLoadingData(long latitude, long longitude);
}
