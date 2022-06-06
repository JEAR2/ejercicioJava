package exercise_fiveteen.classes;


import org.jboss.logging.Logger;

public class MessagesFunction {

    private static final Logger logger = Logger.getLogger(MessagesFunction.class);

    public static MessagesFunction getInstance(){return new MessagesFunction();}

    public void showWelcome(){logger.info("Bienvenido al Ejercicio 15 con POO");}

    public void getNumber(){
        logger.info("Ingrese un número: ");
    }

    public void showHeader(){
        logger.info("******GESTIÓN CINEMATOGRÁFICA *************** ");
    }

    public void showMenu(){logger.info("\n1-NUEVO ACTOR \n2-BUSCAR ACTOR \n3-ELIMINAR ACTOR \n4-MODIFICAR ACTOR \n" +
            "5-VER TODOS LOS ACTORES \n6-VER PELICULA DE LOS ACTORES \n" +
            "7-VER CATEGORI DE LAS PELICULAS DE LOS ACTORES \n8-SALIR");}

    public void NewActor(){
        logger.info("NUEVO ACTOR");
    }

    public void searchActor(){
        logger.info("BUSCAR ACTOR");
    }

    public void deleteActor(){
        logger.info("ELIMINAR ACTOR ");
    }

    public void modifyActor(){
        logger.info("MODIFICAR ACTOR ");
    }

    public void viewAllActors(){
        logger.info("VER TODOS LOS ACTORES ");
    }

    public void viewMoviesActor(){
        logger.info("VER PELICULAS DE LOS ACTORES ");
    }

    public void viewMovieCategories(){
        logger.info("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORERS ");
    }

    public void shoeExit(){
        logger.info("GRACIAS POR UTILIZAR NUESTRO SISTEMA - HASTA PRONTO!!! ");
    }

    public void showOptionIncorrect(){
        logger.info("OPCION INCORRECTA ");
    }


}
