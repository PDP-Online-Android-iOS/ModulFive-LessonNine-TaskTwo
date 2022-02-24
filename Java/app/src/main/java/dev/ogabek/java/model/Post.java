package dev.ogabek.java.model;

public class Post {

    private final boolean isNewProfile;
    private final int photo;
    private final int profile;
    private final String fullName;

    public Post(int profile, String fullName, int photo, boolean isNewProfile) {
        this.photo = photo;
        this.profile = profile;
        this.fullName = fullName;
        this.isNewProfile = isNewProfile;
    }

    public boolean isNewProfile() {
        return isNewProfile;
    }

    public int getPhoto() {
        return photo;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullName() {
        return fullName;
    }
}
