/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WaterTank;

import java.util.ArrayList;

public class ControlRoom {
    private int waterLevel;
    private final ArrayList<WaterLevelObserver>observers=new ArrayList<>();
    
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers.add(waterLevelObserver);
    }
    
    public void removeWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers.remove(waterLevelObserver);
    }
    
    public void setWaterLevel(int waterLevel){
        if (this.waterLevel!=waterLevel) {
            this.waterLevel=waterLevel;
        }
        notifyObservers();
    }

    private void notifyObservers() {
        for (WaterLevelObserver observer : observers) {
            observer.update(waterLevel);
        }
    }
}
