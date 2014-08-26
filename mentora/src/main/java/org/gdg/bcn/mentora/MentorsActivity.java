package org.gdg.bcn.mentora;

import android.app.Activity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import org.gdg.bcn.mentora.core.MentorsActivityAdapter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import dagger.ObjectGraph;


public class MentorsActivity extends Activity {
    @InjectView(R.id.listview) ListView listView;
    private MentorsActivityAdapter uiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentors);
        injectDependencies();
        uiAdapter = new MentorsActivityAdapter(this);
        uiAdapter.createView();
    }

    private void injectDependencies() {
        ButterKnife.inject(this);
    }

    public void setAdapter(BaseAdapter adapter) {
        listView.setAdapter(adapter);
    }
}
