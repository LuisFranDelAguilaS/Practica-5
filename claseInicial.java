public class claseInicial {

    public static void main(String[] args) {

        Bomb arrePajaros[] = new Bomb[1];
        Matilda arrePajaros2[] = new Matilda[1];
        Chuck arrePajaros3[] = new Chuck[1];

        for (int i = 0; i < arrePajaros.length; i++) {
            arrePajaros[i] = new Bomb("Negro", "Es de tamaño grande", "Tiene la habilidad de explotar", CapturaEntrada.capturarCadena("Ponle un nombre pajaro 1 "));
        }
        for (int i = 0; i < arrePajaros2.length; i++) {
            arrePajaros2[i] = new Matilda("Blanco", "Es de tamaño grande", "Tiene de lanzar un huevo", CapturaEntrada.capturarCadena("Ponle un nombre pajaro 2"));
        }
        for (int i = 0; i < arrePajaros3.length; i++) {
            arrePajaros3[i] = new Chuck("Amarillo", "Es de tamaño pequeño", "Tiene la habilidad de ir muy rapido", CapturaEntrada.capturarCadena("Ponle un nombre pajaro 3"));
        }

        System.out.println("El pajaro con nombre " + arrePajaros[0].getNombre() + " es de color " + arrePajaros[0].getColor() + " " + arrePajaros[0].getTamaño() + " " + arrePajaros[0].getHabilidad() + " Esta luchando con los cerdes verdes y  " );
        arrePajaros[0].Lanzarse();
        arrePajaros[0].Explotar();
        System.out.println("El pajaro con nombre " + arrePajaros2[0].getNombre() + " es de color " + arrePajaros2[0].getColor() + " " + arrePajaros2[0].getTamaño() + " " + arrePajaros2[0].getHabilidad() + " Esta luchando con los cerdes verdes y  " );
        arrePajaros2[0].Lanzarse();
        arrePajaros2[0].Huevo();
        System.out.println("El pajaro con nombre " + arrePajaros3[0].getNombre() + " es de color " + arrePajaros3[0].getColor() + " " + arrePajaros3[0].getTamaño() + " " + arrePajaros3[0].getHabilidad() + " Esta luchando con los cerdes verdes y  " );
        arrePajaros3[0].Lanzarse();
        arrePajaros3[0].AtaqueVeloz();

    }


}

