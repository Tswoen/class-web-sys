package com.hut.entity;

public class Profession {
    private String professionId;
    private String professionName;

    public Profession() {
    }

    public Profession(String professionId, String professionName) {
        this.professionId = professionId;
        this.professionName = professionName;
    }

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "professionId='" + professionId + '\'' +
                ", professionName='" + professionName + '\'' +
                '}';
    }
}
