module gestorPartidosRugby {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports us.com.alberto.models;
    exports us.com.alberto.views;

    opens us.com.alberto.views to javafx.fxml;
}