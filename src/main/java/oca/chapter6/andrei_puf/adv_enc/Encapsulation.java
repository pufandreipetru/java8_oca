package oca.chapter6.andrei_puf.adv_enc;

import oca.chapter1.finality.Tea;

import java.util.ArrayList;
import java.util.List;

public class Encapsulation {

    static class Team {
        private List<Gigel> gigei;

        public Team() {
            this.gigei = new ArrayList<>();
        }

        public void addGigel(Gigel g) {
            this.gigei.add(g);

        }
        public List<Gigel> getGigei() {
            return gigei;
        }

        public void printTheNamesOfGigei() {
            for (Gigel g: gigei) {
                System.out.println(g.getName());

            }
        }
    }

    static class Gigel {
        private String name;

        public Gigel(String s) {
            this.name = s;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String... args) {
        Team team = new Team();
        team.addGigel(new Gigel("Gigel 1"));
        team.addGigel(new Gigel("Gigel 2"));

        Gigel g = team.getGigei().get(0);
        g.setName("Ionel 1");

        team.printTheNamesOfGigei();


    }
}