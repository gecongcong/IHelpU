/*ÊÜ¹ÍÕßµÇÂ¼Action*/
package cn.edu.zjut.action;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.zjut.po.Employee;
import cn.edu.zjut.service.IEmployeeLoginController;


public class EmployeeLoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private Employee employee;
	private IEmployeeLoginController employeeLoginController;
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void setEmployeeLoginController(
			IEmployeeLoginController employeeRegisterController) {
		this.employeeLoginController = employeeRegisterController;
	}
	
	public String login(){
		if(employeeLoginController.login(employee)){
			return "loginsuccess";
		}
		else{
			return "loginfailed";
		}
	}
}
