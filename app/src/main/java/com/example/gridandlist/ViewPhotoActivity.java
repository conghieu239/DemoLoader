package com.example.gridandlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class ViewPhotoActivity extends AppCompatActivity {
    ImageView iv_detail;

    TextView tv_detail_title, tv_detail_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photo);
        iv_detail = findViewById(R.id.iv_detail);
        tv_detail_title = findViewById(R.id.tv_detail_title);
        tv_detail_description = findViewById(R.id.tv_detail_description);
        int id = (int) getIntent().getLongExtra("id", 0);
        Picasso.get().load((PhotoData.getPhotoFromId(id).getSource_photo())).resize(400,500).centerCrop().into(iv_detail);
        tv_detail_title.setText((PhotoData.getPhotoFromId(id)).getTitle_photo());
        tv_detail_description.setText((PhotoData.getPhotoFromId(id)).getDescription_photo());
    }
}