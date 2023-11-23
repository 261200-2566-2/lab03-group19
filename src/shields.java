public class shields {
    int level;
    double def,weight;
    

    shields(int level){
        this.level = level;
        this.def = 1 + (level*0.5);
        this.weight = 1 + (level*0.2);
    }

    shields(){
        this(1);
    }


}
