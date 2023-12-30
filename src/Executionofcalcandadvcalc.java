public class Executionofcalcandadvcalc {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2,5);
        int r2 = obj.sub(13,6);
        int r3 = obj.multiply(3,9);
        int r4 = obj.division(12,4);
        double r5 = obj.power(4,2);
        System.out.println(r1 + " " + r2);
        System.out.println(r3 + " " + r4 + " " + r5);
    }
}
//IN THIS WE ARE DOING MULTI LEVEL INHERITANCE
//REMEMBER -> JAVA DOES NOT SUPPORTS MULTIPLE INHERITANCE DUE TO PROBLEM OF AMBIGUITY
