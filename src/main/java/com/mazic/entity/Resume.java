package com.mazic.entity;

public class Resume {

    private int resumeId;
    private String selfIntroduce;//介绍
    private String selfAbility;//能力
    private String selfLanguage;//语言
    private String selfEducation;//学历
    private String selfExperience;//工作经验
    private String selfHobby;//爱好

    public String getSelfEducation()
    {
        return selfEducation;
    }

    public void setSelfEducation(String selfEducation) {
        this.selfEducation = selfEducation;
    }

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public String getSelfIntroduce() {
        return selfIntroduce;
    }

    public void setSelfIntroduce(String selfIntroduce) {
        this.selfIntroduce = selfIntroduce;
    }

    public String getSelfLanguage() {
        return selfLanguage;
    }

    public void setSelfLanguage(String selfLanguage) {
        this.selfLanguage = selfLanguage;
    }

    public String getSelfAbility() {
        return selfAbility;
    }

    public void setSelfAbility(String selfAbility) {
        this.selfAbility = selfAbility;
    }

    public String getSelfExperience() {
        return selfExperience;
    }

    public void setSelfExperience(String selfExperience) {
        this.selfExperience = selfExperience;
    }

    public String getSelfHobby() {
        return selfHobby;
    }

    public void setSelfHobby(String selfHobby) {
        this.selfHobby = selfHobby;
    }
}
