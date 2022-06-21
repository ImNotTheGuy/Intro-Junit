package course;

public class Methods {

    public boolean validEmail(String email){
        return email.length() > 8 && email.contains("@") && email.contains("&");
    }

    public int addition(int a, int b){
        return a + b;
    }
}
