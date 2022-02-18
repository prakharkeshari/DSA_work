package ProblemOfTheDayGFG;

public class Complement {
    public static void main(String[] args) {
        String s = "101";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }
        }

        String h = "";
        for (int i = 0; i < arr.length; i++) {
            h = h + arr[i];
        }
        System.out.println(h);

        char c = 'a';
        int a = (int)c;
        System.out.println(a);
    }
}
