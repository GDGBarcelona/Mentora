package org.gdg.bcn.mentora.core;

import java.util.List;

interface MentorsUIAdapter {
    void setPresenter(MentorsPresenter presenter);
    void notifyDataLoaded(List<Mentor> mentorsList);
}
