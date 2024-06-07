package adapter;

public class AdapterImpl implements Adapter {
    @Override
    public Float twiceOf(final Float f) {
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(final Float f) {
        System.out.println("절반 함수 호출");
        return (float) Math.half(f.doubleValue());
    }
}
