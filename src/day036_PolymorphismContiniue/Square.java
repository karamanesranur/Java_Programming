package Java_Programming_Muhtar.day036_PolymorphismContiniue;

public class Square {

    private  double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)){
            System.err.println("Invalid obj");
            System.exit(1);
        }
        if ( side == ( ( (Square) obj).side)  ){
            return true;
        }
        return  false;
    }
}
