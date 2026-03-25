package ge.lmibsu.demo.dto;

public record TestPersonInfo(String firstName,String lastName,int age){
    public TestPersonInfo withAge(int age){
        return new TestPersonInfo(this.firstName,this.lastName,age);
    }
}