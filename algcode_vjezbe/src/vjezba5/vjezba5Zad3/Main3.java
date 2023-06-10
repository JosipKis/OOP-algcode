package vjezba5Zad3;

import java.util.Stack;

public class Main3 {

    public static void main(String[] args) {
        Stack<String> stog1 = new Stack<>();
        Stack<String> stog2 = new Stack<>();
        stog1.push("1");
        stog1.push("2");
        stog1.push("3");
        stog1.push("4");
        stog1.push("5");
        stog2.push("prvi");
        stog2.push("drugi");
        stog2.push("treći");
        stog2.push("cetvrti");
        stog2.push("peti");
        ChangingStacks.StackOpera(stog1, stog2);
    }
}
