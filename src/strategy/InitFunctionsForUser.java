package strategy;

import bean.DisplayContent;
import bean.ModifyContent;
import bean.ModifyPassword;
import factory.AbstractFactory;
import factory.UserFunFactory;

public class InitFunctionsForUser implements InitFunctions {

	public void initFunc(String str) {

		AbstractFactory f = new UserFunFactory();
		DisplayContent disCont = f.createDisplayContent();
		disCont.displayContent();
		ModifyContent modCont = f.createModifyContent();
		modCont.modifyContent();
		ModifyPassword modPwd = f.createModifyPassword();
		modPwd.modifyPassword();

	}
}
