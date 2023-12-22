public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Мужской";
        wolf.nickname = "Шарик";
        wolf.weight = 20;
        wolf.age = 5;
        wolf.color = "Серый";
        System.out.println("Создан объект волк:" +
                "\nПол - " + wolf.gender +
                "\nКличка - " + wolf.nickname +
                "\nВес - " + wolf.weight +
                "\nВозраст - " + wolf.age +
                "\nЦвет - " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}