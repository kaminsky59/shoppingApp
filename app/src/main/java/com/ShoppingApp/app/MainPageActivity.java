package com.ShoppingApp.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.FrameLayout;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainPageActivity extends ActionBarActivity {

    private CameraPreview mPreview;
    private CameraManager mCameraManager;
    private HoverView mHoverView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_scan);

       /* Display display = getWindowManager().getDefaultDisplay();
        mHoverView = (HoverView)findViewById(R.id.hover_view);
        mHoverView.update(display.getWidth(), display.getHeight());

        mCameraManager = new CameraManager(this);
        mPreview = new CameraPreview(this, mCameraManager.getCamera());
        mPreview.setArea(mHoverView.getHoverLeft(), mHoverView.getHoverTop(), mHoverView.getHoverAreaWidth(), display.getWidth());
        FrameLayout preview = (FrameLayout) findViewById(R.id.camera_preview);
        preview.addView(mPreview);*/

        //getActionBar().hide();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void MainScan_Scan(View v)
    {
        IntentIntegrator scanIntegrator = new IntentIntegrator(this);
        scanIntegrator.initiateScan();

        //startActivity(new Intent(MainPageActivity.this, BarcodeCamActivity.class));
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        //Scan Result
    }

    public void CartPressed(View v)
    {
        startActivity(new Intent(MainPageActivity.this, CartActivity.class));
    }


    /**
     * A placeholder fragment containing a simple view.
     */
}
