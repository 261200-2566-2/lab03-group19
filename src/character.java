public class character{
    private int level;
    public String name;
    private double hp,mana,atk,def,spd;
    private static double swordweight, shieldweight;
    private boolean swordok,shieldok;
    private sword sw;
    private shields sh;

    public character(String name){
        this.name = new String(name);
        this.level = 1;
        this.hp = 100;
        this.mana = 50;
        this.atk = 20;
        this.def = 20;
        this.spd = 50;
        this.swordok = false;
        this.shieldok = false;
        this.swordweight = 0;
        this.shieldweight = 0;
    }


    public void checkStatus(){
        System.out.println("-------------------------");
        System.out.println("  " + name + "'s status  ");
        System.out.println("Level: " + level);
        System.out.println("Health: " + hp);
        System.out.println("Mana: " + mana);
        if(swordok == false) System.out.println("Attack: " + atk + " + 0");
        else System.out.println("Attack: " + atk + " + " + sword.showSwordAtk(sw));
        if(shieldok == false) System.out.println("Defense: " + def + " + 0");
        else System.out.println("Defense: " + def + " + " + shields.showShieldDef(sh));
        if(swordok == false && shieldok == false) System.out.println("Speed: " + spd);
        else System.out.println("Speed: " + spd + " - " + (swordweight + shieldweight));
        System.out.println("-------------------------");
        if(swordok == true){
            System.out.println("Sword: " + sword.showSwordName(sw));
        }else{
            System.out.println("Sword: None");
        }
        if(shieldok == true){
            System.out.println("Shield: " + shields.showShieldName(sh));
        }else{
            System.out.println("Shield: None");
        }
        System.out.println("-------------------------");
    }

    public void swordAdd(sword sw){
        if(swordok == false){
            this.sw = sw;
            swordweight = this.spd*(0.1+0.04*sword.showSwordLv(sw));
            swordok = true;
            System.out.println(name + " equips " + sword.showSwordName(sw));
        }else{
            swordDrop();
            this.swordAdd(sw);
        }
    }

    public void shieldAdd(shields sh){
        if(shieldok == false){
            this.sh = sh;
            shieldweight = this.spd*(0.1+0.08*shields.showShieldLv(this.sh));
            shieldok = true;
            System.out.println(name + " equips " + shields.showShieldName(this.sh));
        }else{
            shieldDrop();
            this.shieldAdd(sh);
        }
    }
    public void swordDrop(){
        if(swordok == false){
            System.out.println(name + " doesn't have any sword!");
        }else{
            System.out.println(name + " drops " + sword.showSwordName(this.sw));
            swordweight = 0;
            this.sw = null;
            swordok = false;
        }
    }

    public void shieldDrop(){
        if(shieldok == false){
            System.out.println(name + " doesn't have any shield!");
        }else{
            System.out.println(name + " drops " + shields.showShieldName(this.sh));
            shieldweight = 0;
            this.sh = null;
            shieldok = false;
        }
    }
    public void upCharacterOneLv(){
        this.level++;
        this.hp = 100+10*level;
        this.mana = 50+20*level;
        this.atk = (this.atk)*(1+0.1*level);
        this.def = (this.def)*(1+0.05*level);
        this.spd = (this.spd)*(1+0.1*level);
        System.out.println("Now, "+this.name+"'s levels is " + this.level);
    }

    public void attack(character opp){
        if(opp.hp == 0){
            System.out.println(opp.name + " already has died!");
        }else if(this.hp == 0){
            System.out.println(this.name + " can't fight because of death!");
        }else{
            System.out.println(this.name + " attacks " + opp.name + " !!!");
            double dmg = this.atk - opp.def;
            if (swordok == true) dmg += sword.showSwordAtk(sw);
            if (opp.shieldok == true) dmg -= shields.showShieldDef(opp.sh);
            if (dmg < 0) {
                dmg = 0;
                System.out.println(opp.name + " doesn't hurt !");
            }
            opp.receiveDmg(dmg);
        }
    }
    private void receiveDmg(double dmg){
        this.hp = this.hp - dmg;
        System.out.println(this.name + " receives DMG -" + dmg);
        if(this.hp < 0) this.hp = 0;
        if(this.hp == 0) System.out.println(this.name + " is death...");
    }
}