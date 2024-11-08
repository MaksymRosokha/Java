package Level1;

public class Bot1 {
    private int HP = 70;
    private int attack = 7;
    private int armor = 3;
    private String name = "Бот1";

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public String getName() {
        return name;
    }
    
    public void showBotStatus()
    {
        System.out.println("\n- - - ХАРАКТЕРИСТИКИ БОТА "+name+" - - -"
                         + "\n- Життя: " + this.HP
                         + "\n- Защита: " + this.armor
                         + "\n- Атака: 0-" + this.attack
                         + "\n- - - - - - - - - - -");
    }
    
    public void attackPlayer(Player.Player player)
    {
        System.out.println(this.name + " атакує " + player.getName());
        int attack = (int)(this.attack * Math.random());
        
        if(attack > player.getArmor())
        {
            attack -= player.getArmor();
            player.setHP((player.getHP() - attack));
            System.out.println(this.name + " атакував з силою " + attack);
        }
        else
        {
            System.out.println(this.name + " атакував з силою " + attack);
            System.out.println("Атака заблокована");
        }
        
        if(player.getHP() < 0)
        {
            player.setHP(0);
        }
        
        player.showPlayerStatus();
    }
    
    public void normalHP(){
        this.HP = 70;
    }
}
