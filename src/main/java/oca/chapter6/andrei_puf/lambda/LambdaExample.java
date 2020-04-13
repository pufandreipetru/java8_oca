package oca.chapter6.andrei_puf.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    static class Gigel {
        private String name;
        private Integer age;

        public Gigel(String name, Integer age) {
            this.name = name;
            this.age = age;
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
    }
    
    public static void main(String... args) {
        List<Gigel> gigei = new ArrayList<>();
        gigei.add(new Gigel("Gigel1", 20));
        gigei.add(new Gigel("Gigel2", 50));
        gigei.add(new Gigel("Gigel3", 80));
        gigei.add(new Gigel("Gigel4", 10));
    }
}
