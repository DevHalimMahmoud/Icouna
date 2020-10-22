package com.example.icouna.ui.about;

public class Awards {
    public int getAward_image() {
        return award_image;
    }

    public void setAward_image(int award_image) {
        this.award_image = award_image;
    }

    public String getAward_title() {
        return award_title;
    }

    public void setAward_title(String award_title) {
        this.award_title = award_title;
    }

    private int award_image;
    private String award_title;

    public Awards(int award_image, String award_title) {
        this.award_image = award_image;
        this.award_title = award_title;
    }
}
