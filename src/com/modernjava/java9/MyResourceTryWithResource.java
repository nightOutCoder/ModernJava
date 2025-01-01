package com.modernjava.java9;

class MyResource implements AutoCloseable {

	public MyResource() {
		System.out.println("Constructor");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Close");
	}
	
	public void use() {
		System.out.println("Resource is being used");
	}
}
public class MyResourceTryWithResource {
	public static void main(String arg[]) {
	
		try(
				MyResource ob1 = new MyResource();
				MyResource ob2 = new MyResource();
			){
			ob1.use();
			ob2.use();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
