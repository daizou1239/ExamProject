public class Goblin extends Monster {

    public Goblin(char suffix, int hp) {
        super("ゴブリン", suffix, hp);
    }

    @Override
    public void attack(Creature target) {
        int damage = 8;
        System.out.println(this.getName() + this.getSuffix() + "はナイフで切りつけた！" + target.getName() + "に" + damage + "のダメージを与えた！");
        target.setHp(target.getHp() - damage);
    }
}