public class Main
{
	public static void main(String[] args) {
		Person[] persArray = new Person[5];
        persArray[0] = new Person("ВИТЯ ИВАНОВ", "ЛОХ", "DFD@MAIL.RU",890101010101, 545845, 30); 
        persArray[1] = new Person("ПЕТЯ ПЕТРОВ", "ЖИВ", "PETYCOOL@MAIL.RU", 888888, 44545, 18);
        persArray[2] = new Person("ЖОРИК ПОРИК", "ЦЕЛ", "JORAPORA@MAIL.RU", 000000000, 17575, 45);
        persArray[3] = new Person("МАРГАРИТА АРМЯНКА", "ОРЕЛ", "RITA500R1CH@MAIL.RU", 89775674554, 12554, 41);
        persArray[4] = new Person("ИЛЬНАЗ ДА", "DEADEND", "PROTASHERGGGGGG@MGOTU.GG", 88005553535, 999999999999999999999999, 22);
        for (int i = 0; i < persArray.length; i++){
            persArray[i].age();
	}
}
}
class Person
{ String FIO;
    String ;
    String email;
    int phone;
    int salary;
    int age;
    public Person(String FIO, String position, String email, int phone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary =  salary;
        this.age = age;
    }
    
    public void print(){
        System.out.println (FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
    public void age(){
        if (age > 40){
            System.out.println (FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
        }
    }
    }
