package com.example.android.iasitourguide;

import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the toolbar with the ID toolbar.
        Toolbar toolbar = findViewById(R.id.toolbar);
        // Set toolbar to act as the ActionBar for this Activity window.
        setSupportActionBar(toolbar);

        // Get the actionbar
        ActionBar actionbar = getSupportActionBar();
        // Enable the app bar's "home" button.
        actionbar.setDisplayHomeAsUpEnabled(true);
        // Change it to use the menu icon ic_menu
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        // Get the drawer layout
        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);

        // Checked the first item of the menu (when the app opens)
        navigationView.getMenu().getItem(0).setChecked(true);

        /*
            Set the first category of attractions as the opening one
         */
        Fragment fragment = new HotelsFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content_frame, fragment);
        ft.commit();
        // and set the action bar's title
        setTitle(navigationView.getMenu().getItem(0).getTitle());

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        // Highlight the selected item has been done by NavigationView
                        menuItem.setChecked(true);

                        // Get the id of the clicked item
                        int id = menuItem.getItemId();
                        // Call the method that displays the category chosen
                        displaySelectedScreen(id);

                        // Set action bar title
                        setTitle(menuItem.getTitle());

                        // Close the navigation drawer
                        mDrawerLayout.closeDrawers();

                        return true;

                    }
                });

    }

    private void displaySelectedScreen(int id) {
        Fragment fragment = null;

        // Identify the category chosen by the user
        switch (id) {
            case R.id.nav_hotels:
                fragment = new HotelsFragment();
                break;
            case R.id.nav_restaurants:
                fragment = new RestaurantsFragment();
                break;
            case R.id.nav_parks:
                fragment = new ParksFragment();
                break;
            case R.id.nav_attractions:
                fragment = new AttractionsFragment();
                break;
            case R.id.nav_churches:
                fragment = new ChurchesFragment();
                break;
        }

        // Display the category
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }
    }

    @Override
    // Open the drawer when the button is tapped.
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
