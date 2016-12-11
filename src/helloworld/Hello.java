package helloworld;

/***
 * Says Hello
 * @author postopian
 *
 */
public class Hello {
	private static String HELLO = "Hello";
	public String getHello() {
		return HELLO;
	}
	
	public void say() {
		System.out.println(getHello());
	}
}
