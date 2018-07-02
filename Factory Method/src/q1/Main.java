
package q1;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Client c1 = new Client();
        Shape s = c1.getShape();
        s.draw();
    }
    
}
