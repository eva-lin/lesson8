import beepers.Horn;
import beepers.MagicSound;
import engines.EngineV12;

public class Main {
    public static void main(String[] args) {
        Horn horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        MagicSound magicSound = new MagicSound();


        Merc merc = new Merc(magicSound, engineV12);
        System.out.println(merc.beeper.makeSound());
        System.out.println(merc.engine.getSpeed());

        Audi audi = new Audi(horn, engineV12);
        System.out.println(audi.beeper.makeSound());
        System.out.println(audi.engine.getSpeed());

    }
}