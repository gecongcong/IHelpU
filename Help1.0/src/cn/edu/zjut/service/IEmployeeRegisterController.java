//�ܹ���ע��ӿ���
package cn.edu.zjut.service;

import cn.edu.zjut.po.Employee;

public interface IEmployeeRegisterController {
	public boolean register(Employee employee);//ע��
	public boolean update(Employee employee);//��Ϣ����
	public boolean uploadidface(Employee employee);
	public boolean uploadidback(Employee employee);
}
