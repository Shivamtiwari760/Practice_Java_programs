public class MultipleInheritanceExample {
    public static void main(String[] args){
//        D d = new D();
//        d.display();

//        the above one was the example of the multiple inheritance

    }

    static class A{
        void display(){
            System.out.println("this is the class A with 1 method");
        }
    }

    static class B extends A{
        void display(){
            System.out.println("this is the B method entending A");
        }
    }

    static class C extends A{
        void display(){
            System.out.println("this is the class C extending class A");
        }
    }

//        class D extends B,C {
//        D d = new D();
//        d.display(); // now whic method should be invoked so it is confused for this
    }
//    }
//}
