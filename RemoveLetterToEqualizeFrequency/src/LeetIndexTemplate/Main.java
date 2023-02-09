package LeetIndexTemplate;

public class Main {

    public static void main(String[] args) {

        // instantiate object of problem class
        Problem problem = new Problem();

        // sample input
        String testString1F = "aaabbb";
        String testString2T = "aab"; // true!

        // print output to console
        System.out.println(problem.equalFrequency(testString2T));

        // print confirmation program successfully finished to console
        System.out.println("\nMain program done!");
    }
}
