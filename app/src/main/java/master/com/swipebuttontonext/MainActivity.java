package master.com.swipebuttontonext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        CustomSwipeButton mSwipeButton = findViewById(R.id.my_swipe_button);

        SwipeButtonCustomItems swipeButtonSettings = new SwipeButtonCustomItems() {
            @Override
            public void onSwipeConfirm() {
                startActivity(new Intent(MainActivity.this, NextActivityCall.class));
            }
        };

        swipeButtonSettings
                .setGradientColor1(0xFFFF9933)
                .setGradientColor2(0xFFFF9900)
                .setGradientColor2Width(60)
                .setGradientColor3(0xFFFF6633)
                .setPostConfirmationColor(0xFFFF6600)
                .setActionConfirmDistanceFraction(0.8);

        if (mSwipeButton != null) {
            mSwipeButton.setSwipeButtonCustomItems(swipeButtonSettings);
        }
    }
}
