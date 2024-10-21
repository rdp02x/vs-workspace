public class Sample {

    public Sample() {
        int one = 1;
        int two = 2;
        int three = 3;
    
        printNumber(one);
        printNumber(two);
        printNumber(three);
    }

    public void printNumber(int number) {
            
        System.out.println("This is the text before");
        System.out.println(number);
        System.out.println("This is the text after");
        System.out.println();
    }

}
