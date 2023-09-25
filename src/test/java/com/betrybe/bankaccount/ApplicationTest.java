package com.betrybe.bankaccount;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.betrybe.bankaccount.Application;

class ApplicationTest {

  @Test
  @DisplayName("6 - Executa o método main com sucesso.")
  public void testMain() {
    testMainOutput("1234", "Número da conta: 001234");
    testMainOutput("12345634", "Número da conta: 345634");
    testMainOutput("561234", "Número da conta: 561234");
    testMainOutput("1234-X", "Número da conta inválido!");
  }
  
  private void testMainOutput(String userInput, String expectedOutput) {
    ByteArrayInputStream consoleInput = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(consoleInput);

    ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(consoleOutput);
    System.setOut(printStream);
    System.setErr(printStream);

    Application.main(null);

    String[] lines = consoleOutput.toString().split(System.lineSeparator());
    String finalOutput = lines[lines.length - 1];
    
    assertEquals(expectedOutput, finalOutput);
  }
}
