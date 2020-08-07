import java.util.Scanner;

public class Book {

    public String avtor;
    public String name;
    public int yearOut;
    public int CountOfpage;

    public Book(String avtor, String name, int yearOut, int CountOfpage){
        this.avtor = avtor;
        this.name = name;
        this.yearOut = yearOut;
        this.CountOfpage = CountOfpage;
        //this.FavoriteToy = FavoriteToy;

    }

    public Book(){
        this.avtor = "";
        this.name = "";
        this.yearOut = 0001;
        this.CountOfpage = 0;
        //this.FavoriteToy = FavoriteToy;

    }


    public String toString(String name) {

        if(name == this.name){
            return "Book{" +
                    "avtor='" + avtor + '\'' +
                    ", name='" + name + '\'' +
                    ", yearOut=" + yearOut +
                    ", CountOfpage=" + CountOfpage +
                    '}';

        }
        else{
            return "Input other name of book";
        }


    }

    public String ToString() {


            return "Book{" +
                    "avtor='" + avtor + '\'' +
                    ", name='" + name + '\'' +
                    ", yearOut=" + yearOut +
                    ", CountOfpage=" + CountOfpage +
                    '}';


    }

    public void SetAvtor(String avtor){
        this.avtor = avtor;
    }

    public void SetAvtor(){
       System.out.println("Input avtor:");
       Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()){
            this.avtor = sc.nextLine();
        }

    }
    public void SetName(String name){
        this.name = name;
    }

    public void SetYearOut(int yearOut){
        this.yearOut = yearOut;
    }
    public void SetCountOfpage(int CountOfpage){
        this.CountOfpage = CountOfpage;
    }
}
