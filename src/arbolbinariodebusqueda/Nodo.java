/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariodebusqueda;

/**
 *
 * @author Santiago
 */
public class Nodo {
  protected Object dato;
  protected Nodo izquierdo;
  protected Nodo derecho;

  public Nodo(Object dato) {
    this.dato = dato;
    this.izquierdo = null;
    this.derecho = null;
  }

  public Nodo(Nodo izdo, Object dato, Nodo dcho) {
        this.dato = dato;
        this.derecho = dcho;
        this.izquierdo = izdo;
  }

  public Object getDato() {
    return dato;
  }

  public Nodo getIzquierdo() {
    return izquierdo;
  }

  public Nodo getDerecho() {
    return derecho;
  }

  public void setDato(Object dato) {
    this.dato = dato;
  }

  public void setIzquierdo(Nodo dato) {
    this.izquierdo = dato;
  }

  public void setDerecho(Nodo dato) {
    this.derecho = dato;
  }

  //Este método necesita un nombre mejor
  void visitar() {
    System.out.print(dato + " ");
  }
}
