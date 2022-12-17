public class HumanTester {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        human1.attack(human2);
        Wizard wiz1 = new Wizard();
        wiz1.fireball(human1);
        wiz1.heal(human1);
        Ninja ninja1 = new Ninja();
        Ninja ninja2 = new Ninja();
        ninja1.steal(human2);
        ninja1.escape();
        Samurai sam = new Samurai();
        Samurai sam1 = new Samurai();
        sam.deathBlow(ninja2);
        human1.attack(sam);
        sam.meditate();
        System.out.println(Samurai.howmany());
    }

}