class Apes {
    private String status;
    public Apes(String status) {
        this.status = status;
    }
    public void speak() {
        System.out.println("祖先说：咿咿呀呀......");
    }
}

class People extends Apes {
    public People(String name) {
        super("人类");
    }
    public void speak() {
        System.out.println("人类说：好样的，不错嘛!");
    }
    public void think() {
        System.out.println("别说话!认真思考!");
    }
}

public class E {
    public static void main(String[] args) {
        Apes apes = new Apes("猿人");
        apes.speak();
        People people = new People("张三");
        people.speak();
        people.think();
    }
}
