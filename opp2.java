 class opp {
    String name ;
    String color ;

    public void display(){
        System.out.println(this.name);
        System.out.println(this.color);
    }
    
}
public class opp2{
    public static void main(String[] args) {
        opp o1 = new opp();
        o1.name = "Garv";
        o1.color = "Blue";
        o1.display();

        opp o2 = new opp();
        o2.name = "Ansh";
        o2.color = "Red";
        o2.display();
                       
        
    }
}
