package ctch;
//Try- with Resources
class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }
    
}


public class Tryca {

    public static void main(String[] args) {
        
        try(Temp temp = new Temp()) {
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }

}