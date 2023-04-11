module FirstJavaFXProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.junit.jupiter.api; //must be added
	
	opens application to javafx.graphics, javafx.fxml;
}
