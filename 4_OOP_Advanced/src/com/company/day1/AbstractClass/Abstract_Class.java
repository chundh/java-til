package com.company.day1.AbstractClass;

/**
 * 추상 클래스(Abstract Class)
 * - 일부 메소드가 구현되지 않고, 선언만 되어있는 클래스
 *   * 자식 클래스에서 이것을 반드시 구현하게끔 강제하는 것
 *   * 필요한 모든 클래스가 구현될 수 있도록 하여 안정성을 높임
 */

abstract class AbstractFoo{
    int x, y;

    public AbstractFoo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void method(){
        System.out.println("method");
    }
    
    public abstract void absractMethod(); // 선언만 하고 구현하지 않음
    // Virtual method call과 같다.

}

class Foo extends AbstractFoo{

    public Foo(int x, int y) {
        super(x, y);
    }

    @Override
    public void absractMethod() {
        System.out.println("Implemented abstractMethod");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        //AbstractFoo afoo = new AbstractFoo(); // 추상 클래스는 객체 생성이 불가능하다.
        Foo foo = new Foo(1,2);
        foo.absractMethod();

        AbstractFoo afoo = (AbstractFoo) foo;
        afoo.absractMethod();
        // 추상 클래스는 객체 생성은 불가능하지만 구현된 자식 클래스의 객체는 받을 수 있다.
        System.out.println(afoo.x);
        afoo.method();
    }
}
