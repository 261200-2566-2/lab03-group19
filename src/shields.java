public class shields {
    private String name;
    private int level;
    private double def;

    public shields(String name){
        this.name = name;
        this.level = 1;
        this.def = 50;
    }

    public shields(){
        this("common shield");
    }

    public void upShieldOneLv(){
        this.level++;
        this.def = this.def*(1+0.05*level);
        System.out.println("Now " + this.name + "'s levels are " + level);
    }

    public static void checkShieldStatus(shields s){
        System.out.println("-------------------------");
        System.out.println("  " + s.name + "'s status  ");
        System.out.println("Level: " + s.level);
        System.out.println("Defense: " + s.def);
        System.out.println("-------------------------");
    }

    public static String showShieldName(shields s){
        return s.name;
    }

    public static double showShieldDef(shields s){
        return s.def;
    }

    public static int showShieldLv (shields s){
        return s.level;
    }
}
