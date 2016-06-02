import org.junit.Assert;

public class TestHelloWorld {

	@org.junit.Test
	public void test1(){
		HelloWorld hw = new HelloWorld();
		hw.setMsg("Hola");
		Assert.assertEquals("Hola", hw.getMsg());
	}

}
