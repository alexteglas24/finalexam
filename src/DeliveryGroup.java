import java.time.LocalDate;
import java.util.List;

public class DeliveryGroup {
    private String targetLocation;
    private LocalDate deliveryDate;
    private List<Package> packages;

    public DeliveryGroup(String targetLocation, LocalDate deliveryDate, List<Package> packages) {
        this.targetLocation = targetLocation;
        this.deliveryDate = deliveryDate;
        this.packages = packages;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Package> getPackages() {
        return packages;
    }
}