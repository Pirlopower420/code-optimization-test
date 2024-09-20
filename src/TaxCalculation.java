public class TaxCalculation {
    public static void main(String[] args) {
    // Constantes para tasas de impuestos y umbral
    final double TAX_RATE_HIGH = 0.15; // Tasa de impuesto alta
    final double TAX_RATE_LOW = 0.10;  // Tasa de impuesto baja
    final double TAX_THRESHOLD = 50.0; // Umbral para determinar alto o bajo impuesto


        // Arrays para almacenar los precios de los productos y las tasas de impuestos correspondientes
        double[] precios = {100, 200};
        double[] tasasImpuesto = {TAX_RATE_HIGH, TAX_RATE_LOW};
        
        double totalImpuesto = 0.0;

        // Calcular el total de impuestos sumando el impuesto de cada producto
        for (int i = 0; i < precios.length; i++) {
            totalImpuesto += precios[i] * tasasImpuesto[i];
        }

        // Mostrar si el total de impuestos es alto o bajo en función del umbral
        if (totalImpuesto > TAX_THRESHOLD) {
            System.out.println("Impuesto total alto: " + totalImpuesto);
        } else {
            System.out.println("Impuesto bajo: "+ totalImpuesto);
        }
    }
}

