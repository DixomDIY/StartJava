public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Мужской"); 
        wolf.setNickname("Шарик");
        wolf.setWeight(20);
        System.out.println(wolf.setAge(10));
        System.out.println(wolf.setAge(5));
        wolf.setColor("Серый");
        System.out.println("Создан объект волк:\n" +
                "Пол - " + wolf.getGender() + "\n" +
                "Кличка - " + wolf.getNickname() + "\n" +
                "Вес - " + wolf.getWeight() + "\n" +
                "Возраст - " + wolf.getAge() + "\n" +
                "Цвет - " + wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}