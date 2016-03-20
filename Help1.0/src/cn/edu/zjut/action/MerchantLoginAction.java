/*�̼ҵ�¼action*/
package cn.edu.zjut.action;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.zjut.po.Merchant;
import cn.edu.zjut.service.IMerchantLoginController;

public class MerchantLoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Merchant merchant;
	private IMerchantLoginController MerchantLoginController;
	
	public Merchant getMerchant() {
		return merchant;
	}
	
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	
	public void setMerchantLoginController(
			IMerchantLoginController MerchantRegisterController) {
		this.MerchantLoginController = MerchantRegisterController;
	}
	
	public String login(){
		if(MerchantLoginController.login(merchant)){
			return "loginsuccess";
		}
		else{
			return "loginfailed";
		}
	}
	
}
