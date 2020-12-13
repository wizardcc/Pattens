package factory;

import bean.AdminDisplayContent;
import bean.AdminModifyContent;
import bean.AdminModifyPassword;
import bean.DisplayContent;
import bean.ModifyContent;
import bean.ModifyPassword;

public class AdminFunFactory extends AbstractFactory{

	@Override
	public DisplayContent createDisplayContent() {
		return new AdminDisplayContent();
	}

	@Override
	public ModifyContent createModifyContent() {
		return new AdminModifyContent();
	}

	@Override
	public ModifyPassword createModifyPassword() {
		return new AdminModifyPassword();
	}	
}
