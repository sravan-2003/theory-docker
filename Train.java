/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.project.theory;

import java.util.Scanner;

/**
 *
 * @author srava
 */
public class Train extends Main {
    private String trainId;
    private String model;

    public Train(String trainId, String model) {
        this.trainId = trainId;
        this.model = model;
    }

    public String getTrainId() {
        return trainId;
    }

    public String getModel() {
        return model;
    }
}
