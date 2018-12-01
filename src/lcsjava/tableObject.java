package lcsjava;

public class tableObject {
	private int data;
	private String jahat;
	
	public tableObject(int data, String jahat) {
		this.data = data;
		this.jahat = jahat;
	}
	
	public tableObject(int data) {
		this.data = data;
		jahat = "zero";
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getJahat() {
		return jahat;
	}
	public void setJahat(String jahat) {
		this.jahat = jahat;
	}
	
}
