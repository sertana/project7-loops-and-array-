package nestedclass;

public class OuterClass {
    InnerClassA innerA = new InnerClassA();

    public void outerMethodA() {
        System.out.println("OuterA MethodA");
        innerA.InnerAMethodA();
        InnerClassB.InnerBMethodA();


    }
    public void outerMethodB() {

        System.out.println("OuterA MethodA");
    }

    public class InnerClassA {

        public void InnerAMethodA(){

            System.out.println("InnerA MethodA");
        }
    public void InnerAMethodB() {
            System.out.println("InnerA MethodB");
        }
    }
    public static class InnerClassB {

        public static void InnerBMethodA(){
            System.out.println("InnerB MethodA");
        }
        public void InnerBMethodB() {
            System.out.println("InnerB MethodB");
        }
    }
}
