package overloadingConcept;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
//        rect.depth=0;
//        rect.width=0;
//        rect.height=0;
        System.out.println("Line1");

        Rectangle rect2=new Rectangle(10.2,20.1,10);
        System.out.println("next line");


    }
}
