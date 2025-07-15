package allprograms.java8;

import java.util.Optional;

public class Prg21OptionalExample {
    public static void main(String[] args) {
        String input = null;

      Optional<String> op =  Optional.ofNullable(input);
      op.ifPresentOrElse(
              pres -> System.out.println(pres),
              () -> System.out.println("Deafult")
      );

    }
}
