package service;

import control.RiceFlourInfoControl;
import model.RiceFlourInfo;

public class client {

	public static void main(String[] args) {
		
	RiceFlourInfo rice = new RiceFlourInfo("������",10,20);
	RiceFlourInfoControl.getControl().save(rice);

	}

}
