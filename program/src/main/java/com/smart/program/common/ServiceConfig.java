package com.smart.program.common;

public class ServiceConfig {
	
	//小程序appid
	public static final String MINIAPPID = "wxb93764b8ec4b1225";
	//小程序secret
	public static final String MINISECRET = "dbbc4f1a00dff2c9d330b875e3d455b0";
	//微信小程序登录url
	public static final String WX_LOGIN_URL = "https://api.weixin.qq.com/sns/jscode2session";

	//微信支付的商户id  
	public static final String mch_id = "1427393602";  
	//微信支付的商户密钥  
	public static final String key = "8yi4ymjrg8vquhbau0i7f2j0q8m51uyu";  
	//支付成功后的服务器回调url  
	public static final String notify_url = "https://fulishe.shanshizhe.cn/pay/weixin/api/wxNotify";

	//交易类型，小程序支付的固定值为JSAPI  
	public static final String TRADETYPE = "JSAPI";  
	//微信统一下单接口地址  
	public static final String pay_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	
	//企业付款
	public static final String withdrawals_url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";

	public static final String cert_path = "/usr/local/fulishe/cert/apiclient_cert.p12";

}
