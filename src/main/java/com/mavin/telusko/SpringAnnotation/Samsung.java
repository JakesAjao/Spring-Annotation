package com.mavin.telusko.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Samsung {
	
	@Autowired
	@Qualifier("snapDragon")
	MobileProcessor cpu;	
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;//118,144
	}

	public void config(){
		System.out.println("Octa Core, 4 gb Ram, 1");
		cpu.process();
	}
	

}
