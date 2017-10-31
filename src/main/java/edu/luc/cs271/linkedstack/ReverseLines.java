package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(String[] args) {
    // DONE read successive input lines until EOF, then print out in reverse order

    LinkedStack<String> newStack = new LinkedStack<String>();

    final Scanner input = new Scanner(System.in);
    String line;

    while ((line = input.nextLine()) != null) {

      newStack.push(line);
    }

    while (!newStack.isEmpty()) {

      System.out.print(newStack.pop());
    }
  }
}
