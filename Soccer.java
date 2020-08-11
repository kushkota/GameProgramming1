import javax.swing.JEditorPane;

public class Soccer {


    public enum Color {
        // Rendering text via ANSI escape codes
        // Primary Colors
        ANSI_RED("\u001B[31m"), ANSI_GREEN("\u001B[32m"), ANSI_BLUE("\u001B[34m"),

        ANSI_YELLOW("\u001B[33m"), ANSI_BLACK("\u001B[30m"), ANSI_WHITE("\u001B[37m"), ANSI_PURPLE("\u001B[35m"),
        ANSI_CYAN("\u001B[36m"),

        // High Intensity
        BLACK_BRIGHT("\033[0;90m"),

        // Bold
        ANSI_BOLD("\u001B[1m"), ANSI_BLINK("\u001B[5m"), ANSI_WHITE_BOLD("\033[1;37m"),

        // Bold High Intensity
        ANSI_BLACK_BOLD_BRIGHT("\033[1;90m"), ANSI_GREEN_BOLD_BRIGHT("\033[1;92m"),

        // High Intensity backgrounds
        ANSI_GREEN_BACKGROUND_BRIGHT("\033[0;102m"), ANSI_BLUE_BACKGROUND_BRIGHT("\033[0;104m"),

        // Reset
        ANSI_RESET("\u001B[0m");

        private String value;

        private Color(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;

        }
    }

public static void main(String[] args) throws InterruptedException {

// System.out.println(Color.ANSI_PURPLE.getValue()+"Hello World"+Color.ANSI_RESET.getValue());

String run = 
"                      ___\n"+
" o           o__     |   |\\\n"+
"/|\\          /\\      |   |X\\\n"+
"/ \\  "+Color.ANSI_RED.getValue()+"o"+Color.ANSI_RESET.getValue()+"        /\\     |   |XX\\\n";

String soccer = 
"                      ___\n"+
"   \\o__      o__     |   |\\\n"+
" __/         /\\      |   |X\\\n"+
"    \\"+Color.ANSI_RED.getValue()+"o"+Color.ANSI_RESET.getValue()+"        /\\     |   |XX\\\n";

String shoot = 
"                      ___\n"+
"   o       o/        |   |\\\n"+
"  /|\\  "+Color.ANSI_RED.getValue()+"o"+Color.ANSI_RESET.getValue()+"   /\\        |   |X\\\n"+
"  / \\       <<       |   |XX\\\n";
  
String dive = 
"                      ___\n"+
"   o__       o__  "+Color.ANSI_RED.getValue()+"o"+Color.ANSI_RESET.getValue()+"  |   |\\\n"+
"  /|        /\\       |   |X\\\n"+
"  / >        <\\      |   |XX\\\n";

String goal = 
"                      ___\n"+
"  \\o/         o      | "+Color.ANSI_RED.getValue()+"o"+Color.ANSI_RESET.getValue()+" |\\\n"+
"   |         /\\\\     |   |X\\\n"+
"  / >         <\\     |   |XX\\\n";


while (true) {
// System.out.println(Color.ANSI_YELLOW.getValue() + "SHOOT" + Color.ANSI_RESET.getValue());
// Thread.sleep(1000);


System.out.println(run);
Thread.sleep(1000);
System.out.println(soccer);
Thread.sleep(1000);


System.out.println(shoot);
Thread.sleep(1000);


System.out.println(dive);
Thread.sleep(1000);

System.out.println(goal);
Thread.sleep(1000);


    }

}
}
