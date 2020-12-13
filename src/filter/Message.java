package filter;

public class Message {
	private String msg;
	Filter fc;

	public Filter getFc() {
		return fc;
	}

	public void setFc(Filter fc) {
		this.fc = fc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String process() {
		return fc.doFilter(msg);
	}
}
