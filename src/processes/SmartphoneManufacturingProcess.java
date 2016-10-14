package processes;


import processes.GeneralManufacturingProcess;

/**
 *
 * @author abbyp
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }
    
    @Override
    protected void assembleDevice() {
        System.out.println("Assembled device...");
    }
    
    @Override
    protected void testDevice() {
        System.out.println("tested device...");
    }
    
    @Override
    protected void packageDevice() {
        System.out.println("packaged device...");
    }
    
    @Override
    protected void storeDevice() {
        System.out.println("stored device...");
    }
}
