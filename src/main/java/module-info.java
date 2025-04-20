module com.example.snake_game_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snake_game_project to javafx.fxml;
    exports com.example.snake_game_project;
}