package inheritance;

public class doings {
    String name;
    doings (String name){
        this.name = name;
    }
    void kdrama(){
        System.out.println(name +" is good at kdramas");
    }
    void games(){
        System.out.println(name +" loves to play games");
    }
    void onepiece(){
        System.out.println(name + " love to watch one piece");
    }
}