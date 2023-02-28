class User {
    User(String nombre, String pass) {
    }
 
    String nombre;
    String email;
    String password;
 }

 class Validator{

    boolean valid(String valor){
        return valor != null && valor.length() > 0;
    }

 }
 
 public class UserCreator {
    boolean valid(String valor) {
        if (valor != null && valor.length() > 0)
            return true;
        else
            return false;
    }
 
    User create(String email, String pass) throws Exception {
        if (!valid(email))  throw new Exception("Email incorrecto");
         if(!valid(pass))throw new Exception("Password incorrecto");
           
            // System.out.println("Email incorrecto");
            // return null;
        
            
            // System.out.println("Password incorrecto");
            // return null;
        

        return new User(email, pass);
        
        
        // else {
        //     if (valid(pass)) {
        //         return new User(email, pass);
        //     } else {
        //         System.out.println("Password incorrecto");
        //     }
        // }
        // return null;
    }
 }
 