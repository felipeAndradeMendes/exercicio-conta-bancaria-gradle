package com.betrybe.bankaccount;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o número da conta:");
    String account = scanner.nextLine();

    if (!StringUtils.isNumeric(account)) {
      System.out.println("Número da conta inválido!");
    } else {
      int accountNumeric = Integer.parseInt(account);
      AccountNumberFormatter account1 = new AccountNumberFormatter();
      String result = account1.formatAccountNumber(accountNumeric);
      System.out.println("Número da conta: " + result);
    }

  }

}
