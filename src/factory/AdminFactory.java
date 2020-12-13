package factory;

import bean.AddUser;
import bean.DeleteUser;

public class AdminFactory{

	public AddUser addAddUserFun() {
		return new AddUser();
	}

	public DeleteUser addDeleteUserFun() {
		return new DeleteUser();
	}
}