import sun.misc.Unsafe;
import java.lang.reflect.Field;

public class MindBendingJava<T extends MindBendingJava<T>> {
    private static final Unsafe UNSAFE = getUnsafe();
    private int secret = 42;

    @SuppressWarnings("unchecked")
    public T injectSecret(int value) {
        this.secret = value;
        return (T) this;
    }

    public enum Singleton {
        INSTANCE;
        private final MindBendingJava<?> instance = new MindBendingJava<>();
        
        public MindBendingJava<?> get() { 
            System.out.println("Secret: " + instance.secret);
            return instance;
        }
    }

    public void breakJava() throws Exception {
        long offset = UNSAFE.objectFieldOffset(
            MindBendingJava.class.getDeclaredField("secret")
        );
        UNSAFE.putInt(this, offset, 999);
        System.out.println("Corrupted secret: " + secret);
    }

    private static Unsafe getUnsafe() {
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            return (Unsafe) f.get(null);
        } catch (Exception e) { throw new RuntimeException(e); }
    }

    public static void main(String[] args) throws Exception {
        new MindBendingJava<>()
            .injectSecret(123)
            .breakJava();

        Singleton.INSTANCE.get()
            .injectSecret(456)
            .breakJava();

        MindBendingJava<?> hacked = (MindBendingJava<?>) 
            UNSAFE.allocateInstance(MindBendingJava.class);
        System.out.println("Unconstructed secret: " + hacked.secret);
    }
}
