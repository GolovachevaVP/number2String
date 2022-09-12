import java.util.ArrayList;

public class number2String {
    public static void getProverka(String s) {
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
            for (int i = j; i < list2.size(); i++) {
                if ((s.indexOf(element) != -1) & min > s.indexOf(element)) {

                    if (s.indexOf(list2.get(i)) == -1 |
                            (s.indexOf("(") != -1 && s.indexOf(")")==-1)|
                          (s.indexOf("[") != -1 && s.indexOf("]")==-1) |
                            (s.indexOf("{") != -1 && s.indexOf("}")==-1)){
                        min = s.indexOf(element);
                        break;
                    }
                }
                break;
            }
            j++;
        }

        if (min != s.length()) {
            System.out.println((1 + min));
            return;
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
            System.out.println((1 + min));
        else System.out.println("Success");

        //return "END";

    }



    public static void main(String[] args) {
        getProverka("[]");
        getProverka("{}[]");
        getProverka("{[]}()");
        getProverka("{");
        getProverka("{[}");
        getProverka("foo(bar)");
        getProverka("foo(bar[i)");

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


