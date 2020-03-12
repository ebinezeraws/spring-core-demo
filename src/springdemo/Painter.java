package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Painter {

	@Autowired
	private Shape square;

	/*
	 * public Painter(Shape shape) { this.shape = shape; }
	 */

	public void setSquare(Shape shape) {
		this.square = shape;
	}

	public void paint() {
		square.draw();
	}

}
