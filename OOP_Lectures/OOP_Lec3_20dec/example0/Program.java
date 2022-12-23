package OOP_Lectures.OOP_Lec3_20dec.example0;

public class Program {
    public static void main(String[] args) {

        Foo foo1 = new Foo() { // правой кнопкой выбрать anonymous Inner....

            @Override
            public void metode1() {
                System.out.println("metode1");

            }

            @Override
            public void metode2() {
                System.out.println("metode2");

            }

        };

        foo1.metode1();
        foo1.metode2();

        Foo foo2 = new Foo() {

            @Override
            public void metode1() {
                System.out.println("<<<<<metode1>>>>>");

            }

            @Override
            public void metode2() {
                System.out.println(">>>>>>metode2<<<<<<");
                
            }

        };

        foo2.metode1();
        foo2.metode2();

    }

}
