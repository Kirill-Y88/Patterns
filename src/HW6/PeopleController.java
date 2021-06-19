package HW6;

public class PeopleController {

    SqlClient sqlClient;
    People people;

    public PeopleController(SqlClient sqlClient) {
        this.sqlClient = sqlClient;
    }

    public String getNamePeopleById (int id){
        people = sqlClient.findById(id);
        return people.getName();
    }

    public int getAgePeopleById (int id){
        people = sqlClient.findById(id);
        return people.getAge();
    }

}
