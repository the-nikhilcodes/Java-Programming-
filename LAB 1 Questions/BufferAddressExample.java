import java.nio.ByteBuffer;

public class BufferAddressExample {
    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(16); // 16 bytes

        // Put 4 integers (4 bytes each)
        buffer.putInt(0, 10);
        buffer.putInt(4, 20);
        buffer.putInt(8, 30);
        buffer.putInt(12, 40);

        int index = 2;
        int elementSize = 4;
        int offset = index * elementSize;

        int value = buffer.getInt(offset);

        System.out.println("Calculated offset: " + offset);
        System.out.println("Value at offset: " + value);
    }
}
