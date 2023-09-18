package com.example.gridandlist;

import androidx.loader.content.AsyncTaskLoader;
import android.content.Context;

import com.example.gridandlist.Photo;

import java.util.ArrayList;

public class PhotoLoader extends AsyncTaskLoader<ArrayList<Photo>> {
    public PhotoLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public ArrayList<Photo> loadInBackground() {
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-doraemon.png", "Doraemon", "Meo"));
        photos.add(new Photo(1, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-nobita.png", "Nobita  ", "Hau Dau"));
        photos.add(new Photo(2, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-shizuka.png?w=500&h=895", "Shizụka", ""));
        photos.add(new Photo(3, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-suneo.gif?w=500&h=719", "Suneo", ""));
        photos.add(new Photo(4, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-jaian.jpg", "Jaian", ""));
        photos.add(new Photo(5, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-dekisugi.gif?w=500&h=586", "Dekisugi", ""));
        photos.add(new Photo(6, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-dorami.jpg?w=500&h=595", "Doraemi", ""));
        photos.add(new Photo(7, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-sewashi.jpg", "Sewasi", ""));
        photos.add(new Photo(8, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-jaiko.jpg?w=500&h=500", "Jaiko", ""));
        photos.add(new Photo(9, "https://hoatrinhnushojo.files.wordpress.com/2015/04/cac-nhan-vat-chinh-trong-truyen-va-phim-doraemon-cho-be-yeu-tham-khao-mama-nobita.jpg", "Mama", ""));
        return photos;
    }
}
