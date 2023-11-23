public class sword {
    int level;
    double atk,weight;

    sword(int level){
        this.level = level;
        this.atk = 1 + (level*0.5);
        this.weight = 1 + (level*0.2);
    }

    sword(){
        this(1);
    }

}
