package github.com.maxhariel.FCCatalogo.domain.video;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import github.com.maxhariel.FCCatalogo.domain.BaseEntity;

public class Video extends BaseEntity {
    private String title;
    private String description;
    private Integer yearLuanched;
    private Boolean opened;
    private String rating;
    private Float duration;

    public Video() {
    }

    public Video(String title, String description, Integer yearLuanched, Boolean opened, String rating,
            Float duration) {
        super.generateUUID();
        this.title = title;
        this.description = description;
        this.yearLuanched = yearLuanched;
        this.opened = opened;
        this.rating = rating;
        this.duration = duration;
    }

    public Video(UUID id, String title, String description, Integer yearLuanched, Boolean opened) {
        super.setId(id);
        this.title = title;
        this.description = description;
        this.yearLuanched = yearLuanched;
        this.opened = opened;
    }

    public Video(String title, String description, Integer yearLuanched, Boolean opened) {
        super.generateUUID();
        this.title = title;
        this.description = description;
        this.yearLuanched = yearLuanched;
        this.opened = opened;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title == null)
            throw new IllegalArgumentException("video title is null");
        if (title.length() == 0)
            throw new IllegalAccessError("video title is blank");
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYearLuanched() {
        return this.yearLuanched;
    }

    public void setYearLuanched(Integer yearLuanched) {
        int currenteYear = Calendar.getInstance().get(Calendar.YEAR);
        if (yearLuanched > currenteYear)
            throw new IllegalArgumentException("video yearLuanched is greatter then current year ");
        this.yearLuanched = yearLuanched;
    }

    public Boolean isOpened() {
        return this.opened;
    }

    public Boolean getOpened() {
        return this.opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Float getDuration() {
        return this.duration;
    }

    public void setDuration(Float duration) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        this.setDuration(Float.valueOf(decimalFormat.format(duration)));
        this.duration = duration;
    }

}
