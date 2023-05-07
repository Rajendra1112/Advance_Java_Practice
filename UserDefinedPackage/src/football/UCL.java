package football;

public class UCL {
    void semiFinal(){
        System.out.println("Four European Teams");
    }
}
class Laliga{
    int laligaTeam=18;
    void show(){
        System.out.println("no of teams in laliga: "+laligaTeam);
    }
}
class Test{
    public static void main(String[] args){
        UCL u1=new UCL();
        u1.semiFinal();
        Laliga l1=new Laliga();
        l1.show();
    }
}

