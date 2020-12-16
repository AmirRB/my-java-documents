package step3;

public interface CustomConsumer<R,I1,I2> {
    R accept(I1 i1, I2 i2);
}
