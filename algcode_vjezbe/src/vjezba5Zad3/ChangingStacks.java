package vjezba5Zad3;

import java.util.Stack;

public class ChangingStacks {

    public static Stackss StackOpera(Stack<String> stog1, Stack<String> stog2) {
        System.out.println("Stog1 at the start: "+ stog1);
        System.out.println("Stog2 at the end: "+ stog2);
        Stack<String> s1Clone = new Stack<>();
        for (String element: stog2) {
            s1Clone.push(element);
        }
        stog2.clear();
        while (!stog1.isEmpty()) {
            stog2.push(stog1.pop());
        }
        System.out.println("Stog1 at the start: "+ s1Clone);
        System.out.println("Stog2 at the end: "+ stog2);

        return new Stackss(s1Clone, stog2);
    }
}
