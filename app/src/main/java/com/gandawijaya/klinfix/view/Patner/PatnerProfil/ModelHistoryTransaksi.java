package com.gandawijaya.klinfix.view.Patner.PatnerProfil;

public class ModelHistoryTransaksi {

    String Title;

    @Override
    public String toString() {
        return "ModelHistoryTransaksi{" +
                "Title='" + Title + '\'' +
                ", SubTitle='" + SubTitle + '\'' +
                ", Total='" + Total + '\'' +
                '}';
    }

    String SubTitle;
    String Total;

    public ModelHistoryTransaksi(String title, String subTitle, String total) {
        Title = title;
        SubTitle = subTitle;
        Total = total;
    }



    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubTitle() {
        return SubTitle;
    }

    public void setSubTitle(String subTitle) {
        SubTitle = subTitle;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }



}
