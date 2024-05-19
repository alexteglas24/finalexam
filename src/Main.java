import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Package> packages = Files.lines(Paths.get("data.txt"))
                .map(line -> line.split(","))
                .map(parts -> new Package(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), LocalDate.parse(parts[3])))
                .collect(Collectors.toList());

        Map<String, List<Package>> groupedPackages = packages.stream()
                .collect(Collectors.groupingBy(p -> p.getTargetLocation() + p.getDeliveryDate()));

        List<DeliveryGroup> deliveryGroups = new ArrayList<>();
        for (Map.Entry<String, List<Package>> entry : groupedPackages.entrySet()) {
            deliveryGroups.add(new DeliveryGroup(entry.getValue().get(0).getTargetLocation(), entry.getValue().get(0).getDeliveryDate(), entry.getValue()));
        }

        for (DeliveryGroup group : deliveryGroups) {
            new Thread(new DeliveryTask(group)).start();
        }
    }
}