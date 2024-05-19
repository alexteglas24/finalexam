public class DeliveryTask implements Runnable {
    private DeliveryGroup group;

    public DeliveryTask(DeliveryGroup group) {
        this.group = group;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(group.getPackages().get(0).getTargetDistance() * 1000);
            System.out.println("[Delivering for " + group.getTargetLocation() + " and date " + group.getDeliveryDate() + " in " + group.getPackages().get(0).getTargetDistance() + " seconds]");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}