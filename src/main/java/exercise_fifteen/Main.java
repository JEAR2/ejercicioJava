package exercise_fifteen;

import exercise_fifteen.classes.MessagesFunction;
import exercise_fifteen.classes.ScannerExerciseFifteen;


/**
 * Clase Main
 * Está clase permite la interacción del sistema con el usuario
 * es la encargada de relizar los llamados a los métodos elegidos par el usuario
 *
 * Autor:
 * John Edward Acevedo Rojas -- jhedacro@gmail.com
 *
 * Versión: v1-04/06/22
 */
public class Main {
    /**
     * Crea una instancia de la clase ScannerExerciseFifteen
     */
    static ScannerExerciseFifteen scannerExerciseFifteen  = ScannerExerciseFifteen.getInstance();

    /**
     * Crea una instancia de la clase MessageFunction
     */
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Método init()
     * Método inicial - Permite la interacción del sistema con el usuario
     */
    public static void init(){
        messagesFunction.showWelcome();
        int op;
        do {
            messagesFunction.showHeader();
            messagesFunction.showMenu();
            op=scannerExerciseFifteen.getInteger();
            switch (op){
                case 1:
                    messagesFunction.newActor();
                    break;
                case 2:
                    messagesFunction.searchActor();
                    break;
                case 3:
                    messagesFunction.deleteActor();
                    break;
                case 4:
                    messagesFunction.modifyActor();
                    break;
                case 5:
                    messagesFunction.viewAllActors();
                    break;
                case 6:
                    messagesFunction.viewMoviesActor();
                    break;
                case 7:
                    messagesFunction.viewMovieCategories();
                    break;
                case 8:
                    messagesFunction.shoeExit();
                    break;
                default:
                    messagesFunction.showOptionIncorrect();
                    break;

            }
        }while(op!=8);

    }
}
