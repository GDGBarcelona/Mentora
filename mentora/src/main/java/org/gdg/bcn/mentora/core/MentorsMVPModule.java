package org.gdg.bcn.mentora.core;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = MentorsActivityAdapter.class
)
public class MentorsMVPModule {
    private MentorsActivityAdapter uiAdapter;

    public MentorsMVPModule(MentorsActivityAdapter uiAdapter) {
        this.uiAdapter = uiAdapter;
    }

    @SuppressWarnings("unused")
    @Provides MentorsPresenter getMentorsPresenter(MentorsModelAdapter modelAdapter) {
        return MentorsPresenter.newInstance(uiAdapter, modelAdapter);
    }

    @SuppressWarnings("unused")
    @Provides MentorsModelAdapter getMentorsModel() {
        return new FakeModelAdapter();
    }
}
