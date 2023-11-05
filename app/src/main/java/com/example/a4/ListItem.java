package com.example.a4;

import android.graphics.Bitmap;

//public class ListItem {
//    int imageResource;
//    String name;
//    String tagText;
//
//    ListItem(int imageResource, String name) {
//        this.imageResource = imageResource;
//        this.name = name;
//        this.tagText = tagText;
//    }
public class ListItem {
    private int imageResource;
    private Bitmap imageBitmap;
    private String tagText;

    public ListItem(int imageResourceId, String tagText) {
        this.imageResource = imageResourceId;
        this.tagText = tagText;
    }

    //using Bitmap instead of int works better for photos?
    public ListItem(Bitmap imageBitmap, String tagText) {
        this.imageBitmap = imageBitmap;
        this.tagText = tagText;
    }

    public int getImageResource() {
        return imageResource;
    }

    public Bitmap getImageBitmap() {
        return imageBitmap;
    }

    public String getTagText() {
        return tagText;
    }
}