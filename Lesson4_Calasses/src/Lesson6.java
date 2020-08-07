import java.io.IOException;
import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args){

        Car car1 = new Car("Car");

        //Car1.Name = "Car";
        car1.Ticket1 = new Ticket(45, 10,15,20,25, 120, 2 );
        car1.move();
        System.out.println(car1.toString());

        Ship Ship1 = new Ship("Ship");

        Ship1.Ticket1 = new Ticket(1205, 10,15,20,25, 70, 3);
        Ship1.move();
        System.out.println(Ship1.toString());

        Train Train1 = new Train("Train");
        Train1.Ticket1 = new Ticket(00010, 10,15,20,25, 100, 1);
        Train1.move();
        System.out.println(Train1.toString());

        Plane Plane1 = new Plane("Plane");
        Plane1.Ticket1 = new Ticket(73, 10,15,20,25, 1500, 10);
        Plane1.move();
        System.out.println(Plane1.toString());


        int symbol;
        /*//try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        int i;
        byte[] Ar = new byte[128];
        Scanner sc = new Scanner(System.in);
        try {
            i = sc.nextInt();
            byte n = Ar[i];
            //int n = i/0;
            System.out.println("All right!");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            System.out.println("Input negative number! " );
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End Exception!");
        }




    }

}
