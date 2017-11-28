/**
 * The purpose of this application is for the user to be able to adjust the colour swatch using the three seekbars available. One controls the hue
 * value, the second controls the saturation value, and while the last one controls the brightness/value value. There are buttons at the bottom that
 * represent the predefined colours that when clicked, set the colour swatch to the corresponding values.
 *
 * @author Ramon Tabilin (tabi0011@algonquinlive.com)
 */

package com.algonquincollege.tabi0011.hsvcolorpicker;

import android.app.Activity;
import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Observable;
import java.util.Observer;

import model.RGBAModel;

public class MainActivity extends Activity implements Observer, SeekBar.OnSeekBarChangeListener {

    private static final String ABOUT_DIALOG_TAG = "About Dialog";
    private static final String LOG_TAG = "RGBA";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.action_about) {
            DialogFragment newFragment = new AboutDialogFragment();
            newFragment.show(getFragmentManager(), ABOUT_DIALOG_TAG);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private AboutDialogFragment mAboutDialog;
    private TextView mColorSwatch;
    private RGBAModel mModel;
    private SeekBar mHueSB;
    private TextView mHueTV;
    private SeekBar mSaturationSB;
    private TextView mSaturationTV;
    private SeekBar mValueSB;
    private TextView mValueTV;

//    private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initiate all the buttons and set listeners
        Button btnBlack = findViewById(R.id.blackButton);
        Button btnRed = findViewById(R.id.redButton);
        Button btnLime = findViewById(R.id.limeButton);
        Button btnBlue = findViewById(R.id.blueButton);
        Button btnYellow = findViewById(R.id.yellowButton);
        Button btnCyan = findViewById(R.id.cyanButton);
        Button btnMagenta = findViewById(R.id.magentaButton);
        Button btnSilver = findViewById(R.id.silverButton);
        Button btnGray = findViewById(R.id.grayButton);
        Button btnMaroon = findViewById(R.id.maroonButton);
        Button btnOlive = findViewById(R.id.oliveButton);
        Button btnGreen = findViewById(R.id.greenButton);
        Button btnPurple = findViewById(R.id.purpleButton);
        Button btnTeal = findViewById(R.id.tealButton);
        Button btnNavy = findViewById(R.id.navyButton);

        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asBlack();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asRed();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnLime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asLime();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asBlue();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asYellow();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnCyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asCyan();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnMagenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asMagenta();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnSilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asSilver();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asGray();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnMaroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asMaroon();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnOlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asOlive();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asGreen();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asPurple();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnTeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asTeal();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        btnNavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mModel.asNavy();
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
            }
        });

        // Instantiate a new AboutDialogFragment()
        // but do not show it (yet)
        mAboutDialog = new AboutDialogFragment();

        // Instantiate a new RGBA model
        // Initialize the model hue (min), saturation (min), and value (min)
        mModel = new RGBAModel();
        mModel.setHue(RGBAModel.MIN_HUE);
        mModel.setSaturation(RGBAModel.MIN_SAT);
        mModel.setValue(RGBAModel.MIN_VAL);
        // The Model is observing this Controller (class MainActivity implements Observer)
        mModel.addObserver(this);

        // reference each View
        mColorSwatch = findViewById(R.id.colorSwatch);
        mHueSB = findViewById(R.id.hueSB);
        mHueTV = findViewById(R.id.hue);
        mSaturationSB = findViewById(R.id.saturationSB);
        mSaturationTV = findViewById(R.id.saturation);
        mValueSB = findViewById(R.id.valueSB);
        mValueTV = findViewById(R.id.value);

        // set the domain (i.e. max) for each component
        mHueSB.setMax(RGBAModel.MAX_HUE);
        mSaturationSB.setMax(RGBAModel.MAX_SAT);
        mValueSB.setMax(RGBAModel.MAX_VAL);

        // register the event handler for each <SeekBar>
        mHueSB.setOnSeekBarChangeListener(this);
        mSaturationSB.setOnSeekBarChangeListener(this);
        mValueSB.setOnSeekBarChangeListener(this);

        // initialize the View to the values of the Model
        this.updateView();

        mColorSwatch.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "H: " + mModel.getHue() + "\u00B0 S: " + mModel.getSaturation() + "% V: " + mModel.getValue() + "%", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    /**
     * Event handler for the <SeekBar>s: red, green, blue, and alpha.
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        // Did the user cause this event?
        // YES > continue
        // NO  > leave this method
        if (fromUser == false) {
            return;
        }

        // Determine which <SeekBark> caused the event (switch + case)
        // GET the SeekBar's progress, and SET the model to it's new value
        switch (seekBar.getId()) {
            case R.id.hueSB:
                mModel.setHue(mHueSB.getProgress());
                mHueTV.setText(getResources().getString(R.string.hueProgress, progress).toUpperCase() + "\u00B0");
                break;
            case R.id.saturationSB:
                mModel.setSaturation(mSaturationSB.getProgress());
                mSaturationTV.setText(getResources().getString(R.string.saturationProgress, progress).toUpperCase() + "%");
                break;
            case R.id.valueSB:
                mModel.setValue(mValueSB.getProgress());
                mValueTV.setText(getResources().getString(R.string.valueProgress, progress).toUpperCase() + "%");
                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // No-Operation
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        switch (seekBar.getId()) {
            case R.id.hueSB:
                mHueTV.setText(getResources().getString(R.string.hue));
                break;
            case R.id.saturationSB:
                mSaturationTV.setText(getResources().getString(R.string.saturation));
                break;
            case R.id.valueSB:
                mValueTV.setText(getResources().getString(R.string.value));
                break;

        }
    }

    @Override
    public void update(Observable observable, Object data) {
        Log.i(LOG_TAG, "The color (int) is: " + mModel.getColor() + "");

        this.updateView();
    }


    //GET the model's hue value, and SET the hue <SeekBar>
    private void updateHueSB() {
        mHueSB.setProgress(mModel.getHue());
    }

    private void updateSaturationSB() {
        mSaturationSB.setProgress(mModel.getSaturation());
    }

    private void updateValueSB() {
        mValueSB.setProgress(mModel.getValue());
    }

    private void updateColorSwatch() {
        //GET the model's h,s,v values, and SET the background colour of the swatch <TextView>
        mColorSwatch.setBackgroundColor(Color.HSVToColor(new float[]{mModel.getHue(), (float) mModel.getSaturation() / 100, (float) mModel.getValue() / 100}));
    }

    // synchronize each View component with the Model
    public void updateView() {
        this.updateColorSwatch();
        this.updateHueSB();
        this.updateSaturationSB();
        this.updateValueSB();
    }
}
