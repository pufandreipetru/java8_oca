package oca.chapter6.andrei_puf.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {
    static class Gigel {
        private String name;
        private Integer age;
        private Integer weight;

        public Gigel(String name, Integer age, Integer weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
                this.weight = weight;
        }
    }

    public static void printGigei(List<Gigel> gigei) {
        for (Gigel g: gigei) {
            System.out.println(g.name + " " + g.age + " " + g.weight);
        }

    }

    public static List<Gigel> filter(List<Gigel> gigei, Predicate<Gigel> predicate) {
        List<Gigel> gigeiResultati = new ArrayList<>();
        for (Gigel g : gigei) {
            if (predicate.test(g)) {
                gigeiResultati.add(g);
            }
        }

        return gigeiResultati;
    }

    /**
     * Lambda requirements:
     *
     * The parameter can be a variable name or it can be the type followed by the variable name in parentheses
     * The body must return a boolean
     * The body can be a single expresion which can not have a return statement
     * The body can be a block of valid statements each finished with a semicolon with a mandatory return statement.
     *
     * @param args
     */
    public static void main(String... args) {
        List<Gigel> gigei = new ArrayList<>();
        gigei.add(new Gigel("Gigel1", 20, 50));
        gigei.add(new Gigel("Gigel2", 50, 80));
        gigei.add(new Gigel("Gigel3", 80, 120));
        gigei.add(new Gigel("Gigel4", 10, 70));

        List<Gigel> gigeiRezultati = null;
//        gigeiRezultati = filter(gigei, gigel -> gigel.weight > 10);
//        gigeiRezultati = filter(gigei, (Gigel gigel) -> gigel.weight > 10);
//        gigeiRezultati = filter(gigei, (Gigel gigel) -> {return gigel.weight > 10;});
//        gigeiRezultati = filter(gigei, (Gigel gigel) -> {
//            boolean a = gigel.weight > 10;
//            boolean b = gigel.age > 10;
//        return a && b;});

//        gigeiRezultati = filter(gigei, gigel -> return gigel.weight > 10);
//        gigeiRezultati = filter(gigei, Gigel gigel -> gigel.weight > 10);
//        gigeiRezultati = filter(gigei, (Gigel gigel) -> {gigel.weight > 10;});
//        gigeiRezultati = filter(gigei, gigel -> { boolean a = gigel.weight > 10});



        printGigei(gigeiRezultati);
    }
}
