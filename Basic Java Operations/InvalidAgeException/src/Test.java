public class Test {
    public void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age is not valid and you cannot vote\n");
        }else{
            System.out.println("Welcome! you can vote!");
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        try{
            t.validateAge(21);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}