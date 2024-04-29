package midterm.tatia_iosebashvili_1.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName;




    public String toString() {
            String result = "";

            // TODO must be implemented
            result += "Bike: " + getBike() + "\n";
            result += "Moto: " + getMoto() + "\n";
            result += "Car: " + methodCar("argcar1") + "\n";
            result += "Scooter: " + String.join(" ", methodCar("someArg")) + "\n";

            return result;
        }

        @Override
        public String getBike() {
            return "Bike";
        }

        @Override
        public String getMoto() {
            return "Moto";
        }

        @Override
        public String methodScooter(String argScooter) {
            return "Car";
        }

        @Override
        public List<String> methodCar(String argCar1) {
            return List.of("car", "bike", "moto");
        }
}
