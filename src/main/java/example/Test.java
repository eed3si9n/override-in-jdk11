package example;

import akka.actor.ActorSystem;

public class Test {
  public static void foo() {
    ActorSystem a = ActorSystem.apply();
    TestKitExtension.get(a);
  }
}
