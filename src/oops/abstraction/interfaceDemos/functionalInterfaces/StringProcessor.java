package oops.abstraction.interfaceDemos.functionalInterfaces;

//SAM, any no. of SM, DM
@FunctionalInterface
public interface StringProcessor {
    int process(String str);
    //public abstract int process2(String str);
    static void m1(){}
    static void m3(){}
    static void m4(){}
    static void m11(){}
    default void m6(){}
    default void m7(){}
    default void m8(){}

}
