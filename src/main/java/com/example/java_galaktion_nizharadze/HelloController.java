package com.example.java_galaktion_nizharadze;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML

    private Pane pane;

    private TextField textFieldLocation;
    private TextField textFieldDestination;
    private DatePicker datePickerDate;
    private int textFieldSits;
    private int textFieldPrice;
    private TableView<Flight> tableView;


    public HelloController() {

    }

    public void setTextFieldLocation(TextField textFieldLocation) {
        this.textFieldLocation = textFieldLocation;
    }

    public void setTextFieldDestination(TextField  textFieldDestination) {
        this.textFieldDestination = textFieldDestination;
    }

    public void setDatePickerDate(DatePicker datePickerDate) {
        this.datePickerDate = datePickerDate;
    }

    public String getTextFieldLocation() {
        return textFieldLocation.getText();
    }

    public String getTextFieldDestination() {
        return textFieldDestination.getText();
    }

    public DatePicker getDatePickerDate() {
        return datePickerDate;
    }

    public int getTextFieldSits() {
        return textFieldSits;
    }

    public int getTextFieldPrice() {
        return textFieldPrice;
    }

    public void setTextFieldSits(int textFieldSits) {
        this.textFieldSits = textFieldSits;
    }

    public void setTextFieldPrice(int textFieldPrice) {
        this.textFieldPrice = textFieldPrice;
    }

//    @FXML
//    protected void onAddButtonClick() {
//
//        setTextFieldLocation(textFieldLocation);
//        setTextFieldDestination(textFieldDestination);
//        setDatePickerDate(datePickerDate);
//        setTextFieldSits(textFieldSits);
//        setTextFieldPrice(textFieldPrice);
//
//        Flight flight = new Flight(getTextFieldLocation().toString(),getTextFieldDestination().toString(),getDatePickerDate(),getTextFieldSits(),getTextFieldPrice());
//
//        tableView.getItems().add(flight);
//    }
}