package com.example.assigenemt7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflater object created that will inflate our menu I created
        MenuInflater inflater = getMenuInflater();
        //Menu resource passed and menu interface object that helps to create and manage menu
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item1){
            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.item2){
            Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.item3){
            Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.subitem1){
            Toast.makeText(this, "Sub-Item 1 clicked", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.subitem2){
            Toast.makeText(this, "Sub-Item 2 clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}