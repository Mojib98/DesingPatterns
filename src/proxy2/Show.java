package proxy2;

public class Show implements Access{
   private String name;

    public Show(String name) {
        this.name = name;
    }

    @Override
    public void getAccess() {
        if (getRoll()){
            Access access = new Login(this.name);
            access.getAccess();
        }else
            System.out.println("\tcant accesee: " + name);
    }
    private Boolean getRoll(){
        if (this.name.equals("mojib"))
            return true;
        else return false;
//        this.name.equals("mojib") ? return true: return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
