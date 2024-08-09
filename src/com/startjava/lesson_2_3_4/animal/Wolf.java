package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private String gender;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age > 8) {
            return false;
        }
        this.age = age;
        return true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println(nickname + " идёт");
    }

    public void sit() {
        System.out.println(nickname + " сидит");
    }

    public void run() {
        System.out.println(nickname + " бежит");
    }

    public void howl() {
        System.out.println(nickname + " воет");
    }

    public void hunt() {
        System.out.println(nickname + " охотится");
    }
}