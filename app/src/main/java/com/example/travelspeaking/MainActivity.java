package com.example.travelspeaking;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Animation fading;           // fade animation for button
    String itemLanguage;
    MediaPlayer sound;

    public void helloClt (View view) {
        // starr animation for button
        fading = AnimationUtils.loadAnimation(this, R.anim.fading);
        view.startAnimation(fading);

        if (itemLanguage.equals("French")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.hellofr);
            sound.start();
        } else if (itemLanguage.equals("Chinese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Spanish")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("German")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Vietnamese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        }
    }

    public void doUClt (View view) {
        // starr animation for button
        fading = AnimationUtils.loadAnimation(this, R.anim.fading);
        view.startAnimation(fading);

        if (itemLanguage.equals("French")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Chinese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Spanish")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("German")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Vietnamese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        }
    }
    public void iWantClt (View view) {
        // starr animation for
        fading = AnimationUtils.loadAnimation(this, R.anim.fading);
        view.startAnimation(fading);

        if (itemLanguage.equals("French")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.iwantogotofr);
            sound.start();
        } else if (itemLanguage.equals("Chinese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Spanish")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("German")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Vietnamese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        }
    }
    public void myNameClt (View view) {
        // starr animation for button
        fading = AnimationUtils.loadAnimation(this, R.anim.fading);
        view.startAnimation(fading);

        if (itemLanguage.equals("French")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.mynameisfr);
            sound.start();
        } else if (itemLanguage.equals("Chinese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Spanish")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("German")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Vietnamese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        }
    }
    public void howMuchClt(View view) {
        // starr animation for button
        fading = AnimationUtils.loadAnimation(this, R.anim.fading);
        view.startAnimation(fading);

        if (itemLanguage.equals("French")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.howmuchisitfr);
            sound.start();
        } else if (itemLanguage.equals("Chinese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Spanish")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("German")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Vietnamese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        }
    }
    public void thankClt (View view) {
        // starr animation for button
        fading = AnimationUtils.loadAnimation(this, R.anim.fading);
        view.startAnimation(fading);

        if (itemLanguage.equals("French")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.thankyoufr);
            sound.start();
        } else if (itemLanguage.equals("Chinese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Spanish")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("German")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Vietnamese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        }
    }
    //can you on click
    public void canYouClt (View view) {
        // starr animation for button
        fading = AnimationUtils.loadAnimation(this, R.anim.fading);
        view.startAnimation(fading);

        if (itemLanguage.equals("French")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.canyouhelpmefr);
            sound.start();
        } else if (itemLanguage.equals("Chinese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Spanish")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("German")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Vietnamese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        }
    }

    //im from on click
    public void imFromClt(View view) {
        // starr animation for button
        fading = AnimationUtils.loadAnimation(this, R.anim.fading);
        view.startAnimation(fading);

        if (itemLanguage.equals("French")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.imfromfr);
            sound.start();
        } else if (itemLanguage.equals("Chinese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Spanish")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("German")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else if (itemLanguage.equals("Vietnamese")) {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        } else {

            MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.doyouspeakenglishfr);
            sound.start();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Setup for Spinner Choice language.
        Spinner languages = findViewById(R.id.choiseLanguage);
        languages.setOnItemSelectedListener(this);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Languages, android.R.layout.simple_spinner_item);
        // Create an ArrayAdapter using the string array and a default spinner layout
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        languages.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

        switch (i)
        {
            case 0:
                itemLanguage = "French";
                break;
            case 1:
                itemLanguage = "Chinese";
                break;
            case 2:
                itemLanguage = "Spanish";
                break;
            case 3:
                itemLanguage = "German";
                break;
            case 4:
                itemLanguage = "Japanese";
                break;
            case 5:
                itemLanguage= "Vietnamese";
                break;

        }

        Toast.makeText(getApplicationContext(), itemLanguage , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
