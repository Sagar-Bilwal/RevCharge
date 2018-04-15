package com.example.sagar.evhack;

import android.app.Fragment;
import android.icu.text.LocaleDisplayNames;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class FAQs extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

        YouTubePlayerView youTubeView;
        YouTubePlayerView youTubeView1;
        TextView overview;
        TextView textView;
        TextView chargingWithApp;
        int check;
        private static final int RECOVERY_REQUEST = 1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        overview=findViewById(R.id.overview);
        textView=findViewById(R.id.textView);
        chargingWithApp=findViewById(R.id.charging_with_app);
        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, this);

        overview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        check=1;
                        Toast.makeText(FAQs.this,"click",Toast.LENGTH_LONG).show();
                        youTubeView.initialize(Config.YOUTUBE_API_KEY, FAQs.this);
                }
        });
        textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        check=2;
                        youTubeView.initialize(Config.YOUTUBE_API_KEY, FAQs.this);
                }
        });
        chargingWithApp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        check=3;
                        youTubeView.initialize(Config.YOUTUBE_API_KEY, FAQs.this);
                }
        });
        }

@Override
public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (!b) {
        youTubePlayer.cueVideo("eq4i4v_9fmc");
        if(check==1)
        {
                youTubePlayer.cueVideo("eq4i4v_9fmc");
        }else if(check==2)
        {
                youTubePlayer.cueVideo("BSH8mEgrX6k");
        }else if(check==3)
        {
                youTubePlayer.cueVideo("bU5AuQFSpkY");
        }
        }
}

@Override
public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {

        if (errorReason.isUserRecoverableError()) {
        errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
        String error = String.format(getString(R.string.player_error), errorReason.toString());
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();}
    }
}
