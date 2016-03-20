/*EmployeeRegisterController.java
 *ʵ���ܹ��ߵĵ�¼����*/
package cn.edu.zjut.service;
import cn.edu.zjut.dao.IEmployeeDAO;
import cn.edu.zjut.po.Employee;

public class EmployeeLoginController implements IEmployeeLoginController{
	private IEmployeeDAO employeeDAO;
	
	public EmployeeLoginController(){//���췽��
	}
	
	public IEmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(IEmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public boolean login(Employee employee) {//�ܹ��ߵ�¼���ɹ�����true��ʧ�ܷ���false
		System.out.println("execute --login()-- method.");
		if(employeeDAO.login(employee)){//�������ݿ��Ƿ��и��ܹ��ߵ���Ϣ
			return true;
		}
		else{
			return false;
		}
	}

}
