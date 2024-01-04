public class Jager {

    private String model;
    private String mark;
    private float hight;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private int kaijuKilled;

    public Jager() {}

    public Jager(String model, String mark, float hight, float weight, int speed, int strength,
            int armor, int kaijuKilled) {
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

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public void run() {
        System.out.println("Ягер " + model + " бежит со скоростью " + speed + " мс");
    }

    public void killKaiju() {
        kaijuKilled++;
        System.out.println("Ягер " + model + " убил кайдзю");
    }

    public void showKilledKaiju() {
        System.out.println("Ягер " + model + " " + mark + " убил " + kaijuKilled + " шт. кайдзю");
    }
}