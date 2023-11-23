public class character {
    private int level;
    private String name;
    private double hp,mana,atk,def,weight;
   

    character(String name,int level){
        this.name = new String(name);
        this.level = level;
        this.hp = 100 + this.level;
        this.mana = 100 + this.level;
        this.atk = 20 + this.level;
        this.def = 20 + this.level;
        this.weight = 50 + (this.level*0.5);
    }

    character(String name){
       this(name, 1);
    }

    public void checkStatus(character a){
       System.out.println("-------------------------");
       System.out.println("  " + a.name + "'s status  ");
       System.out.println("Level: " + a.level);
       System.out.println("Health: " + a.hp);
       System.out.println("Mana: " + a.mana);
       System.out.println("Attack: " + a.atk);
       System.out.println("Defense: " + a.def);
       System.out.println("Weight: " + a.weight);
       System.out.println("-------------------------");
    }
    public void upCharacterLv(int level){
       this.level += level;
        this.hp = 100 + this.level;
        this.mana = 100 + this.level;
        this.atk = 20 + this.level;
        this.def = 20 + this.level;
        this.weight = 50 + (this.level*0.5);
       

       System.out.println("Now,"+this.name+"'s levels is " + this.level);
    }
}
