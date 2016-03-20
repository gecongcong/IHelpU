package cn.edu.zjut.service;

import cn.edu.zjut.dao.IOrderDAO;
import cn.edu.zjut.po.Employee;
import cn.edu.zjut.po.Order;

public class OrderUpdateController implements IOrderUpdateController{
	private IOrderDAO orderDAO = null;

	public OrderUpdateController(){
	}
	public IOrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(IOrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	public synchronized boolean accept(Order order,Employee employee){//������ļ
		return orderDAO.accept(order,employee);
	}
	public boolean submit(Order order) { //�ύ����
		order.setIfFinish(true);
		if(orderDAO.update(order)) return true;
		return false;
	}
}
