public class Matango extends Monster {

    public Matango(char suffix, int hp) {
        super("お化けキノコ", suffix, hp);
    }

    @Override
    public void attack(Creature target) {
        int damage = 6;
        System.out.println(this.getName() + this.getSuffix() + "は体当たり攻撃！" + target.getName() + "に" + damage + "のダメージを与えた！");
        target.setHp(target.getHp() - damage);
    }
}
