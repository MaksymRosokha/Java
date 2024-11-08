package Player;

public class Player {
    private int HP = 100;
    private int attack = 10;
    private int armor = 3;
    private String name;
    private int bonusHP = 0;
    private int bonusAttack = 0;
    private int bonusArmor = 0;
    private int defaultHP = 100;

    public int getHP() {
        return HP;
    }
    
    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getArmor() {
        return armor;
    }
    
    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    


    public void setBonusHP(int bonusHP) {
        this.bonusHP = bonusHP;
        this.defaultHP += this.bonusHP;
        this.HP = this.defaultHP;
    }

    public void setBonusAttack(int bonusAttack) {
        this.bonusAttack = bonusAttack;
        this.attack += this.bonusAttack;
    }

    public void setBonusArmor(int bonusArmor) {
        this.bonusArmor = bonusArmor;
        this.armor += this.bonusArmor;
    }

    
    public void showPlayerStatus()
    {
        System.out.println("\n- - - ВАШІ ХАРАКТЕРИСТИКИ - - -"
                         + "\n- Життя: " + this.HP
                         + "\n- Защита: " + this.armor
                         + "\n- Атака: 0-" + this.attack
                         + "\n- - - - - - - - - - -");
    }
    
    
    public void AttackBot(Level1.Bot1 Bot)
    {
        System.out.println(this.name + " атакує на " + Bot.getName());
        int attack = (int)(this.attack * Math.random());
        
        if(attack > Bot.getArmor())
        {
            attack = attack - Bot.getArmor();
            Bot.setHP((Bot.getHP() - attack));
            System.out.println(this.name + " атакував з силою " + attack);
        }
        else
        {
            System.out.println(this.name + " атакував з силою " + attack);
            System.out.println("Атака заблокована");
        }
        
        if(Bot.getHP() < 0)
        {
            Bot.setHP(0);
        }
        
        Bot.showBotStatus();
    }
    
    public void AttackBot(Level2.Bot2 Bot)
    {
        System.out.println(this.name + " атакує на " + Bot.getName());
        int attack = (int)(this.attack * Math.random());
        
        if(attack > Bot.getArmor())
        {
            attack = attack - Bot.getArmor();
            Bot.setHP((Bot.getHP() - attack));
            System.out.println(this.name + " атакував з силою " + attack);
        }
        else
        {
            System.out.println(this.name + " атакував з силою " + attack);
            System.out.println("Атака заблокована");
        }
        
        if(Bot.getHP() < 0)
        {
            Bot.setHP(0);
        }
        
        Bot.showBotStatus();
    }
    public void AttackBot(Level3.Bot3 Bot)
    {
        System.out.println(this.name + " атакує на " + Bot.getName());
        int attack = (int)(this.attack * Math.random());
        
        if(attack > Bot.getArmor())
        {
            attack = attack - Bot.getArmor();
            Bot.setHP((Bot.getHP() - attack));
            System.out.println(this.name + " атакував з силою " + attack);
        }
        else
        {
            System.out.println(this.name + " атакував з силою " + attack);
            System.out.println("Атака заблокована");
        }
        
        if(Bot.getHP() < 0)
        {
            Bot.setHP(0);
        }
        
        Bot.showBotStatus();
    }
    public void AttackBot(Level4.Bot4 Bot)
    {
        System.out.println(this.name + " атакує на " + Bot.getName());
        int attack = (int)(this.attack * Math.random());
        
        if(attack > Bot.getArmor())
        {
            attack = attack - Bot.getArmor();
            Bot.setHP((Bot.getHP() - attack));
            System.out.println(this.name + " атакував з силою " + attack);
        }
        else
        {
            System.out.println(this.name + " атакував з силою " + attack);
            System.out.println("Атака заблокована");
        }
        
        if(Bot.getHP() < 0)
        {
            Bot.setHP(0);
        }
        
        Bot.showBotStatus();
    }
    public void AttackBot(Level5.Bot5 Bot)
    {
        System.out.println(this.name + " атакує " + Bot.getName());
        int attack = (int)(this.attack * Math.random());
        
        if(attack > Bot.getArmor())
        {
            attack = attack - Bot.getArmor();
            Bot.setHP((Bot.getHP() - attack));
            System.out.println(this.name + " атакував з силою " + attack);
        }
        else
        {
            System.out.println(this.name + " атакував з силою " + attack);
            System.out.println("Атака заблокована");
        }
        
        if(Bot.getHP() < 0)
        {
            Bot.setHP(0);
        }
        
        Bot.showBotStatus();
    }
    
    public void normalHP(){
        this.HP = this.defaultHP;
    }
    
    public void normalCharacteristics(){
        this.HP = 100;
        this.attack = 10;
        this.armor = 3;
    }
}
