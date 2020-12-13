package bean;
import filter.Filter;
import filter.Message;
public class AdminDisplayContent extends DisplayContent {

	String str = "Administrator display content!";
	Message mp = new Message();

	public void displayContent(){
		Filter fc = new Filter();
		Filter fc2 = new Filter();
		fc.addFilter(fc2);
		mp.setFc(fc);
		mp.setMsg(str);
		String result = mp.process();
		System.out.println("---------Data!----------");
		System.out.println(result);
	}
}
