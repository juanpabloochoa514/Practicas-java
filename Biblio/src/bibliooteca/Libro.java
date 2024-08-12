package bibliooteca;

import java.util.Objects;

public class Libro {
 private String nombre;
 private String categoria;
 private Boolean disponible;
 private String fecha;
 
 public Libro(String nombre, String categoria) {
	 this.categoria=categoria;
	 this.nombre=nombre;
	 this.disponible=true;
 }
 

public void setDisponible(Boolean disponible) {
	this.disponible = disponible;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
 
 public Boolean estoyDisponible() {
	 return this.disponible;
 }

@Override
public int hashCode() {
	return Objects.hash(categoria, disponible, fecha, nombre);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Libro other = (Libro) obj;
	return  Objects.equals(nombre, other.nombre);
}


@Override
public String toString() {
	return "Libro [nombre=" + nombre + ", categoria=" + categoria + "]";
}


 
 
 
}
