

public class Plane implements TransportInterface{

    public int x1 = 0;
    public int x2 = 0;

    public int y1 = 0;
    public int y2 = 0;

    public int cost = 10;

    public Plane(String Name) {
        this.Name = Name;
    }

    /*public void Car(String Name){
        this.Name = Name;

    }*/


    public String getName() {
        return this.Name;
    }

    /*@Override
    public String getName() {
        return null;
    }*/

    @Override
    public void move() {

        if(this.Ticket1 !=null){
            this.x1 = Ticket1.x1;
            this.y1 = Ticket1.y1;

            this.x2 = Ticket1.x2;
            this.y2 = Ticket1.y2;

        }

        this.Place = "(" + this.x2 + ";" + this.y2 + ")";

    }

    Ticket Ticket1 ;
    public String Name = "";
    public String Place = "";

    @Override
    public String toString() {
        return "Plane{" +
                "Ticket1=" + Ticket1.ID +
                ", Speed=" + Ticket1.speed +
                ", Cost=" + Ticket1.cost +
                ", Name='" + Name + '\'' +
                ", Place='" + Place + '\'' +
                ", Square='" + this.Square() + '\'' +
                ", Cost of trip='" + ((int)this.Square() * this.cost) + '\'' +
                '}';
    }

    public int Square(){
        //int S = 0;

        int S = Math.abs((int) ( (this.x2 - this.x1) * (this.y2 - this.y1) * 0.5));



        return S;


    }
}


