package com.example.demo;

public class ReadWriteExecute {
  public static int symbolicToOctal(String permString) {
    // throw new UnsupportedOperationException("Waiting to be implemented.");
    char[] charString = permString.toCharArray();
    String result = "";
    int col = 0;
    for (int i = 1; i < charString.length + 1; i++) {
      // Ctrl+ Delete for next word delete

      char at = charString[i - 1];
      switch (at) {
        case 'r':
          col = col + 4;
          break;
        case 'w':
          col = col + 2;
          break;
        case 'x':
          col = col + 1;
          break;
        case '-':
          col = col + 0;
          break;

      }
      if (i % 3 == 0) {
        result = result + col;
        col = 0;
      }

    }


    return Integer.parseInt(result);
  }

  public static void main(String[] args) {
    // Should write 752
    System.out.println(ReadWriteExecute.symbolicToOctal("rwxr-x-w-"));
  }
}
