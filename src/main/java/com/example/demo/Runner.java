package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Runner {
  private HashMap<Integer, Resource> resources = new HashMap<Integer, Resource>();

  public Iterable<Resource> getResources() {
    return this.resources.values();
  }

  public Resource acquireResource(int id) {
    Resource w = this.resources.getOrDefault(id, null);
    if (w == null) {
      w = new Resource(id);
      this.resources.put(id, w);
    }

    return w;
  }

  public void releaseResource(int id) {
    Resource w = this.resources.getOrDefault(id, null);
    if (w == null)
      throw new IllegalArgumentException();

    w.dispose();
  }

  public class Resource {
    private ArrayList<StringBuilder> tasks = new ArrayList<StringBuilder>();

    private int id;

    public int getId() {
      return this.id;
    }

    public Iterable<StringBuilder> getTasks() {
      return this.tasks;
    }

    public Resource(int id) {
      this.id = id;
    }

    public void performTask(StringBuilder task) {
      if (this.tasks == null)
        throw new IllegalStateException(this.getClass().getName());

      this.tasks.add(task);
    }

    public void dispose() {
      this.tasks = null;
    }
  }

  public static void main(String[] args) {
    Runner d = new Runner();

    d.acquireResource(1).performTask(new StringBuilder("Task11"));
    d.acquireResource(2).performTask(new StringBuilder("Task21"));
    System.out.println(String.join(", ", d.acquireResource(2).getTasks()));
    d.releaseResource(2);
    d.acquireResource(1).performTask(new StringBuilder("Task12"));
    System.out.println(String.join(", ", d.acquireResource(1).getTasks()));
    d.releaseResource(1);
  }
}
