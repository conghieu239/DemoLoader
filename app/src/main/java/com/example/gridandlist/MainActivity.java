package com.example.gridandlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends Activity implements LoaderManager.LoaderCallbacks<ArrayList<Photo>> {
    GridView gridview;
    private AdapterView.OnItemClickListener onitemclick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getBaseContext(), ViewPhotoActivity.class);
            intent.putExtra("id", gridview.getAdapter().getItemId(position));
            startActivity(intent);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = findViewById(R.id.gridview);
        PhotoAdapter adapter = new PhotoAdapter(PhotoData.generatePhotoData(), getApplicationContext());
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(onitemclick);
    }
    public Loader<ArrayList<Photo>> onCreateLoader(int id, Bundle args) {
        // Trả về một PhotoLoader để tải danh sách Photo
        return new PhotoLoader(this);
    }
    @Override
    public void onLoadFinished(Loader<ArrayList<Photo>> loader, ArrayList<Photo> data) {}

    @Override
    public void onLoaderReset(Loader<ArrayList<Photo>> loader) {}
}