package com.example.calculator.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

  public long doubleNumber(int id) {
    return 2 * id;
  }

}
