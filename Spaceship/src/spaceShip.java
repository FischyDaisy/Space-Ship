import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class spaceShip extends Pane
{
	private ImageView spacey;
	private Line laser;
	private Image spaceship;
	spaceShip()
	{
		spaceship = new Image("spaceship.png");
		spacey = new ImageView(spaceship);
		spacey.setFitHeight(100.0);
		spacey.setFitWidth(100.0);
		spacey.setPreserveRatio(true);
		spacey.setRotate(90);
		this.setOnMouseMoved(this::processMouseMove);
		this.setOnMousePressed(this::processMousePressed);
		this.setOnMouseDragged(this::processMouseDragged);
		this.setOnMouseReleased(this::processMouseReleased);

		this.getChildren().add(spacey);
	}
	public void processMouseMove(MouseEvent e)
	{
		spacey.setX(e.getX() - 50);
		spacey.setY(e.getY() - 50);
	}
	public void processMousePressed(MouseEvent e)
	{
		laser = new Line((e.getX() + 50.0), e.getY(), (e.getX() + 1000), e.getY());
		laser.setStroke(Color.CYAN);
		laser.setStrokeWidth(3);
		this.getChildren().add(laser);
	}
	public void processMouseDragged(MouseEvent e)
	{
		processMouseReleased(e);
		spacey.setX(e.getX() - 50);
		spacey.setY(e.getY() - 50);
		laser = new Line((e.getX() + 50.0), e.getY(), (e.getX() + 1000), e.getY());
		laser.setStroke(Color.CYAN);
		laser.setStrokeWidth(3);
		this.getChildren().add(laser);
	}
	public void processMouseReleased(MouseEvent e)
	{
		this.getChildren().remove(laser);
	}
}
