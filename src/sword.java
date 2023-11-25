public class sword {
    private String name;
    private int level;
    private double atk;

    public sword(String name){
        this.name = name;
        this.level = 1;
        this.atk = 50;
    }

    public sword(){
        this("Common Sword");
    }

    public void upSwordOneLv(){
        this.level++;
        this.atk = this.atk*(1+0.1*this.level);
        System.out.println("Now " + this.name + "'s levels are " + level);
    }

    public static void checkSwordStatus(sword s){
        System.out.println("-------------------------");
        System.out.println("  " + s.name + "'s status  ");
        System.out.println("Level: " + s.level);
        System.out.println("Attack: " + s.atk);
        System.out.println("-------------------------");
    }

    public static String showSwordName(sword s){
        return s.name;
    }

    public static double showSwordAtk(sword s){
        return s.atk;
    }

    public static int showSwordLv(sword s){
        return s.level;
    }
}
