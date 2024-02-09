import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list.add(".");
        list.add("..");
        list.add("...");
        list.add(". .");
        list.add(".. ..");
        list.add("... ...");
        list.add(". . .");
        list.add(".. .. ..");
        list.add("... ... ...");
        list.add(". . . .");
        list.add(".. .. .. ..");
        list.add("... ... ... ...");
        list.add(". . . . .");
        list.add(".. .. .. .. ..");
        list.add("... ... ... ... ...");
        list.add(". . . . . .");
        list.add(".. .. .. .. .. ..");
        list.add("... ... ... ... ... ...");
        list.add(". . . . . . .");
        list.add(".. .. .. .. .. .. ..");
        list.add("... ... ... ... ... ... ...");
        list.add(". . . . . . . .");
        list.add(".. .. .. .. .. .. .. ..");
        list.add("... ... ... ... ... ... ... ...");
        list.add(". . . . . . . . .");
        list.add(".. .. .. .. .. .. .. .. ..");

        
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        list2.add("f");
        list2.add("g");
        list2.add("h");
        list2.add("i");
        list2.add("j");
        list2.add("k");
        list2.add("l");
        list2.add("m");
        list2.add("n");
        list2.add("o");
        list2.add("p");
        list2.add("q");
        list2.add("r");
        list2.add("s");
        list2.add("t");
        list2.add("u");
        list2.add("v");
        list2.add("w");
        list2.add("x");
        list2.add("y");
        list2.add("z");

        while (sc.hasNext()) {
            int qtd = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < qtd; i++) {
                String a = sc.nextLine();
                for (int k = 0; k < list.size(); k++) {
                    if(a.equals(list.get(k))){
                        System.out.println(list2.get(k));
                        break;
                    }
                }
            }

        }

        sc.close();

    }
}
