package com.bitwhys.codingProblems.stringsNumbersAndMath;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class StringsNumbersAndMath {

  public static void main(String[] args) {
    Map<Character, Integer> characterIntegerMap = countDuplicateCharacters("George");
    System.out.println(characterIntegerMap.toString());
  }

  public static Map<Character, Integer> countDuplicateCharacters(@NotNull String str) {
    /*
     * TODO: Write a program that counts duplicate characters from a given string
     */
    Map<Character, Integer> characterOccurrenceMap = new HashMap<Character, Integer>();
    for (int index = 0; index < str.length(); ++index) {
      Character currentCharacter = str.charAt(index);
      if (!characterOccurrenceMap.containsKey(currentCharacter)) {
        characterOccurrenceMap.put(currentCharacter, 1);
      } else {
        Integer characterCount = characterOccurrenceMap.get(currentCharacter);
        characterOccurrenceMap.put(currentCharacter,++characterCount);
      }
    }
    return characterOccurrenceMap;
  }
}
