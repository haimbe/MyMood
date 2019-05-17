package com.example.mymood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HistoriqueActivity extends AppCompatActivity {

    private TextView mSeptjours;
    private TextView mSixjours;
    private TextView mCinqjours;
    private TextView mQuatrejours;
    private TextView mTroisjours;
    private TextView mAvanthier;
    private TextView mHier;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historique);

        mSeptjours = (TextView) findViewById(R.id.septjours);
        mSixjours = (TextView) findViewById(R.id.sixjours);
        mCinqjours = (TextView) findViewById(R.id.cingjours);
        mQuatrejours = (TextView) findViewById(R.id.quatrejours);
        mTroisjours = (TextView) findViewById(R.id.troisjours);
        mAvanthier = (TextView) findViewById(R.id.avanthier);
        mHier = (TextView) findViewById(R.id.hier);

    }
}
