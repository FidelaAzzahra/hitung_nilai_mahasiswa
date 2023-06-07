/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitungnilai;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HitungNilai extends Application {
    private TextField tfNama = new TextField();
    private TextField tfNIM = new TextField();
    private TextField tfNilaiTugas = new TextField();
    private TextField tfNilaiUTS = new TextField();
    private TextField tfNilaiUAS = new TextField();
    private TextField tfNilaiAkhir = new TextField();
    private TextField tfNilaiHuruf = new TextField();
    private Button btHitung = new Button("Hitung");

    @Override
    public void start(Stage primaryStage) {
        // Membuat UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(7);
        gridPane.setVgap(7);
        
        gridPane.add(new Label("Nama"), 0, 0);
        gridPane.add(tfNama, 1, 0);
        gridPane.add(new Label("NIM"), 0, 1);
        gridPane.add(tfNIM, 1, 1);
        gridPane.add(new Label("Nilai Tugas"), 0, 2);
        gridPane.add(tfNilaiTugas, 1, 2);
        gridPane.add(new Label("Nilai UTS"), 0, 3);
        gridPane.add(tfNilaiUTS, 1, 3);
        gridPane.add(new Label("Nilai UAS"), 0, 4);
        gridPane.add(tfNilaiUAS, 1, 4);
        gridPane.add(new Label("Nilai Akhir"), 0, 5);
        gridPane.add(tfNilaiAkhir, 1, 5);
        gridPane.add(new Label("Nilai Huruf"), 0, 6);
        gridPane.add(tfNilaiHuruf, 1, 6);
        gridPane.add(btHitung, 1, 7);

        // Set properti UI
        gridPane.setAlignment(Pos.CENTER);
        tfNama.setAlignment(Pos.BOTTOM_RIGHT);
        tfNIM.setAlignment(Pos.BOTTOM_RIGHT);
        tfNilaiTugas.setAlignment(Pos.BOTTOM_RIGHT);
        tfNilaiUTS.setAlignment(Pos.BOTTOM_RIGHT);
        tfNilaiUAS.setAlignment(Pos.BOTTOM_RIGHT);
        tfNilaiAkhir.setAlignment(Pos.BOTTOM_RIGHT);
        tfNilaiHuruf.setAlignment(Pos.BOTTOM_RIGHT);
        
        tfNilaiAkhir.setEditable(false);
        tfNilaiHuruf.setEditable(false);
        
        GridPane.setHalignment(btHitung, HPos.RIGHT);
        
        // Untuk margin 
        GridPane.setMargin(btHitung, new Insets(17, 0, 5, 0));
        GridPane.setMargin(tfNama, new Insets(0, 0, 5, 13));
        GridPane.setMargin(tfNIM, new Insets(0, 0, 5, 13));
        GridPane.setMargin(tfNilaiTugas, new Insets(0, 0, 5, 13));
        GridPane.setMargin(tfNilaiUTS, new Insets(0, 0, 5, 13));
        GridPane.setMargin(tfNilaiUAS, new Insets(0, 0, 5, 13));
        GridPane.setMargin(tfNilaiAkhir, new Insets(0, 0, 5, 13));
        GridPane.setMargin(tfNilaiHuruf, new Insets(0, 0, 5, 13));
        
        // Mengubah warna latar belakang 
        Color lightGrey = Color.rgb(250, 250, 250);
        BackgroundFill backgroundFill = new BackgroundFill(lightGrey, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        gridPane.setBackground(background);
        
        // Mengatur ketebalan dan warna teks menggunakan JavaFX
        Font boldFont = Font.font("Arial", FontWeight.BOLD, 12);
        tfNilaiAkhir.setFont(boldFont);
        tfNilaiHuruf.setFont(boldFont);
        btHitung.setFont(boldFont);
        btHitung.setStyle("-fx-background-color: blue; -fx-text-fill: white");

        // Process events
        btHitung.setOnAction(e -> hitungNilaiAkhir());

        // Buat scene dan tempatkan dalam stage
        Scene scene = new Scene(gridPane, 355, 390);
        primaryStage.setTitle("Menghitung Nilai");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void hitungNilaiAkhir() {
        // Ambil nilai dari text fields
        double nilaiTugas = Double.parseDouble(tfNilaiTugas.getText());
        double nilaiUTS = Double.parseDouble(tfNilaiUTS.getText());
        double nilaiUAS = Double.parseDouble(tfNilaiUAS.getText());

        // Membuat objek nilai
        Nilai h = new Nilai();
        h.setNilaiTugas(nilaiTugas);
        h.setNilaiUTS(nilaiUTS);
        h.setNilaiUAS(nilaiUAS);

        // Menampilkan hasil perhitungan
        tfNilaiAkhir.setText(String.format("%.2f", h.getNilaiAkhir()));
        tfNilaiHuruf.setText(h.getNilaiHuruf());
    }

    /**
     * @param args the command line arguments
     */
    // fungsi main. Kalo tidak ada ini tidak bisa di run
    public static void main(String[] args) {
        launch(args);
    }
}
