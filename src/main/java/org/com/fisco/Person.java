package org.com.fisco;

public class Person {
//    // field must be public for rust
//    private String name;
//    private int age;
//
//    @Override
//    public String toString() {
//        return "{" +
//                "name=\"" + name + '\"' +
//                ", age=" + age +
//                '}';
//    }
	
	    // field must be public for rust
	    public String name;
	    public int age;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Person{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }
}