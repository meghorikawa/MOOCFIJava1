
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        else{
            return false;
        }
    }

    public int priceDifference(Apartment compared){
        int priceA = this.squares*this.princePerSquare;
        int priceB = compared.squares*compared.princePerSquare;
        int priceDifference;

        if (priceA > priceB){
            priceDifference= priceA-priceB;
        }
        else{
            priceDifference =priceB-priceA;
        }
        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared){
        int priceA = this.squares*this.princePerSquare;
        int priceB = compared.squares*compared.princePerSquare;
        
        if (priceA > priceB){
            return true;
        }
        else {
            return false;
        }
    }


}
