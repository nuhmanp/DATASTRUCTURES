package com.example.demo.java8;

/*
 * 
 * deault mehtod extension collision
 */

interface Vehicle {
  default void ride() {
    System.out.println("Riding vehicle");
  }
}


interface Bike extends Vehicle {
  default void ride() {
    System.out.println("Riding Bike");
  }
}


interface Car extends Vehicle {
  default void ride() {
    System.out.println("Riding Car");
  }
}


interface Toyota extends Car, Bike {

  @Override
  default void ride() {
    // TODO Auto-generated method stub
    Bike.super.ride();
  }

}


public class DefaultMethodCollision implements Bike, Car {

  public static void main(String[] args) {

    System.out.println("Testing default method collision");
    new DefaultMethodCollision().ride();
  }

  @Override
  public void ride() {
    // TODO Auto-generated method stub
    Car.super.ride();
  }

}
