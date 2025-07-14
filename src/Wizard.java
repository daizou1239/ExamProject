public class Wizard extends Character {
    private int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    @Override
    public void attack(Creature target) {
        int damage = 3; // Based on execution log, not the spec's "6"
        int mpCost = 1;
        System.out.println(this.getName() + "は火の玉を放った！" + target.getName() + "に" + damage + "のダメージを与えた！");
        target.setHp(target.getHp() - damage);
        this.setMp(this.getMp() - mpCost);
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}