package com.bitwhys.codingProblems.stringsNumbersAndMath;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class StringsNumbersAndMath {

  public static void main(String[] args) {
    Map<Character, Integer> characterIntegerMap = countDuplicateCharacters("George");
    System.out.println(characterIntegerMap.toString());
  }

  public static Map<Character, Integer> countDuplicateCharacters(@NotNull String str) {
    Map<Character, Integer> occurrences = new HashMap<>();
    for (char ch : str.toCharArray()) {
      occurrences.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
    }
    return occurrences;
  }
}
