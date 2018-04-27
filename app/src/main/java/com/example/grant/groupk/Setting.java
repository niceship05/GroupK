package com.example.grant.groupk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by megry on 4/4/2018.
 */

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test2, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_home:
                startActivity(new Intent(this, Homepage.class));
                return true;
            case R.id.action_catalog:
                startActivity(new Intent (this, CatalogMain.class));
                return true;
            case R.id.action_profile:
                startActivity(new Intent (this, ProfilePage.class));
                return true;
            case R.id.action_settings:
                startActivity(new Intent (this, Setting.class));
                return true;
            case R.id.action_chat:
                startActivity(new Intent (this, ChatRoom.class));
                return true;
            case R.id.action_calender:
                startActivity(new Intent (this, CalendarActivity.class));
                return true;
            case R.id.action_map:
                startActivity(new Intent (this, MapsActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
