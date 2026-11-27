module cl.duoc.proyectodeprueba {
    requires javafx.controls;
    requires javafx.fxml;


    opens cl.duoc.proyectodeprueba to javafx.fxml;
    exports cl.duoc.proyectodeprueba;
}