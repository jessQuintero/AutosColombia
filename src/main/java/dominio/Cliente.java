
package dominio;


public class Cliente {
    
 private int id;
  private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(int id, int cedula, String nombre, String apellido, String direccion, String telefono) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

     public Cliente(int cedula,String nombre, String apellido, String direccion, String telefono) {
      
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }
     
         
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
      @Override
    public String toString(){
        return "\nClientes {"+ "id= "+id+", cedula= "+cedula+", nombre="+nombre+", apellido= "+apellido+", direccion= "+direccion+"telefono= "+telefono+"}";
        
        
    }


   
}
