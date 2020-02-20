package oca.chapter1.defaultquestion;

public interface Interface1 {
    default void action() {
        System.out.println("Action from interface1");
    }

    default void actionSpecificToInterface1() {
        System.out.println("Action specific from interface1");
    }
}
