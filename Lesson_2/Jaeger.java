public class Jaeger {

    private String model;
    private String mark;
    private float hight;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private int kaijuKilled;

    public Jaeger() {}

    public Jaeger(String model, String mark, float hight, float weight,
            int speed, int strength, int armor, int kaijuKilled) {
        this.model = model;
        this.mark = mark;
        this.hight = hight;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.kaijuKilled = kaijuKilled;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public float getHight() {
        return hight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void run() {
        System.out.println("Егерь " + model + " бежит со скоростью " + speed + " мс");
    }

    public void killKaiju() {
        kaijuKilled++;
        System.out.println("Егерь " + model + " убил кайдзю");
    }

    public void showKilledKaiju() {
        System.out.println("Ягер " + model + " " + mark + " убил " + kaijuKilled + " шт. кайдзю");
    }
}