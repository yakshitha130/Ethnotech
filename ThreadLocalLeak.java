public class ThreadLocalLeak {
    private static final ThreadLocal<List<byte[]>> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                threadLocal.set(new ArrayList<>());
                for (int j = 0; j < 10000; j++) {
                    threadLocal.get().add(new byte[1024 * 1024]);                
                }
              
            }).start();
        }
    }
}
