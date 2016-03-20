/*�ܹ���DAO��������ɾ�Ĳ�Ļ��������Լ����������������ݿ�Ĳ���*/
package cn.edu.zjut.dao;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.zjut.po.Employee;
import cn.edu.zjut.po.Merchant;
import cn.edu.zjut.po.Order;//��ʱ������

public class EmployeeDAO extends BaseHibernateDAO implements IEmployeeDAO{
	private Map<String, Object> request, session;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean register(Employee employee) {//ע��
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		Transaction tran = null;
		Session esession = null; 
		try {
			esession = getSession();
			tran = esession.beginTransaction();
			esession.save(employee);
			tran.commit();
			session.put("employee", employee);
			request.put("tip", "ע��ɹ�");
		} catch (RuntimeException re) {
			if(tran != null) tran.rollback();
			request.put("tip", "ע��ʧ�ܣ���ѧ���ѱ�ʹ��");
			return false;
		} finally {
			getSession().close();
		}
		return true;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean update(Employee employee) {//�ܹ�����Ϣ����
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		Transaction tran = null;
		Session esession = null;
		try {
			esession = getSession();
			tran = esession.beginTransaction();
			esession.update(employee);
			tran.commit();
			request.put("updateTip", "��Ϣ�޸ĳɹ���");
			session.put("employee", employee);
		} catch (RuntimeException re) {
			return false;
		} finally {
			getSession().close();
		}
		return true;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean login(Employee employee) {//��¼
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		String employeeID = employee.getEmployeeID();
		String employeePassword = employee.getEmployeePassword();
		String hql = "from Employee as emp where employeeID='" + employeeID
				+ "' and employeePassword='" + employeePassword + "'";
		try {
			String queryString = hql;
			Query queryObject = getSession().createQuery(queryString);
			List list=queryObject.list();
			if (list.isEmpty()){
				request.put("tip", "�û��������������˶ԣ�");
				return false;
			}
			else{
				employee=(Employee)list.get(0);
				session.put("employee", employee);
				request.put("tip", "��¼�ɹ���");
				
			}
		}catch (RuntimeException re) {
			System.out.println(re);
			return false;
		}
		getSession().close();
		return true;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean findByIDNum(Employee employee){//��֤���֤���Ƿ�ʹ��
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		String employeeIDNum = employee.getEmployeeIDNum();
		String hql = "from Employee as emp where employeeIDNum='" + employeeIDNum+ "'";
		try {
			String queryString = hql;
			Query queryObject = getSession().createQuery(queryString);
			List list=queryObject.list();
			if (!list.isEmpty()){
				request.put("tip", "ע��ʧ�ܣ������֤���ѱ�ʹ��");
				return false;
			}
		}catch (RuntimeException re) {
			System.out.println(re);
			request.put("tip", "ע��ʧ�ܣ������������쳣");
			return false;
		}
		getSession().close();
		return true;
	}

	public List findByHQL(String hql){//����HQL����ѯ
		try {
			String queryString = hql;
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			throw re;
		} finally{
			getSession().close();
		}
	}
	
	public void save(Order order) {
		try {
			getSession().save(order);
		} catch (RuntimeException re) {
			throw re;
		} finally{
			getSession().close();
		}
	}
	
}
