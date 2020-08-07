
public class Ticket {

    public Ticket(int ID,
                  int x1,
                  int y1,
                  int x2,
                  int y2,
                  int speed,
                  int cost ){
        //this.ID = 0;
        this.ID = ID;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        this.speed = speed;
        this.cost  = cost;
    }

    String typeTransport;
    public int x1 = 0;
    public int x2 = 0;

    public int y1 = 0;
    public int y2 = 0;

    public int ID = 0;

    public int speed = 0;
    public int cost = 0;
}