package Level2;

public class Bot2 {
    private int HP = 120;
    private int attack = 11;
    private int armor = 4;
    private String name = "Бот2";

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void showBotStatus()
    {
        System.out.println("\n- - - СТАН БОТА "+name+" - - -"
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
        this.HP = 120;
    }
}
