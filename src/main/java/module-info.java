module com.corsec.proyectomongo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.corsec.proyectomongo to javafx.fxml;
    exports com.corsec.proyectomongo;
}