package com.gandawijaya.klinfix.view.User.HomeUser;

public class ModelHomeKlin {

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getDescImage() {
        return descImage;
    }

    public void setDescImage(String descImage) {
        this.descImage = descImage;
    }

    public ModelHomeKlin(String urlImage, String descImage) {
        this.urlImage = urlImage;
        this.descImage = descImage;
    }

    @Override
    public String toString() {
        return "ModelHomeKlin{" +
                "urlImage='" + urlImage + '\'' +
                ", descImage='" + descImage + '\'' +
                '}';
    }

    String urlImage;
    String descImage;

}
