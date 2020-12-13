package factory;

import bean.DisplayContent;
import bean.ModifyContent;
import bean.ModifyPassword;

public abstract class AbstractFactory {
	
	public abstract DisplayContent createDisplayContent();
	public abstract ModifyContent createModifyContent();
	public abstract ModifyPassword createModifyPassword();
}
