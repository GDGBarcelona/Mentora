package org.gdg.bcn.mentora.core;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MentorsPresenterTest {
    public static final long LATITUDE_0 = 0;
    public static final long LONGITUDE_0 = 0;
    private MentorsPresenter presenter;
    @Mock private MentorsUIAdapter mockUIAdapter;
    @Mock private MentorsModelAdapter mockModelAdapter;

    @Before
    public void setup() {
        presenter = MentorsPresenter.newInstance(mockUIAdapter, mockModelAdapter);
    }

    @Test
    public void shouldSetPresenter() {
        verify(mockModelAdapter).setPresenter(presenter);
    }

    @Test
    public void shouldStartLoadingData() {
        presenter.startLoadingData(LATITUDE_0, LONGITUDE_0);
        verify(mockModelAdapter).startLoadingData(LATITUDE_0, LONGITUDE_0);
    }


    @Test @SuppressWarnings("unchecked")
    public void shouldNotifyDataLoaded() {
        List<Mentor> mentorsList = mock(List.class);
        presenter.notifyDataLoaded(mentorsList);
        verify(mockUIAdapter).notifyDataLoaded(mentorsList);
    }
}
