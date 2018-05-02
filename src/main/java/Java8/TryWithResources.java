package Java8;

import java.lang.*;
import java.lang.Exception;

public class TryWithResources {

    public static void main(String[] args) {
        try(A a=new A(); C c=new C(); B b=new B()){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class  A implements AutoCloseable{

    public A() {
        System.out.println("A is creating");
    }
    @Override
    public void close() throws Exception {
        throw new Exception();
    }
}

class B implements AutoCloseable{

    public B() throws Exception {
        throw new Exception();
    }
    @Override
    public void close() throws Exception {
        System.out.println("B is closing");
    }
}

class C implements AutoCloseable{

    public C() {
        System.out.println("C is creating");
    }
    @Override
    public void close() throws Exception {
        System.out.println("class C is closing");
    }
}
