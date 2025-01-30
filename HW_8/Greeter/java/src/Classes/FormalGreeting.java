package Classes;

import Interfaces.GreetingStrategy;

// Реализация различных стратегий приветствия (OCP - теперь добавление новых приветствий не требует модификации существующего кода)
public class FormalGreeting implements GreetingStrategy {
  public String greet() {
      return "Good evening, sir.";
  }
}