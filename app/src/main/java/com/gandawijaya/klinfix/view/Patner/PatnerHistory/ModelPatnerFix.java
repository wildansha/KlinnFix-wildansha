package com.gandawijaya.klinfix.view.Patner.PatnerHistory;

public class ModelPatnerFix {

    String urlImage;
    String titleHeader;

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getTitleHeader() {
        return titleHeader;
    }

    public void setTitleHeader(String titleHeader) {
        this.titleHeader = titleHeader;
    }

    public String getCodeTitleHeader() {
        return codeTitleHeader;
    }

    public void setCodeTitleHeader(String codeTitleHeader) {
        this.codeTitleHeader = codeTitleHeader;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String codeTitleHeader;
    String description;

    public ModelPatnerFix(String urlImage, String titleHeader, String codeTitleHeader, String description) {
        this.urlImage = urlImage;
        this.titleHeader = titleHeader;
        this.codeTitleHeader = codeTitleHeader;
        this.description = description;
    }





}
