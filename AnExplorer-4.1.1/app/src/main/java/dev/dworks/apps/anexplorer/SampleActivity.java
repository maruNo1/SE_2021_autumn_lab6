package dev.dworks.apps.anexplorer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
    public void sendMessage2(View view) {
        Intent intent = new Intent(this, PurchaseActivity.class);
        startActivity(intent);
    }



}