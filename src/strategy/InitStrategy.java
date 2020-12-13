package strategy;

public class InitStrategy {

	InitFunctions ifuncs;


	public InitFunctions getIfuncs() {
		return ifuncs;
	}


	public void setIfuncs(InitFunctions ifuncs) {
		this.ifuncs = ifuncs;
	}


	public void Init(String str) {
		if(str.equalsIgnoreCase("admin")){
			this.setIfuncs(new InitFunctionsForAdmin());
		}
		else if(str.equalsIgnoreCase("user")){
			this.setIfuncs(new InitFunctionsForUser());
		}		
		this.ifuncs.initFunc(str);
	}
}
