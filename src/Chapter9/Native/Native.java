package Chapter9.Native;

public class Native {

    private String nativeId;
    private String firstname;
    private String lastname;
    private String surname;
    private  static  String cheif = "Sam Immanuel";

    public static String getCheif() {
        return cheif;
    }

    public static void setCheif(String cheif) {
        Native.cheif = cheif;
    }

    public Native() {}

    public Native(String firstname){
        this.firstname = firstname;
    }
    public Native(String firstname, String lastname){
        this.lastname = lastname;
        this.firstname = firstname;
    }
    public Native(String firstname, String lastname, String nativeId){
        this.firstname = firstname;
        this.lastname = lastname;
        this.nativeId = nativeId;
    }

    public String getNativeId() {
        return nativeId;
    }

    public void setNativeId(String nativeId) {
        this.nativeId = nativeId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int countNative(){
        return 1;
    }
//    public  int countNatives(String cohortName, String hostel){
//        int count = 0;
//        if (cohortName.equals("paragons "));
//    }
}
