public class Hero extends Character {
    private String weapon;

    public Hero(String name, int hp, String weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    @Override
    public void attack(Creature target) {
        int damage = 10;
        System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！" + target.getName() + "に" + damage + "のダメージを与えた！");
        target.setHp(target.getHp() - damage);
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}