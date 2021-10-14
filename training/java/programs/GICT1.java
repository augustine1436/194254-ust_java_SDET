package com.ust.test;

public class GICT1 {
	public static void main(String[] args) {

	    GenericsClass<Integer> intObj = new GenericsClass<>(5);
	    System.out.println("Generic returns: " + intObj.getData());
	    GenericsClass<String> stringObj = new GenericsClass<>("Java");
	    System.out.println("Generic returns: " + stringObj.getData());
	  }
	}

	class GenericsClass<T> {

	  private T data;

	  public GenericsClass(T data) {
	    this.data = data;
	  }
	  public T getData() {
	    return this.data;
	  }
	}
