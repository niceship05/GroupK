package com.example.grant.groupk;

import android.net.Uri;

public class Post {
    private String title;
    private String description;
    private String tp;
    private Uri imageURI;

    public Post(){

    }
    public Post(String title, String description, String tp, Uri imageURI){
        this.title = title;
        this.description = description;
        this.tp = tp;
        this.imageURI = imageURI;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public Uri getImageURI() {
        return imageURI;
    }

    public void setImageURI(Uri imageURI) {
        this.imageURI = imageURI;
    }
}
