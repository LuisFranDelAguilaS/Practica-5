public class Pajaro {



    private String color;
    private String tamaño;
    private String habilidad;
    private String nombre;




    public Pajaro(String color, String tamaño, String habilidad, String nombre ){

       setColor(color);
       setTamaño(tamaño);
       setHabilidad(habilidad);
       setNombre(nombre);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    //Metodo

    public void Lanzarse(){
        System.out. println(nombre+" Se lanza de la resortera y ");
    }

}


