public class Store {
    public static void main(String[] args) {
        // Constantes para los precios y cantidades de productos, y el numero de buenas ventas
        final int PRIMER_PRECIO = 15;
        final int SEGUNDO_PRECIO = 10;
        final int TERCER_PRECIO = 5;
        final int CANTIDAD_PRODUCTO_1 = 2;
        final int CANTIDAD_PRODUCTO_2 = 3;
        final int CANTIDAD_PRODUCTO_3 = 4;
        final int BUENAS_VENTAS = 50;
        // Arrays para almacenar los precios y cantidades de los productos
        int[] precios= {PRIMER_PRECIO,SEGUNDO_PRECIO,TERCER_PRECIO};
        int[] cantidades= {CANTIDAD_PRODUCTO_1,CANTIDAD_PRODUCTO_2,CANTIDAD_PRODUCTO_3};
        int totalVentas=0;
        // Calcular el total de ventas
        for(int i=0; i<precios.length; i++){
            totalVentas += precios[i]*cantidades[i];
        }
        // Imprimir el desempeño de ventas dependiendo valore de la constatnte BUENAS_VENTAS
        if (totalVentas > BUENAS_VENTAS) {
            System.out.println("BUEN DESEMPEÑO DE VENTAS");
        } else {
            System.out.println("MAL DESEMPEÑO DE VENTAS");
        }
    }
}
