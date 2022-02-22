package github.com.maxhariel.FCCatalogo.domain.entity.video;

import java.text.DecimalFormat;

import github.com.maxhariel.FCCatalogo.domain.BaseEntity;

public class VideoFile extends BaseEntity {
    private String title;
    private Float duration;
    private String url;

    public VideoFile() {
    }

    public VideoFile(String title, Float duration, String url) {
        super.generateUUID();
        this.title = title;
        this.duration = duration;
        this.url = url;
    }

    public VideoFile(String title, Float duration) {
        super.generateUUID();
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title == null)
            throw new IllegalArgumentException("videofile title is null");
        if (title.length() == 0)
            throw new IllegalAccessError("videofile title is blank");
        this.title = title;
        this.title = title;
    }

    public Float getDuration() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Float.valueOf(decimalFormat.format(duration));
    }

    public void setDuration(Float duration) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        this.duration = Float.valueOf(decimalFormat.format(duration));
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
