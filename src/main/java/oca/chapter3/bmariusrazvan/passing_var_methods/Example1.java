package passing_var_methods;

class Train {
    public String rank;
    public Integer number;
    public String destination;

    public Train(String rank, Integer number, String destination) {
        this.rank = rank;
        this.number = number;
        this.destination = destination;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Train t = new Train("InterRegio",1538, "București Nord");
        Example1 e = new Example1();
        System.out.println("Trenul " + t.rank + ", numărul " + t.number + ", în direcția " + t.destination + ", va pleca din stație de la linia 3.");
        e.modify(t);
        System.out.println("Trenul " + t.rank + ", numărul " + t.number + ", în direcția " + t.destination + ", va pleca din stație de la linia 3.");
    }

    void modify(Train t) {
        t.number = 12742;
        t.destination = "Satu Mare";
        System.out.println("Noul număr: " + t.number);
    }
}
/*
    Only the original Train object was modified
 */
