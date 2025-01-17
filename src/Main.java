public class Main {
    public static void main(String[] args) {
        Vehicle c4X = VehicleDirector.makeC4X();
        Vehicle bmw3x3 = VehicleDirector.makeBMWX3();

        Vehicle ff91 = new Vehicle.BuilderVehicle("FF 91").addOption(EBuilderVehicle.SEAT_FIVE).addOption(EBuilderVehicle.DOOR_FIVE).build();
        Vehicle ff91v2 = new Vehicle.BuilderVehicle("FF 91 v2").addOption(EBuilderVehicle.SEAT_FIVE).addOption(EBuilderVehicle.DOOR_FIVE).drive().build();
        Vehicle ff91v3 = new Vehicle.BuilderVehicle("FF 91 v3").addOption(EBuilderVehicle.SEAT_FIVE).addOption(EBuilderVehicle.DOOR_FIVE).isAutomatic(true).drive().build();

        System.out.println(c4X.toString());
        System.out.println(bmw3x3.toString());
        System.out.println(ff91.toString());
        System.out.println(ff91v2.toString());
        System.out.println(ff91v3.toString());
    }
}

