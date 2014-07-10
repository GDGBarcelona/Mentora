package org.gdg.bcn.mentora;

import org.gdg.bcn.mentora.core.FakeModelAdapter;
import org.gdg.bcn.mentora.core.MentorsActivityAdapter;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = MentorsActivity.class
)
public class MentorsModule {
    @Provides MentorsActivityAdapter getMentorsActivityAdapter() {
        FakeModelAdapter modelAdapter = new FakeModelAdapter();
        return MentorsActivityAdapter.newInstance(modelAdapter);
    }
}
