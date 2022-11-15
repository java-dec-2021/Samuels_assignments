public class HumanTest {
    public static void main(String[] args) {
        Humans human1 = new Humans();
        Humans human2 = new Humans();
        human1.attack(human2);
        Wizards wiz1 = new Wizards();
        wiz1.fireball(human1);
        wiz1.heal(human1);
        Ninjas ninja1 = new Ninjas();
        Ninjas ninja2 = new Ninjas();
        ninja1.steal(human2);
        ninja1.escape();
        Samurais sam = new Samurais();
        Samurais sam1 = new Samurais();
        sam.deathBlow(ninja2);
        human1.attack(sam);
        sam.meditate();
        System.out.println(Samurais.howmany());
    }

}