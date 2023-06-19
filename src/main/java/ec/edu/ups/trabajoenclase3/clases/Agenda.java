/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajoenclase3.clases;

import java.util.LinkedList;

/**
 *
 * @author JUAN ALVAREZ
 */
public class Agenda<T, U> {

    private LinkedList<Contacto<T, U>> contactos;

    public Agenda() {
        contactos = new LinkedList<>();
    }

    public void addContact(Contacto<T, U> contacto) {
        contactos.add(contacto);
    }

    public Contacto<T, U> searchContacto(T nombre) {
        for (Contacto<T, U> contacto : contactos) {
            if (contacto.getName().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public void removeContact(T nombre) {
        Contacto<T, U> contact = searchContacto(nombre);
        if (contactos != null) {
            contactos.remove(contact);

        }
    }

}
