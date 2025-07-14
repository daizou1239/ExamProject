public class SuperHero extends Hero {

    public SuperHero(Hero hero) {
        // Transfer status from the Hero instance
        super(hero.getName(), hero.getHp(), hero.getWeapon());
    }

    @Override
    public void attack(Creature target) {
        int damage = 25;
        System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！" + target.getName() + "に" + damage + "のダメージを与えた！");
        target.setHp(target.getHp() - damage);
    }
}
