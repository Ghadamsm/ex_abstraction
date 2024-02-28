
public class Main {
    public static void main(String[] args) {



//        Q1



        Movie m1 = new Movie("Movie 1" , 100.0 , "mohammad" );
        Movie m2 = new Movie("Movie 2" , 55 , "ghada");


        Book b1 = new Book("Book 1 " , 25 , "anas");
        Book b2 = new Book("Book 2 " , 40 , "majd");


        System.out.println("Movie 1 " + m1.getPrice() + " after discount : " + m1.getDiscount());

        System.out.println("Movie 2 " + m2.getPrice() + " after discount : " + m2.getDiscount());


        System.out.println("Book 1 " + b1.getPrice() + " after discount : " + b1.getDiscount());

        System.out.println("Book 2 " + b2.getPrice() + " after discount : " + b2.getDiscount());






//        Q2



//        MovablePoint m1 = new MovablePoint(10 , 100 , 20 , 40);
//
//        m1.moveUp();
//        m1.moveDown();
//        m1.moveLeft();
//        m1.moveRight();
//
//
//

    }
}