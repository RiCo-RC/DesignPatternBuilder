public class Main {
    public static void main(String[] args) {
        Vehicle c4X = VehicleDirector.makeC4X();
        Vehicle bmw3x3 = VehicleDirector.makeBMWX3();

        Vehicle ff91 = new Vehicle.BuilderVehicle("FF 91").addOption(EBuilderVehicle.SEAT_FIVE).addOption(EBuilderVehicle.DOOR_FIVE).build();

        System.out.println(c4X.toString());
        System.out.println(bmw3x3.toString());
        System.out.println(ff91.toString());
    }
}

