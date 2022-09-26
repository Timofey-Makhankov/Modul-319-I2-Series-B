import lib.Input;

public class App {
    public static int inputNumber1;
    public static int inputNumber2;
    public static int inputNumber3;

    public static void main(String[] args) throws Exception {
        inputNumber1 = Input.inputInt("Input first Digit:");
        inputNumber2 = Input.inputInt("Input second Digit:");
        inputNumber3 = Input.inputInt("Input third Digit:");

        for (int i = 0; i < 4; i++) {
            if (inputNumber1 > inputNumber2) {
                Tausche1();
            }else if (inputNumber2 > inputNumber3) {
                Tausche2();
            } else {
                continue;
            }
        }

        System.out.println(inputNumber1 + " ist kleiner als " + inputNumber2 + " ist kleiner als " + inputNumber3 + " 10!");

    }

    static void Tausche1() {
        int temp = inputNumber1;
        inputNumber1 = inputNumber2;
        inputNumber2 = temp;
    }

    static void Tausche2() {
        int temp = inputNumber3;
        inputNumber3 = inputNumber2;
        inputNumber2 = temp;
    }
}
