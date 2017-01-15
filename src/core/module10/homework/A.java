package core.module10.homework;

public class A {
    void f() throws FException{
        try {
            this.g();
        } catch (GException e) {
            System.out.println("Cought Task 4 g() exception");
            throw new FException();
        }
    }

    void g() throws GException{
        throw new GException();
    }

}
