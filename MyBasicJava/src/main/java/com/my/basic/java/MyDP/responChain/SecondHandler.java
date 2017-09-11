package com.my.basic.java.MyDP.responChain;

public class SecondHandler extends AbstractHandler {

	@Override
	public void handlerRequest() {
		System.out.println("第二个在处理！");
		if(this.nextHandler!=null){
			this.nextHandler.handlerRequest();
		}else{
			return ;
		}
	}

}
