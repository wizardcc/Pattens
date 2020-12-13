package strategy;

import bean.DisplayContent;
import bean.ModifyContent;
import bean.ModifyPassword;
import factory.AbstractFactory;
import factory.AdminFactory;
import factory.AdminFunFactory;

public class InitFunctionsForAdmin implements InitFunctions {

	public void initFunc(String str) {

		AbstractFactory f = new AdminFunFactory();
		DisplayContent disCont = f.createDisplayContent();
		disCont.displayContent();
		ModifyContent modCont = f.createModifyContent();
		modCont.modifyContent();
		ModifyPassword modPwd = f.createModifyPassword();
		modPwd.modifyPassword();

		AdminFactory afy = new AdminFactory();
		afy.addAddUserFun().addUser();
		afy.addDeleteUserFun().deleteUser();
	}
}
