Этот код нарушает принцип OCP (Open/Closed Principle) из SOLID, так как каждый раз при добавлении нового типа приветствия придется модифицировать метод greet().

public class Greeter {
    private String formality;

    public String greet() {
        switch (this.formality) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}