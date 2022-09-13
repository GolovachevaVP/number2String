import java.util.ArrayList;

public class number2String {
    public static String getProverka(String s) {
        System.out.print("Строка "+s+" - ");
        int min = s.length();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(")");
        list1.add("]");
        list1.add("}");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("(");
        list2.add("[");
        list2.add("{");

        int j = 0;

        for (String element : list1) {
           // for (int i = j; i < list2.size();) {
                if ((s.contains(element)) & min > s.indexOf(element)) {

                    if (!s.contains(list2.get(j)) |
                            (s.contains("(") && !s.contains(")"))|
                          (s.contains("[") && !s.contains("]")) |
                            (s.contains("{") && !s.contains("}"))){
                        min = s.indexOf(element);

                    }
                }

           // }
            j++;
        }

        if (min != s.length()) {
            return ""+(1+min);
        }



        min = s.length();
        j = 0;

        for (String element : list2) {
            for (int i = j; i < list1.size(); i++) {
                if ((s.indexOf(element) != -1) & min > s.indexOf(element)) {

                    if ((s.indexOf(list1.get(i)) == -1)|
                    (s.indexOf(")") != -1 && s.indexOf("(")==-1)|
                            (s.indexOf("]") != -1 && s.indexOf("[")==-1) |
                            (s.indexOf("}") != -1 && s.indexOf("{")==-1)) {
                        min = s.indexOf(element);
                        break;
                    }
                }
                break;
            }
            j++;
        }
        if (min != s.length())
           return ""+(1 + min);
        else return "Success";



    }



    public static void main(String[] args) {
        System.out.println(getProverka("[]").equals("Success"));
         System.out.println(getProverka("{}[]").equals("Success"));
         System.out.println(getProverka("{[]}()").equals("Success"));
         System.out.println(getProverka("{").equals("1"));
         System.out.println(getProverka("{[}").equals("3"));
         System.out.println(getProverka("foo(bar)").equals("Success"));
         System.out.println(getProverka("foo(bar[i)").equals("10"));
         System.out.println(getProverka("()[}").equals("4"));
         System.out.println(getProverka("()").equals("Success"));
         System.out.println(getProverka("())").equals("3"));


    }
}









//        if ((s.indexOf(']') != -1) & min>s.indexOf(']')){
//            if (s.indexOf('[')==-1) {
//                //System.out.println("Нет открывающей скобки для скобки с индексом " + (1 + s.indexOf(']')));
//                min =s.indexOf(']');
//            }
//        }
//
//        if ((s.indexOf(')') != -1)  & min>s.indexOf(')')){
//            if (s.indexOf('(')==-1)
//                min =s.indexOf(')');
//            // System.out.println("Нет открывающей скобки для скобки с индексом "+ (1+s.indexOf(')')));
//        }
//
//        if ((s.indexOf('}') != -1) & min>s.indexOf('}')){
//            if (s.indexOf('{')==-1)
//                min =s.indexOf('}');
//            //System.out.println("Нет открывающей скобки для скобки с индексом "+ (1+s.indexOf('}')));
//        }
//
//        if (s.indexOf('[') != -1 & min>s.indexOf('[')){
//            if (s.indexOf(']')==-1)
//                min =s.indexOf('[');
//                //System.out.println("Нет закрывающей скобки для скобки с индексом "+ (1+s.indexOf('[')));
//        }
//
//        if (s.indexOf('(') != -1 & min>s.indexOf('(')){
//            if (s.indexOf(')')==-1)
//                min =s.indexOf('(');
//               // System.out.println("Нет закрывающей скобки для скобки с индексом "+ (1+s.indexOf('(')));
//        }
//        if (s.indexOf('{') != -1 & min>s.indexOf('{')){
//            if (s.indexOf('}')==-1)
//                min =s.indexOf('{');
//                //System.out.println("Нет закрывающей скобки для скобки с индексом "+ (1+s.indexOf('{')));
//        }

//        if(min!=s.length())
//            System.out.println("Нет открывающей/закрывающей скобки для скобки с индексом "+ (1+min));
//        else System.out.println("Success");
//


