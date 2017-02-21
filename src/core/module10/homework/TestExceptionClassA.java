package core.module10.homework;

public class TestExceptionClassA {
    void f() throws FException{
        try {
            this.g();
        } catch (GException e) {
            throw new FException(e);
        }
    }

    void g() throws GException{
        throw new GException();
    }

}
