package com.betrybe.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String accountNumber = String.valueOf(literalAccountNumber);
    int accountNumSize = accountNumber.length();

    String accountFormated;
    if (accountNumSize > 6) {
      accountFormated = StringUtils.right(accountNumber, 6);
    } else if (accountNumSize < 6) {
      accountFormated = StringUtils.leftPad(accountNumber, 6, '0');
    } else {
      accountFormated = accountNumber;
    }
    return accountFormated;
  }

}