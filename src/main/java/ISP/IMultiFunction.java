package ISP;

/*
 * Violations
 * 1. Fat Interfaces.
 * 2. Low cohesion
 * 3. Empty method implementation
 *
 * Solid principles complement each other, and work together in unison, to achieve the common purpose of well
 * designed software.
 * */
public interface IMultiFunction {
    void print();
    void getPrintPoolDetails();
    void scan();
    void scanPhoto();
    void fax();
    void internetFax();
}
