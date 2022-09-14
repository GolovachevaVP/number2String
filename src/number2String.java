import java.util.ArrayList;
import java.util.Objects;

public class number2String {
    public static String getProverka(String s) {
        System.out.print("Строка " + s + " - ");
        int min = s.length();
        int a = 0, b = 0;
        String[] str = s.split("");
        for (int i = 0; i < str.length;i++) {
            switch (str[i]) {
                case (")"):
                    for (int j = 0; j < str.length; j++) {
                        if (str[j].equals("(") && j < i) {
                            a++;
                            continue;
                        }
                        if (str[j].equals(")") ) {
                            b++;
                            continue;
                        }

                        if (i != j && min > i) min = i;
                        break;
                    }
                    if (a == b) {
                        min = s.length();
                        break;
                    } else if (min > i) {
                        min = i+1;
                        break;
                    }
                    break;
                case ("("):




            }

        }
            if (min < s.length()) return "" + (min + 1);
            else return "Success";



    }

    public static void main(String[] args) {
//        System.out.println(getProverka("[]").equals("Success"));
//        System.out.println(getProverka("{}[]").equals("Success"));
//        System.out.println(getProverka("{[]}()").equals("Success"));
//        System.out.println(getProverka("{").equals("1"));
//        System.out.println(getProverka("{[}").equals("3"));
//        System.out.println(getProverka("foo(bar)").equals("Success"));
//        System.out.println(getProverka("foo(bar[i)").equals("10"));
//        System.out.println(getProverka("()[}").equals("4"));
       System.out.println(getProverka("()").equals("Success"));
       System.out.println(getProverka("())").equals("3"));
//        System.out.println(getProverka("(()").equals("1"));
//        System.out.println(getProverka("()[{}").equals("3"));
//        System.out.println(getProverka("(){[}").equals("5"));

        System.out.println(getProverka("(())"));
        System.out.println(getProverka("()()"));
        System.out.println(getProverka("()())))"));
        System.out.println(getProverka("()(()"));

    }
}




