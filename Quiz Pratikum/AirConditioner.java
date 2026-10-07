public class AirConditioner {

    private String brand;
    private int productionYear;
    private Compressor main_compressor;
    private Remote main_remote;

    public AirConditioner(String brand, int productionYear,
                          Compressor main_compressor, Remote main_remote) {
        this.brand = brand;
        this.productionYear = productionYear;
        this.main_compressor = main_compressor;
        this.remote = main_remote;
    }

    public String getBrand() {
        return brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Compressor getCompressor() {
        return main_compressor;
    }

    public Remote getRemote() {
        return main_remote;
    }
}