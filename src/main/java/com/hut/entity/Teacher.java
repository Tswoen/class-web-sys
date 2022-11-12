package com.hut.entity;

public class Teacher {
    private String teacherId;
    private String teacherName;
    private String sex;
    private String professionId;
    private String teacherRank;

    public Teacher() {
    }

    public Teacher(String teacherId, String teacherName, String sex, String professionId, String teacherRank) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.sex = sex;
        this.professionId = professionId;
        this.teacherRank = teacherRank;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId;
    }

    public String getTeacherRank() {
        return teacherRank;
    }

    public void setTeacherRank(String teacherRank) {
        this.teacherRank = teacherRank;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", sex='" + sex + '\'' +
                ", professionId='" + professionId + '\'' +
                ", teacherRank='" + teacherRank + '\'' +
                '}';
    }
}
