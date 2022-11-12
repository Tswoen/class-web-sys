package com.hut.entity;

public class Course {
    private String courseId;
    private String courseName;
    private String courseScord;
    private String courseType;
    private String courseProfessionId;

    public Course() {
    }

    public Course(String courseId, String courseName, String courseScord, String courseType, String courseProfessionId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseScord = courseScord;
        this.courseType = courseType;
        this.courseProfessionId = courseProfessionId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseScord() {
        return courseScord;
    }

    public void setCourseScord(String courseScord) {
        this.courseScord = courseScord;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseProfessionId() {
        return courseProfessionId;
    }

    public void setCourseProfessionId(String courseProfessionId) {
        this.courseProfessionId = courseProfessionId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseScord='" + courseScord + '\'' +
                ", courseType='" + courseType + '\'' +
                ", courseProfessionId='" + courseProfessionId + '\'' +
                '}';
    }
}
