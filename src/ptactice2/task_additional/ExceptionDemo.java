package ptactice2.task2;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = "+ a);
            int b = 42/a;
            int c[] = {1};
            c[42]= 99;

        }
        catch(ArithmeticException e){
            System.out.println("Деление на ноль "+ e);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива" + e);
        }
        catch (Throwable e){
            System.out.println("Ошибка "+ e);
        }
    }
}
