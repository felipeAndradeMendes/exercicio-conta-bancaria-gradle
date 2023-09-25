package com.betrybe.bankaccount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

  @Test
  @DisplayName("1 - Verifica se o projeto tem o Apache Commons como dependência.")
  public void testIfProjectContainsApacheCommonsDependency() {
    try {
      File gradleConfig = new File("build.gradle");
      try (BufferedReader reader = new BufferedReader(new FileReader(gradleConfig))) {
        boolean isValid = false;
        String line;
        while ((line = reader.readLine()) != null && !isValid) {
          System.out.println(line);
          isValid = line.contains("commons-lang3");
        }
        assertTrue(isValid);
      }
    } catch (Exception error) {
      error.printStackTrace();
      assertFalse(true);
    }
  }

  @Test
  @DisplayName("2 - Verifica se existe o arquivo build.gradle.")
  public void testIfProjectContainsDependyManager() {
    try {
      File gradleConfig = new File("build.gradle");
      assertTrue(gradleConfig.exists());
    } catch (Exception error) {
      assertFalse(true);
    }
  }

}
