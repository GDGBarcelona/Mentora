package org.gdg.bcn.mentora.interactors;

import java.util.ArrayList;
import java.util.List;

public class MentorsFakeListInteractor {
    public List<MentorMDO> execute() {
        List<MentorMDO> mentors = new ArrayList<MentorMDO>();
        mentors.add(new MentorMDO("JMPergar"));
        mentors.add(new MentorMDO("Nescafemix"));
        mentors.add(new MentorMDO("Akelael"));
        return mentors;
    }
}
