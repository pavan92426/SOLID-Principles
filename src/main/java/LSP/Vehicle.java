package LSP;

/*
* Objects should be replacable with their subtypes without effecting the correctness of the program.
* Inheritance  - IS-A relationship
*       public class Bird {
*            public void fly() {
*              //flyyyy
*             }
*       }
*
*       public Ostrich extends Bird {
*           @Override
*           public void fly() {
*           //unimplemented method - Hypothetical since Ostrich can't fly
*               throw new RuntimeException();
*           }
*       }
*
*  A generic car having method 'Cabinetwidth' extended by RacingCar having two methods one is override cabinetwidth
* and the other is cockpit width. (hypothetical - racing car doesn't have a cabinet)
* */
public abstract class Vehicle {
    public abstract int interiorWidth();
}
