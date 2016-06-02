
public class HelloWorld {
	
	private String msg;
	
	public HelloWorld(){
		
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void showMsg(){
		System.out.println(msg);
	}
	
	public static void main(String[] args){
		HelloWorld hw = new HelloWorld();
		hw.setMsg("Hola");
		hw.showMsg();
	}

}
