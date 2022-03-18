/**
 * @class Information
 * @date 2022/3/18 19:38
 * @author Yinkai Yang
 * @version 1.0
 * @description //TODO
 */

package com.yinkai.entity;

public class Information {
    private String name;
    private String sex;
    private String position;
    private String classification;
    private String area;
    private String introduction;

    public Information() {

    }

    public Information(String name, String sex, String position, String classification, String area, String introduction) {
        this.name = name;
        this.sex = sex;
        this.position = position;
        this.classification = classification;
        this.area = area;
        this.introduction = introduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", position='" + position + '\'' +
                ", classification='" + classification + '\'' +
                ", area='" + area + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
