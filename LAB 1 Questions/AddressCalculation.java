public class AddressCalculation {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int baseAddress = 1000;     
        int elementSize = 4;  

        int index = 3; 

        // Address formula: address = base + (index * elementSize)
        int calculatedAddress = baseAddress + (index * elementSize);

        System.out.println("Element at index " + index + " = " + numbers[index]);
        System.out.println("Calculated address = " + calculatedAddress);
    }
}
