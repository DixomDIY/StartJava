public class JagerTest {

    public static void main(String[] args) {
        Jager coyoteTango = new Jager();
        coyoteTango.setModel("Coyote Tango");
        coyoteTango.setMark("Mark-1");
        coyoteTango.setHight(85.34f);
        coyoteTango.setWeight(7450);
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);
        coyoteTango.setKaijuKilled(0);
        Jager crimsonTyphoon = new Jager("Crimson Typhoon", "Mark-4", 76.2f, 6122, 9, 8, 6, 0);

        coyoteTango.run();
        crimsonTyphoon.run();

        coyoteTango.killKaiju();
        coyoteTango.killKaiju();
        coyoteTango.killKaiju();
        crimsonTyphoon.killKaiju();
        coyoteTango.killKaiju();
        crimsonTyphoon.killKaiju();
        coyoteTango.killKaiju();
        coyoteTango.killKaiju();
        crimsonTyphoon.killKaiju();
        coyoteTango.killKaiju();
        crimsonTyphoon.killKaiju();

        coyoteTango.showKilledKaiju();
        crimsonTyphoon.showKilledKaiju();
    }
}