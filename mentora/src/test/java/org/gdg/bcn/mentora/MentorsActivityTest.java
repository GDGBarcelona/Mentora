package org.gdg.bcn.mentora;


import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class MentorsActivityTest {

    @Test
    public void helloWorldTextViewShouldExist(){
        Activity activity = Robolectric.buildActivity(MentorsActivity.class).create().get();
        TextView helloworld = (TextView) activity.findViewById(R.id.texthello);
        assertNotNull(helloworld);
    }

}
