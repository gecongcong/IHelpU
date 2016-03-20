/*�ܹ���ע��Service*/
package cn.edu.zjut.service;
import java.io.*;
import java.util.Calendar;

import org.apache.struts2.ServletActionContext;

import cn.edu.zjut.po.Employee;
import cn.edu.zjut.dao.IEmployeeDAO;

public class EmployeeRegisterController implements IEmployeeRegisterController {
	private IEmployeeDAO employeeDAO = null;

	public EmployeeRegisterController(){
	}
	public void setEmployeeDAO(IEmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	public boolean register(Employee employee) { //ע��
		//��������
		int age;
		Calendar c = Calendar.getInstance();  //��ǰʱ��
		String birth=employee.getEmployeeIDNum().substring(6, 14);
		int birthyear=Integer.parseInt(birth.substring(0, 4));
		int nowyear=c.get(Calendar.YEAR);
		int birthmonth=Integer.parseInt(birth.substring(4, 6));
		int nowmonth=c.get(Calendar.MONTH);
		int birthdate=Integer.parseInt(birth.substring(6,8));
		int nowdate=c.get(Calendar.DATE);
		if(birthmonth>nowmonth){age=nowyear-birthyear;}
		else if(birthdate>nowdate){age=nowyear-birthyear;}
		else {age=nowyear-birthyear+1;}
		employee.setEmployeeAge(age);             //��������
		
		employee.setEmployeeIMG("Employee/EmployeeIMG/"+employee.getEmployeeID()+"/head.jpg");   //����ͷ��·��

		if(!employeeDAO.findByIDNum(employee)) return false;    //��֤���֤���Ƿ�ʹ�ù�
		if(employeeDAO.register(employee))
			return true;
		else return false;
	}

	public boolean uploadidface(Employee employee) {             //���֤������Ƭ
		File pic =employee.getFace();
		String path=ServletActionContext.getServletContext().getRealPath("/");
		try {
			System.out.println(pic);
			InputStream in = new FileInputStream(pic);
			String dir = path+"Employee/EmployeeIMG/" + employee.getEmployeeID() +"/";
			File fileLocation = new File(dir);
			if (!fileLocation.exists()) fileLocation.mkdirs();
			String fileName = "face.jpg";
			File uploadFile = new File(dir, fileName);
			OutputStream out = new FileOutputStream(uploadFile);
			byte[] buffer = new byte[1024 * 1024];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("upload face failed");
			return false;
		}
	}
	public boolean uploadidback(Employee employee) {        //���֤������Ƭ
		File pic = employee.getBack();
		String path=ServletActionContext.getServletContext().getRealPath("/");
		try {
			System.out.println(pic);
			InputStream in = new FileInputStream(pic);
			String dir = path +"Employee/EmployeeIMG/"+employee.getEmployeeID()+"/";
			try
			{File fileLocation = new File(dir);
			if (!fileLocation.exists()) fileLocation.mkdirs();
			}catch(Exception e){
				e.printStackTrace();
			}
			String fileName = "back.jpg";
			File uploadFile = new File(dir, fileName);
			OutputStream out = new FileOutputStream(uploadFile);
			byte[] buffer = new byte[1024 * 1024];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("upload back failed");
			return false;
		}
	}

	public boolean update(Employee employee){
		if(employeeDAO.update(employee))
			return true;
		else return false;
	}
}
