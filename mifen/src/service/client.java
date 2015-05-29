package service;

import control.RiceFlourInfoControl;
import model.RiceFlourInfo;

public class client {

	public static void main(String[] args) {
		
	RiceFlourInfo rice = new RiceFlourInfo("ÂéÀ±ÌÌ",10,20);
	RiceFlourInfoControl.getControl().save(rice);

	}

}
