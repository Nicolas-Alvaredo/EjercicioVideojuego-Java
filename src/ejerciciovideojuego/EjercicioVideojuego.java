package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioVideojuego {
    
    public static void main (String[] args){
        
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();
        
        VideoJuego video1 = new VideoJuego (123, "Banjo Kazooie","Nintendo 64", 4, "Plataforma");
        VideoJuego video2 = new VideoJuego (456, "Mario Party 3","Nintendo 64", 4, "Plataforma");
        VideoJuego video3 = new VideoJuego (789, "Age of Empires II","PC", 1, "Estrategia");
        VideoJuego video4 = new VideoJuego (101, "Counter Strike 1.6","PC", 1, "Shooter");
        VideoJuego video5 = new VideoJuego (100, "Mario Kart 64","Nintendo 64", 2, "Plataforma");
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        //Recorrido
        System.out.println("----------------------Recorrido----------------------------");
        for (VideoJuego video: listaVideojuegos){
            System.out.println("Titulo: " + video.getTitulo() + " Consola: " + video.getConsola() + " Cant Jugadores: " + video.getCantJugadores());
        }
        
        //Cambio de nombre y jugadores
        System.out.println("----------------------Cambio de nombre y jugadores----------------------------");
        video1.setTitulo("Banjo Kazooie II");
        video1.setCantJugadores(1);
        System.out.println(video1.toString());
        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);
        System.out.println(video5.toString());
        
        //Recorrer arraylist y mostrar solo juegos de Nintendo 64
        System.out.println("---------------------Recorrer arraylist y mostrar solo juegos de Nintendo 64---------------------------");
        for (VideoJuego video: listaVideojuegos){
            if (video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
                
        }
        
        
    }
    
}
