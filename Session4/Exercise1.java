public class Exercise1 {

    int[] array_values3 = { 1, 2, 3, 4, 5 };

    public int sumaArrayNumeros() {
        int result = 0;
        
        for (int i = 0; i < array_values3.length; i++) {
            System.out.println("Valor: " + array_values3[i]);
            result += array_values3[i];
        }
        return result;
    }
}