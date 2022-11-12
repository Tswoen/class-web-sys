package com.hut.entity;

public class UseOfClass {
    private String id;
    private String teacherId;
    private String classId;
    private String courseId;
    private String professionId;
    private String timeSegment;
    private String week;

    public UseOfClass(String id, String teacherId, String classId, String courseId, String professionId, String timeSegment, String week) {
        this.id = id;
        this.teacherId = teacherId;
        this.classId = classId;
        this.courseId = courseId;
        this.professionId = professionId;
        this.timeSegment = timeSegment;
        this.week = week;
    }

    public UseOfClass() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId;
    }

    public String getTimeSegment() {
        return timeSegment;
    }

    public void setTimeSegment(String timeSegment) {
        this.timeSegment = timeSegment;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "UseOfClass{" +
                "id='" + id + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", classId='" + classId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", professionId='" + professionId + '\'' +
                ", timeSegment='" + timeSegment + '\'' +
                ", week='" + week + '\'' +
                '}';
    }
}
