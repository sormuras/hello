module com.github.sormuras.hello {
  provides java.util.spi.ToolProvider with
      com.github.sormuras.hello.HelloToolProvider;
}
