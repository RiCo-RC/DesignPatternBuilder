import java.util.ArrayList;

public class Vehicle {

    private String name = "";
    private boolean isAutomatic = false;
    private boolean drive = false;
    private ArrayList<String> options = new ArrayList<String>();

    private Vehicle(BuilderVehicle builder) {
        this.name = builder.name;
        this.drive = builder.drive;
        this.options = builder.options;
    }

    @Override
    public String toString() {
        String result = "";

        result += "--------------------" + "\n";
        result += "Name: " + this.name + "\n";
        for (String option : this.options) {
            result += option  + ", ";
        }
        result += "\n" + "--------------------" + "\n";
        return result;
    }

    public static class BuilderVehicle {

        private String name = "";
        private boolean isAutomatic = false;
        private boolean drive = false;
        private ArrayList<String> options = new ArrayList<String>();

        public BuilderVehicle(String name) {
            this.name = name;
        }

        public BuilderVehicle isAutomatic(boolean value) {
            this.isAutomatic = value;
            return this;
        }

        public BuilderVehicle addOption(Enum item) {
            switch(item) {
                case EBuilderVehicle.SEAT_FIVE:
                    this.options.add("Five seats");
                    break;
                case EBuilderVehicle.DOOR_FIVE:
                    this.options.add("Five door");
                    break;
                case EBuilderVehicle.ROOF_OPEN:
                    this.options.add("Roof is open");
                    break;
                default:
                    break;
            }
            return this;
        }

        public BuilderVehicle drive() {
            this.drive = true;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}


