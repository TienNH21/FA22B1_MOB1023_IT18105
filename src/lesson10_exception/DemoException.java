package lesson10_exception;

public class DemoException {
    public static void main(String[] args) {
        String[] a = { "2", "9", "13", 
            "123a", "9", null };

        for (int i = 0; i < 10; i++) {
            try {
                int j = Integer.parseInt(a[i]);
                System.out.println(j);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch(Exception e) {
                e.printStackTrace();
            } finally {
                //
            }
        }

        System.out.println("Kết thúc");
    }
}
