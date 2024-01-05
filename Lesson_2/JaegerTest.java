public class JaegerTest {

    public static void main(String[] args) {
        Jaeger coyoteTango = new Jaeger();
        coyoteTango.setModel("Coyote Tango");
        coyoteTango.setMark("Mark-1");
        coyoteTango.setHight(85.34f);
        coyoteTango.setWeight(7450);
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);
        coyoteTango.setKaijuKilled(10);
        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", 76.2f, 6122, 9, 8, 6, 15);

        showJaegerInfo(coyoteTango);
        showJaegerInfo(crimsonTyphoon); 
        
        coyoteTango.run();
        crimsonTyphoon.run();
        coyoteTango.killKaiju();
        crimsonTyphoon.killKaiju();
        coyoteTango.killKaiju();
        crimsonTyphoon.killKaiju();
        coyoteTango.killKaiju();
        crimsonTyphoon.killKaiju();
        coyoteTango.killKaiju();
        crimsonTyphoon.killKaiju();
        coyoteTango.showKilledKaiju();
        crimsonTyphoon.showKilledKaiju();

        System.out.println("\nХарактеристики Егерьей после боя\n");
 
        coyoteTango.setHight(41.34f);
        coyoteTango.setWeight(4250);
        coyoteTango.setSpeed(1);
        coyoteTango.setStrength(2);
        coyoteTango.setArmor(0);
        showJaegerInfo(coyoteTango);

        crimsonTyphoon.setHight(81.34f);
        crimsonTyphoon.setWeight(7150);
        crimsonTyphoon.setSpeed(4);
        crimsonTyphoon.setStrength(4);
        crimsonTyphoon.setArmor(2);
        showJaegerInfo(crimsonTyphoon);
    }

    private static void showJaegerInfo(Jaeger jaeger) {
        System.out.println("Егерь: " + jaeger.getModel());
        System.out.println("Марка: " + jaeger.getMark());
        System.out.println("Высота: " + jaeger.getHight());
        System.out.println("Вес: " + jaeger.getWeight() + " тонн");
        System.out.println("Скорость: " + jaeger.getSpeed());
        System.out.println("Сила: " + jaeger.getStrength());
        System.out.println("Броня: " + jaeger.getArmor());
        System.out.println("Убито кайдзю: " + jaeger.getKaijuKilled() + "\n");
    }
}