package android.dominando.navegacao;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by turbiani on 14/05/16.
 */
public class TelaPagerActivity extends AppCompatActivity {
    AbasPagerAdapter mAbasPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pager);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mAbasPagerAdapter = new AbasPagerAdapter(this, getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mAbasPagerAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
