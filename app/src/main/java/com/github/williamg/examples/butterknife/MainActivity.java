package com.github.williamg.examples.butterknife;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_txt)
    TextView textView;
    @BindView(R.id.main_imageview)
    ImageView imageView;

    //Bind resources
    @BindString(R.string.hello_butterknife)
    String string;
    @BindDrawable(R.drawable.image)
    Drawable image;
    @BindColor(R.color.colorAccent)
    int colorAccent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        textView.setText(string);
        textView.setTextColor(colorAccent);
        imageView.setImageDrawable(image);

    }
}
