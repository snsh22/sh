package com.snsh.dev.shopping.model;

import com.google.gson.annotations.SerializedName;

public class BestDealModel {

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("text_1")
    private String text1;

    @SerializedName("text_2")
    private String text2;

    @SerializedName("id")
    private String id;

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText1() {
        return text1;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText2() {
        return text2;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "BestDealModel{" +
                        "image_url = '" + imageUrl + '\'' +
                        ",text_1 = '" + text1 + '\'' +
                        ",text_2 = '" + text2 + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}