package org.gdg.bcn.mentora.interactors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module (
        library = true
)
public class InteractorsModule {
    @Provides @Singleton MentorsFakeListInteractor getMentorsFakeListInteractor() {
        return new MentorsFakeListInteractor();
    }
}
