import java.time.LocalDate;

public class Package {
    private String targetLocation;
    private int targetDistance;
    private int packageValue;
    private LocalDate deliveryDate;

    public Package(String targetLocation, int targetDistance, int packageValue, LocalDate deliveryDate) {
        this.targetLocation = targetLocation;
        this.targetDistance = targetDistance;
        this.packageValue = packageValue;
        this.deliveryDate = deliveryDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public int getTargetDistance() {
        return targetDistance;
    }

    public int getPackageValue() {
        return packageValue;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}