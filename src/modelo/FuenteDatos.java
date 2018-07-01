/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author deniz
 */
public class FuenteDatos {
    public static ArrayList<Persona> bdPersona = new ArrayList<>();
    public static ArrayList<Agenda> bdAgenda = new ArrayList<>();

    public static ArrayList<Persona> getBdPersona() {
        return bdPersona;
    }

    public static void setBdPersona(ArrayList<Persona> bdPersona) {
        FuenteDatos.bdPersona = bdPersona;
    }

    public static ArrayList<Agenda> getBdAgenda() {
        return bdAgenda;
    }

    public static void setBdAgenda(ArrayList<Agenda> bdAgenda) {
        FuenteDatos.bdAgenda = bdAgenda;
    }
    
    public  void agregarPersona(){
        Persona p1=new Persona();
        Persona p2=new Persona();
        Persona p3=new Persona();
        p1.setNombre("denis");
        p1.setApellido("zamora");
        p1.setEdad(25);
        p1.setId_persona(1);
        p1.setNick("alex");
        p1.setFechaNacimiento("18 de mayo de 1992");
        p1.setDeporteFavorito("futbol");
        p2.setNombre("erika");
        p2.setApellido("zamora");
        p2.setEdad(23);
        p2.setId_persona(2);
        p2.setNick("pollito");
        p2.setFechaNacimiento("26 de marzo de 1994");
        p2.setDeporteFavorito("futbol");
        p3.setNombre("henry");
        p3.setApellido("zamora");
        p3.setEdad(27);
        p3.setId_persona(3);
        p3.setNick("monchy");
        p3.setFechaNacimiento("7 de septiembre de 1990");
        p3.setDeporteFavorito("futbol");
        bdPersona.add(p1);
        bdPersona.add(p1);
        bdPersona.add(p3);
    }
    public void agregarAgenda(){
        Agenda a1=new Agenda();
        Agenda a2=new Agenda();
        Agenda a3=new Agenda();
        a1.setId_agenda(1);
        a1.setId_persona(1);
        a1.setCorreo("denizamora7@gmail.com");
        a1.setCiudad("limon");
        a1.setPais("ecuador");
        a1.setDireccion("calle 28 de mayo");
        a1.setTelefono(123);
        a1.setTelefonoFamiliar(321);
        a2.setId_agenda(2);
        a2.setId_persona(2);
        a2.setCorreo("erika@gmail.com");
        a2.setCiudad("limon");
        a2.setPais("ecuador");
        a2.setDireccion("calle 28 de mayo");
        a2.setTelefono(456);
        a2.setTelefonoFamiliar(321);
        a3.setId_agenda(3);
        a3.setId_persona(3);
        a3.setCorreo("monchy@gmail.com");
        a3.setCiudad("cuenca");
        a3.setPais("ecuador");
        a3.setDireccion("av. don bosco");
        a3.setTelefono(456);
        a3.setTelefonoFamiliar(654);
        bdAgenda.add(a1);
        bdAgenda.add(a2);
        bdAgenda.add(a3);
        
    }
    
    public  int obtenerDatos(String nombre){
        int buscar=0;
        for (Persona obtener : bdPersona) {
            if (obtener.getNombre().equalsIgnoreCase(nombre)) {
                buscar=obtener.getId_persona();
            }
        }
        return buscar;
    }
    
    public void mostrar(){
        FuenteDatos f = new FuenteDatos();
        int buscar = obtenerDatos("denis");
        for (Agenda a : bdAgenda) {
            if (buscar==a.getId_agenda()) {
                f.agregarAgenda();
//                System.out.println(a.getCorreo());
//                System.out.println(a.getDireccion());
//                System.out.println(a.getPais());
//                System.out.println(a.getTelefonoFamiliar());
            }
        }
    }
}
