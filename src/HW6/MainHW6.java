package HW6;

public class MainHW6 {

    public static void main(String[] args) {

        CashPeople cashPeople = new CashPeople();
        SqlClient sqlClient = new SqlClient(cashPeople);
        PeopleController peopleController= new PeopleController(sqlClient);

        System.out.println(peopleController.getNamePeopleById(2));

    }


}
