package com.mycompany.app.projectMavenAlumnos;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
       Alumno ulises = new Alumno("ulises");
       Alumno karen = new Alumno("karen");
       Alumno monica = new Alumno("monica");
       Alumno jl= new Alumno("jl");
       
       ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
       listaAlumnos.add(ulises);
       listaAlumnos.add(karen);
       listaAlumnos.add(jl);
       listaAlumnos.add(monica);
       
    
       Mascota mascotaulises = new Mascota ("gato");
       Mascota mascotaDeKaren = new Mascota ("dragòn");
       Mascota mascotaDeMonica = new Mascota ("perro");
       Mascota mascotaDeJL = new Mascota ("xoloscuincle");
       
       ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
       listaMascotas.add(mascotaulises);
       listaMascotas.add(mascotaDeKaren);
       listaMascotas.add(mascotaDeMonica);
       listaMascotas.add(mascotaDeJL);
       
       for (int i=0; i< listaAlumnos.size(); i++) {
    	   
    	   System.out.println(listaAlumnos.get(i).getNombre() + ": " + listaMascotas.get(i).getNombre() );
       }
       
    }
}
