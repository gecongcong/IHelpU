/* ‹πÕ’ﬂ◊¢≤·Action*/
package cn.edu.zjut.action;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.zjut.po.Employee;
import cn.edu.zjut.service.IEmployeeRegisterController;

public class EmployeeRegisterAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private Employee employee;

	private IEmployeeRegisterController employeeRegisterController = null;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public IEmployeeRegisterController getEmployeeRegisterController() {
		return employeeRegisterController;
	}

	public void setEmployeeRegisterController(IEmployeeRegisterController employeeRegisterController) {
		this.employeeRegisterController = employeeRegisterController;
	}

	public String register() {
		if(employeeRegisterController.register(employee) &&
				employeeRegisterController.uploadidface(employee) &&
				employeeRegisterController.uploadidback(employee)){
			return "registersuccess";
		}
		return "registerfailed";
	}
}