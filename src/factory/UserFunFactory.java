package factory;

import bean.DisplayContent;
import bean.ModifyContent;
import bean.ModifyPassword;
import bean.UserDisplayContent;
import bean.UserModifyContent;
import bean.UserModifyPassword;

public class UserFunFactory extends AbstractFactory {
	public UserDisplayContent addDisplayContentFun() {
		return new UserDisplayContent();
	}

	public UserModifyPassword addModifyPasswordFun() {
		return new UserModifyPassword();
	}

	@Override
	public DisplayContent createDisplayContent() {
		return new UserDisplayContent();
	}

	@Override
	public ModifyContent createModifyContent() {
		return new UserModifyContent();
	}

	@Override
	public ModifyPassword createModifyPassword() {
		return new UserModifyPassword();
	}
}
