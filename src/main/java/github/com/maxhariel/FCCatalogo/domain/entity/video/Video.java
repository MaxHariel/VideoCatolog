package github.com.maxhariel.FCCatalogo.domain.entity.video;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import github.com.maxhariel.FCCatalogo.domain.BaseEntity;
import github.com.maxhariel.FCCatalogo.domain.entity.castmember.CastMember;
import github.com.maxhariel.FCCatalogo.domain.entity.category.Category;
import github.com.maxhariel.FCCatalogo.domain.entity.genre.Genre;

public class Video extends BaseEntity {
    private String title;
    private String description;
    private Integer yearLaunched;
    private Boolean opened;
    private String rating;
    private Float duration;
    private List<Category> categories = new ArrayList<>();
    private List<Genre> genres = new ArrayList<>();
    private List<CastMember> castMembers = new ArrayList<>();
    private List<VideoFile> videoFiles = new ArrayList<>();

    public Video() {
    }

    public Video(String title, String description, Integer yearLaunched, Boolean opened, String rating,
            Float duration) {
        super.generateUUID();
        this.title = title;
        this.description = description;
        this.yearLaunched = yearLaunched;
        this.opened = opened;
        this.rating = rating;
        this.duration = duration;
    }

    public Video(UUID id, String title, String description, Integer yearLaunched, Boolean opened) {
        super.setId(id);
        this.title = title;
        this.description = description;
        this.yearLaunched = yearLaunched;
        this.opened = opened;
    }

    public Video(UUID id, String title, String description, Integer yearLaunched, Boolean opened,
            List<VideoFile> videoFiles) {
        super.setId(id);
        this.title = title;
        this.description = description;
        this.yearLaunched = yearLaunched;
        this.opened = opened;
        this.videoFiles = videoFiles;
    }

    public Video(String title, String description, Integer yearLaunched, Boolean opened) {
        super.generateUUID();
        this.title = title;
        this.description = description;
        this.yearLaunched = yearLaunched;
        this.opened = opened;
    }

    public Video(String title, String description, Integer yearLaunched, Float duration, List<Category> categories,
            List<Genre> genres, List<CastMember> castMembers) {
        super.generateUUID();
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLaunched(yearLaunched);
        this.setDuration(duration);
        this.setCategories(categories);
        this.setGenres(genres);
        this.setCastMembers(castMembers);
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

    public Integer getyearLaunched() {
        return this.yearLaunched;
    }

    public void setYearLaunched(Integer yearLaunched) {
        int currenteYear = Calendar.getInstance().get(Calendar.YEAR);
        if (yearLaunched > currenteYear)
            throw new IllegalArgumentException("video yearLaunched is greatter then current year ");
        this.yearLaunched = yearLaunched;
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

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        if (categories == null)
            throw new IllegalArgumentException("video categories is null");
        this.categories = categories;
    }

    public List<Genre> getGenres() {
        return this.genres;
    }

    public void setGenres(List<Genre> genres) {
        if (categories == null)
            throw new IllegalArgumentException("video genres is null");
        this.genres = genres;
    }

    public List<CastMember> getCastMembers() {
        return this.castMembers;
    }

    public void setCastMembers(List<CastMember> castMembers) {
        if (categories == null)
            throw new IllegalArgumentException("video castMembers categories is null");
        this.castMembers = castMembers;
    }

    public List<VideoFile> getVideoFiles() {
        return this.videoFiles;
    }

    public void setVideoFiles(List<VideoFile> videoFiles) {
        if (videoFiles == null)
            throw new IllegalArgumentException("video videofiles is null");
        this.videoFiles = videoFiles;
    }

    public void addCategory(Category category) {
        if (category == null)
            throw new IllegalArgumentException("category is null");
        this.categories.add(category);
    }

    public void removeCategory(Category category) {
        if (category == null)
            throw new IllegalArgumentException("category is null");
        this.categories.removeIf(c -> categories.contains(category));
    }

    public void addGenre(Genre gnere) {
        if (gnere == null)
            throw new IllegalArgumentException("gnere is null");
        this.genres.add(gnere);
    }

    public void removeGenre(Genre genre) {
        if (genre == null)
            throw new IllegalArgumentException("genre is null");
        this.genres.removeIf(g -> genres.contains(genre));
    }

    public void addCastMember(CastMember castMember) {
        if (castMember == null)
            throw new IllegalArgumentException("castMember is null");
        this.castMembers.add(castMember);
    }

    public void removeCastMember(CastMember castMember) {
        if (castMember == null)
            throw new IllegalArgumentException("castMember is null");
        this.castMembers.removeIf(c -> castMembers.contains(castMember));
    }

    public Video createVideoWithFiles(String title, String description, Integer yearLaunched, Float duration,
            List<Category> categories, List<Genre> genres, List<CastMember> castMembers, List<VideoFile> videoFiles) {
        this.generateUUID();
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLaunched(yearLaunched);
        this.setDuration(duration);
        this.setCategories(categories);
        this.setGenres(genres);
        this.setCastMembers(castMembers);
        this.setVideoFiles(videoFiles);
        return this;
    }

    public Video createVideoWithoutFile(String title, String description, Integer yearLaunched, Float duration,
            List<Category> categories, List<Genre> genres, List<CastMember> castMembers) {
        this.generateUUID();
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLaunched(yearLaunched);
        this.setDuration(duration);
        this.setCategories(categories);
        this.setGenres(genres);
        this.setCastMembers(castMembers);
        return this;
    }
}
