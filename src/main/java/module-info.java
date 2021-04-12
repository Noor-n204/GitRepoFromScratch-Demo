module org.openjfx.GitRepoFromScratchDemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.GitRepoFromScratchDemo to javafx.fxml;
    exports org.openjfx.GitRepoFromScratchDemo;
}