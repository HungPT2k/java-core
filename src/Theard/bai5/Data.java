package Theard.bai5;

public class Data {
    private boolean running;
    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void Color(String color)
    {
        switch (color){
            case "red":
                System.out.println("\033[31m RED");
                break;
            case "black":
                System.out.println("\033[0m BLACK");
                break;
            case "green":
                System.out.println("\033[32m GREEN");
                break;
            case "yellow":
                System.out.println("\033[33m YELLOW");
                break;
            case "blue":
                 System.out.println("\033[34m BLUE");
                    break;
            case "magenta":
                System.out.println("\033[35m MAGENTA");
                break;
            case "cyan":
                System.out.println("\033[36m CYAN");
                break;
            case "white":
                System.out.println("\033[37m WHITE");
                break;
            default:
                System.out.println("Màu không hợp lệ");

        }
    }

}
