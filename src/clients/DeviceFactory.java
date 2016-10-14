package clients;

import processes.SmartphoneManufacturingProcess;
import processes.GeneralManufacturingProcess;

/**
 *
 * @author abbyp
 */
public class DeviceFactory {
    
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("iPhone");
        manufacturer.launchProcess();
    }
    
}
