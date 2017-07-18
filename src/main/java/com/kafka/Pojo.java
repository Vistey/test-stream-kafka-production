package com.kafka;

/**
 * 用于从客户端传过来的pojo实体类解析
 */
public class Pojo {

  private String name;
  private int id;

  public Pojo() {
  }

  public Pojo(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Pojo{" +
      "name='" + name + '\'' +
      ", id=" + id +
      '}';
  }
}
