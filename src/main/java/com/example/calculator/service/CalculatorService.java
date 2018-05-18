package com.example.calculator.service;

import com.example.calculator.calculator.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fred Assi
 */
@Service
public class CalculatorService {

  @Autowired
  Calculator calculator;

  public CalculatorService(Calculator calculator){
    this.calculator = calculator;
  }

  public long doubleNumber(int id) {
    return calculator.doubleNumber(id);
  }

}
