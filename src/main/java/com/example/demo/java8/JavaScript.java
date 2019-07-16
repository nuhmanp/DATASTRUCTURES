package com.example.demo.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 * Calling javascript from java using Nashorn Javascript
 * 
 */

public class JavaScript {

  public static void main(String[] args) {
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

    String name = "Tester";
    Integer result = null;

    LocalDateTime currentTime = LocalDateTime.now();
    System.out.println("Current DateTime: " + currentTime);
    System.out.println(currentTime.toLocalTime());

    LocalDate date1 = currentTime.toLocalDate();
    System.out.println("date1: " + date1);

    try {
      nashorn.eval("print('" + name + "')");
      result = (Integer) nashorn.eval("10+2");
      // TimeUnit.MILLISECONDS.s
    } catch (ScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    OffsetDateTime dateTime = OffsetDateTime.now();
    System.out.println(dateTime);

    List<String> users = Arrays.asList("Jack", "Jill", "Ram");
    users.stream().forEach((names) -> {
      showSupplier(() -> names);
    });

    Function<String, Integer> length = (s) -> s.length();



  }

  public static void showSupplier(Supplier<String> name) {
    System.out.println(name.get());
  }

}
