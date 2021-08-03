package com.github.sormuras.hello;

import java.io.PrintWriter;
import java.util.spi.ToolProvider;

public class HelloToolProvider implements ToolProvider {
  @Override
  public String name() {
    return "hello";
  }

  @Override
  public int run(PrintWriter out, PrintWriter err, String... args) {
    String name = args.length == 0 ? System.getProperty("user.name") : String.join(" ", args);
    out.printf("Hello %s!%n", name);
    return 0;
  }
}
