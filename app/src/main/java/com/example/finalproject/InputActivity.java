package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {
    private ImageButton angryButton;
    private ImageButton energyButton;
    private ImageButton happyButton;
    private ImageButton lonelyButton;
    private ImageButton sleepyButton;
    private ImageButton productiveButton;
    private ImageButton sadButton;
    private ImageButton calmButton;
    private Button pauseHappy;
    private Button backHappy;
    private Button pauseAngry;
    private Button backAngry;
    private Button pauseSad;
    private Button backSad;
    private Button pauseProductive;
    private Button backProductive;
    private Button pauseEnergy;
    private Button backEnergy;
    private Button pauseCalm;
    private Button backCalm;
    private Button pauseSleepy;
    private Button backSleepy;
    private Button pauseLonely;
    private Button backLonely;

    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_page);

        happyButton = findViewById(R.id.btnHappy);
        angryButton = findViewById(R.id.btnAngry);
        energyButton = findViewById(R.id.btnEnergetic);
        lonelyButton = findViewById(R.id.btnLonely);
        sleepyButton = findViewById(R.id.btnSleepy);
        productiveButton = findViewById(R.id.btnProductive);
        sadButton = findViewById(R.id.btnSad);
        calmButton = findViewById(R.id.btnCalm);

        pauseHappy = findViewById(R.id.pshappy);
        backHappy = findViewById(R.id.backHapy);
        pauseAngry = findViewById(R.id.psangry);
        backAngry = findViewById(R.id.backAngry);
        pauseSad = findViewById(R.id.pssad);
        backSad = findViewById(R.id.backSad);
        pauseProductive = findViewById(R.id.psproductive);
        backProductive = findViewById(R.id.backProductive);
        pauseEnergy = findViewById(R.id.psenergetic);
        backEnergy = findViewById(R.id.backEnergetic);
        pauseCalm = findViewById(R.id.psCalm);
        backCalm = findViewById(R.id.backCalm);
        pauseSleepy = findViewById(R.id.pssleepy);
        backSleepy = findViewById(R.id.backSleepy);
        pauseLonely = findViewById(R.id.pslonely);
        backLonely = findViewById(R.id.backLonely);




        happyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.happy);
                song = MediaPlayer.create(InputActivity.this, R.raw.happysong);
                song.start();
                pauseHappy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (song.isPlaying()) {
                            song.pause();
                        } else {
                            song.start();
                        }

                    }
                });
                backHappy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        song.stop();
                        Intent intent = new Intent(InputActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });


            }
        });

        angryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.angry);
                song = MediaPlayer.create(InputActivity.this, R.raw.angrysong);
                song.start();
                pauseAngry.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (song.isPlaying()) {
                            song.pause();
                        } else {
                            song.start();
                        }

                    }
                });
                backAngry.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        song.stop();
                        Intent intent = new Intent(InputActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });

            }
        });
        energyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.energetic);
                song = MediaPlayer.create(InputActivity.this, R.raw.energysong);
                song.start();
                pauseEnergy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (song.isPlaying()) {
                            song.pause();
                        } else {
                            song.start();
                        }

                    }
                });
                backEnergy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        song.stop();
                        Intent intent = new Intent(InputActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });

            }
        });
        lonelyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.lonely);
                song = MediaPlayer.create(InputActivity.this, R.raw.lonelysong);
                song.start();
                pauseLonely.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (song.isPlaying()) {
                            song.pause();
                        } else {
                            song.start();
                        }

                    }
                });
                backLonely.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        song.stop();
                        Intent intent = new Intent(InputActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });

            }
        });
        sleepyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.sleepy);
                song = MediaPlayer.create(InputActivity.this, R.raw.sleepysong);
                song.start();
                pauseSleepy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (song.isPlaying()) {
                            song.pause();
                        } else {
                            song.start();
                        }

                    }
                });
                backSleepy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        song.stop();
                        Intent intent = new Intent(InputActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });

            }
        });
        productiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.productive);
                song = MediaPlayer.create(InputActivity.this, R.raw.productivesong);
                song.start();
                pauseProductive.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (song.isPlaying()) {
                            song.pause();
                        } else {
                            song.start();
                        }

                    }
                });
                pauseProductive.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        song.stop();
                        Intent intent = new Intent(InputActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });


            }
        });
        sadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.sad);
                song = MediaPlayer.create(InputActivity.this, R.raw.sadsong);
                song.start();
                pauseSad.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (song.isPlaying()) {
                            song.pause();
                        } else {
                            song.start();
                        }

                    }
                });
                backSad.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        song.stop();
                        Intent intent = new Intent(InputActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });


            }
        });
        calmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.calm);
                song = MediaPlayer.create(InputActivity.this, R.raw.calmsong);
                song.start();
                pauseCalm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (song.isPlaying()) {
                            song.pause();
                        } else {
                            song.start();
                        }

                    }
                });
                backCalm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        song.stop();
                        Intent intent = new Intent(InputActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });


            }
        });

    }


}


