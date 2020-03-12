package springdemo;

import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle is drawn");
	}

}
