package com.hut.entity;

public class ClassRoom {
    private String classId;
    private String classType;
    private String classContainer;
    private Integer classMedia;

    public ClassRoom() {
    }

    public ClassRoom(String classId, String classType, String classContainer, Integer classMedia) {
        this.classId = classId;
        this.classType = classType;
        this.classContainer = classContainer;
        this.classMedia = classMedia;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getClassContainer() {
        return classContainer;
    }

    public void setClassContainer(String classContainer) {
        this.classContainer = classContainer;
    }

    public Integer getClassMedia() {
        return classMedia;
    }

    public void setClassMedia(Integer classMedia) {
        this.classMedia = classMedia;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId='" + classId + '\'' +
                ", classType='" + classType + '\'' +
                ", classContainer='" + classContainer + '\'' +
                ", classMedia=" + classMedia +
                '}';
    }
}
