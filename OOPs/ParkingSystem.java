public class ParkingSystem {

    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(big > 0){
                big--;
                return true;
            }
        } else if(carType == 2){
            if(medium > 0){
                medium--;
                return true;
            }
        } else {
            if(small > 0){
                small--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Create parking system with 1 big, 1 medium, 0 small slots
        ParkingSystem ps = new ParkingSystem(1, 1, 0);

        System.out.println(ps.addCar(1)); // true (big slot used)
        System.out.println(ps.addCar(2)); // true (medium slot used)
        System.out.println(ps.addCar(3)); // false (no small slot)
        System.out.println(ps.addCar(1)); // false (big full)
    }
}