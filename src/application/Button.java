package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
public class Button {
	@FXML
	private Circle myCircle;
	private double x;
	private double y;
	
	
public void up(ActionEvent e) {
	myCircle.setCenterY(y-=1);
	
}
public void down(ActionEvent e) {
	myCircle.setCenterY(y+=1);
	
}public void left(ActionEvent e) {
	myCircle.setCenterX(x-=1);
	
}public void right(ActionEvent e) {
	myCircle.setCenterX(x+=1);
	
	
}
}
