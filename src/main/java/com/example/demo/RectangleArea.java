package com.example.demo;

class Coord {
  int x;
  int y;

  public Coord(int x, int y) {
    this.x = x;
    this.y = y;
  }
}


public class RectangleArea {

  static int overlapArea(Coord c1, Coord c2, Coord c3, Coord c4) {
    int area1 = Math.abs(c1.x - c2.x) * Math.abs(c1.y - c2.y);
    int area2 = Math.abs(c3.x - c4.x) * Math.abs(c3.y - c4.y);

    // length of interesecting part
    // min(c3.x, c4.x)- max(c1.x, c2.x) * min(c3.y, c4.y)- max(c1.y, c2.y)
    int areaOverlap = (Math.min(c3.x, c4.x) - Math.max(c1.x, c2.x))
        * (Math.min(c3.y, c4.y) - Math.max(c1.y, c2.y));

    return (area1 + area2 - areaOverlap);
  }

  public static void main(String[] args) {
    Coord c1 = new Coord(2, 2);
    Coord c2 = new Coord(5, 7);
    Coord c3 = new Coord(3, 4);
    Coord c4 = new Coord(6, 9);

    System.out.println("Area total: " + overlapArea(c1, c2, c3, c4));
  }


}
