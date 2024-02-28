public class Movie extends Product{

    String director ;

    Movie(String name, double price , String director) {
        super(name, price);

        this.director = director ;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }



    @Override
    public double getDiscount() {
        return (price * 20 ) /100 ;
    }
}
