package exercise_fiveteen;

import exercise_fiveteen.classes.MessagesFunction;
import exercise_fiveteen.classes.ScannerExerciseFiveteen;


public class Main {
    static ScannerExerciseFiveteen scannerExerciseFiveteen  = ScannerExerciseFiveteen.getInstance();
    static MessagesFunction messagesFunction = MessagesFunction.getInstance();

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        messagesFunction.showWelcome();
        int op;
        do {
            messagesFunction.showHeader();
            messagesFunction.showMenu();
            op=scannerExerciseFiveteen.getInteger();
            switch (op){
                case 1:
                    messagesFunction.NewActor();
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
