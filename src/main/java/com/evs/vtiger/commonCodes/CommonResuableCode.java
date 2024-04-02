package com.evs.vtiger.commonCodes;

import com.evs.vtiger.commonCodesORlayer.CommonReusabledORlayer;
import com.evs.vtiger.utils.KishanWebUtil;

public class CommonResuableCode extends CommonReusabledORlayer{
    private KishanWebUtil kc;
	public CommonResuableCode(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}
	
	public void gotoLoginpage()
	{
	 kc.myclick(getgotoLoginPage());	
	}
	
	public void validLogin(String Username,String Password)
	{    gotoLoginpage();
		kc.mySenkeys(getUserName(), Username);
		kc.mySenkeys(getPassword(), Password);
		kc.myclick(getLoginbutton());
	}
	public void logout()
	{
		kc.myclick(getLogout());
	}
	

}
