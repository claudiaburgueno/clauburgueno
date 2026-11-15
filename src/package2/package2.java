package package2;

import java.util.Map;

public class package2 {
	
	private int num;
	private String nombre;
	private int precio;
	private Map<String, Integer>  asociacion; 
	
	public package2(int num,String nombre) {
		this.num=num;
		this.nombre=nombre;
		this.asociacion=new HashMap<String,Integer>();
	}
	
 public String getNombre() {
	 return this.nombre;
 }
 
 public int getNum ( int num) {
	 return this.num;
 }
 
 public void setNombre (String nombre) {
	 this.nombre=nombre;
 }
 public void setNum(int num) {
	 this.num=num;
	 
 }
 
 public double getPrecio() {
	 return this.precio;
 }
 
 public void añade (String nombre,int precio) {
	 asociacion.put(nombre, precio);
 }
 
}
