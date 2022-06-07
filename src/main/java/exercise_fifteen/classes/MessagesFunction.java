package exercise_fifteen.classes;


import org.jboss.logging.Logger;

/**
 * Clase MessagesFunction
 * Esta clase permite mostrar los mensajes que son invocados por métodos para mostrar información al usuario
 *
 * Autor
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class MessagesFunction {

    /**
     * Se crea una instancia de la clase logger, la cual permite mostrar mensajes en pantalla
     */
    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    /**
     * Método getIntance
     * Crea una instancia de la clase MessageFunction
     * @return una instancia de la clase
     */
    public static MessagesFunction getInstance(){return new MessagesFunction();}

    /**
     * Método showWelcome()
     * Permite mostrar un mensaje de bienvenida
     */
    public void showWelcome(){logger.info("Bienvenido al Ejercicio 15 con POO");}

    /**
     * Método showHeader()
     * Permite Mostrar mensaje en pantalla
     */
    public void showHeader(){
        logger.info("******GESTIÓN CINEMATOGRÁFICA *************** ");
    }

    /**
     * Método showMenu()
     * Permite Mostrar mensaje de Menú en pantalla
     */
    public void showMenu(){logger.info("\n1-NUEVO ACTOR \n2-BUSCAR ACTOR \n3-ELIMINAR ACTOR \n4-MODIFICAR ACTOR \n" +
            "5-VER TODOS LOS ACTORES \n6-VER PELICULA DE LOS ACTORES \n" +
            "7-VER CATEGORI DE LAS PELICULAS DE LOS ACTORES \n8-SALIR");}


    /**
     * Método newActor()
     * Permite Mostrar mensaje en pantalla
     */
    public void newActor(){
        logger.info("NUEVO ACTOR");
    }

    /**
     * Método searchActor()
     * Permite Mostrar mensaje en pantalla
     */
    public void searchActor(){
        logger.info("BUSCAR ACTOR");
    }

    /**
     * Método deleteActor()
     * Permite Mostrar mensaje  en pantalla
     */
    public void deleteActor(){
        logger.info("ELIMINAR ACTOR ");
    }

    /**
     * Método modifyActor()
     * Permite Mostrar mensaje en pantalla
     */
    public void modifyActor(){
        logger.info("MODIFICAR ACTOR ");
    }

    /**
     * Método viewAllActors()
     * Permite Mostrar mensaje en pantalla
     */
    public void viewAllActors(){
        logger.info("VER TODOS LOS ACTORES ");
    }

    /**
     * Método viewMoviesActor()
     * Permite Mostrar mensaje en pantalla
     */
    public void viewMoviesActor(){
        logger.info("VER PELICULAS DE LOS ACTORES ");
    }

    /**
     * Método viewMovieCategories()
     * Permite Mostrar mensaje en pantalla
     */
    public void viewMovieCategories(){
        logger.info("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORERS ");
    }

    /**
     * Método shoeExit()
     * Permite Mostrar mensaje en pantalla
     */
    public void shoeExit(){
        logger.info("GRACIAS POR UTILIZAR NUESTRO SISTEMA - HASTA PRONTO!!! ");
    }

    /**
     * Método showOptionIncorrect()
     * Permite Mostrar mensaje en pantalla
     */
    public void showOptionIncorrect(){
        logger.info("OPCION INCORRECTA ");
    }


}
