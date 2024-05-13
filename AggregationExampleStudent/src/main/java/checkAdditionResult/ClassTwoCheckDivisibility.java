package checkAdditionResult;

public class ClassTwoCheckDivisibility extends Class1Addition {

    public String checkDivisibility(int a, int b) {
        int result = super.add(a, b);
        if (result % 10 == 0) {
            return "number is divisible by 10";
        } else {
            return "number is not divisible by 10";
        }
    }

    public static void main(String[] args) {
        ClassTwoCheckDivisibility c2 = new ClassTwoCheckDivisibility();
        String result = c2.checkDivisibility(10, 26);
        System.out.println(result);
    }
}
