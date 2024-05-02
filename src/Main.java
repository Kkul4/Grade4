import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number: ");
        int numder = sc.nextInt();

        if (numder<49) {
            System.out.println("grade F"+numder);
        }
        else if (numder>49 && numder<60) {
            System.out.println("grade D"+numder);
        }
//        if (numder<59) {
//            System.out.println("grade D"+numder);
//        }
        else if (numder>59 && numder<70) {
            System.out.println("grade C"+numder);
        }
//        if (numder<69) {
//            System.out.println("grade D"+numder);
//        }
        else if (numder>69 && numder<80) {
            System.out.println("grade B" + numder);
        }
//        if (numder<79) {
//            System.out.println("grade B"+numder);
//        }
        else if (numder>79 && numder<100) {
            System.out.println("grade A"+numder);
        }
    }
}