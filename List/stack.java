import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        // "push" function simply add element in the stack
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Mouse");

        System.out.println("stack" + animals);

        // "peek" function helps to check top element
        System.out.println(animals.peek());

        // "pop" function helps to remove the element
        animals.pop();
        System.out.println("stack" + animals);

        System.out.println(animals.peek());


    }
}