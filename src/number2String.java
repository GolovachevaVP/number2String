import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class number2String {
    public static String getProverka(String s) {
        System.out.print("Строка " + s + " - ");
        List<String> openList = new ArrayList<>();
        String[] str = s.split("");
        for (String element : str) {
            if (isOpen(element)) openList.add(element);
            if (isClosed(element)) {
                String closedBracket = openList.get(openList.size());
                getOpenBracket(element).equals(closedBracket);
            }
        }

    }

    public static boolean isOpen(String element) {
        return element.equals("(") || element.equals("[") || element.equals("{");
    }

    public static boolean isClosed(String element) {
        return element.equals(")") || element.equals("]") || element.equals("}");
    }

    public static String getOpenBracket(String element) {
        if (element.equals(")")) return "(";
        if (element.equals("]")) return "[";
        if (element.equals("}")) return "{";
        return "";
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
        System.out.println(getProverka("(){[}").equals("5"));

        System.out.println(getProverka("(())"));
        System.out.println(getProverka("()()"));
        System.out.println(getProverka("()())))"));
        System.out.println(getProverka("()(()"));

    }
}




