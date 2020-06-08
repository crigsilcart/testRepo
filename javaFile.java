// Create a commit on the feature2 branch. Add the string "feature 2 wip" to fileA.txt .
// The commit message should be "add feature 2 wip".
// 3. Create another commit on the feature2 branch. In fileA.txt , change the line "feature
// 2 wip" to "feature 2". The commit message should be "add feature 2".


public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}