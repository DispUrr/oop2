package ru.netology.domain;

public class CopyrightInfo {
    private int copyrightId;
    private String copyrightLink;
    private String copyrightName;
    private String copyrightType;

    public int getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(int copyrightId) {
        this.copyrightId = copyrightId;
    }

    public String getCopyrightLink() {
        return copyrightLink;
    }

    public void setCopyrightLink(String copyrightLink) {
        this.copyrightLink = copyrightLink;
    }

    public String getCopyrightName() {
        return copyrightName;
    }

    public void setCopyrightName(String copyrightName) {
        this.copyrightName = copyrightName;
    }

    public String getCopyrightType() {
        return copyrightType;
    }

    public void setCopyrightType(String copyrightType) {
        this.copyrightType = copyrightType;
    }
}
