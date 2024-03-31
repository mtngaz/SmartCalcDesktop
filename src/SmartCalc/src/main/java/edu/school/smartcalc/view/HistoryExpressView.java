package edu.school.smartcalc.view;

import edu.school.smartcalc.enity.MathExpress;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.*;
public class HistoryExpressView {
//    public static void write(String input) {
//        try (FileOutputStream fileOutputStream = new FileOutputStream(HistoryExpressView.class.getResource("/history/history.ser").getFile(), true)) {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(new MathExpress(input));
//            objectOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }

//    public static void historyRead() {
//        Stage primaryStage = new Stage();
//        try (FileInputStream fileInputStream = new FileInputStream("history.ser");
//             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
//            ObservableList<String> longs = FXCollections.observableArrayList();
//            while (true) {
//                try {
//                    MathExpress mathExpress = (MathExpress) objectInputStream.readObject();
//                    longs.add(mathExpress.getExpress());
//                } catch (IOException e) {
//                    break;
//                }
//            }
//            ListView<String> langsListView = new ListView<>(longs);
//            FlowPane flowPane = new FlowPane(langsListView);
//            langsListView.setPrefSize(600, 600);
//            Scene scene = new Scene(flowPane, 600, 600);
//
//            primaryStage.setScene(scene);
//            primaryStage.show();
//
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
}