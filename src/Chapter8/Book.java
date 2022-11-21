package Chapter8;

public enum Book {
    // declare constants of enum type
    JHTP("Java How to Program", "2018"),
    CHTP("C How to Program", "2016"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2017"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2017");

    // declare instance variables
    private String title;
    private String copyright;

    // declare constructor but without access modifier
    Book (String title, String copyright) {
        this.title = title;
        this.copyright = copyright;
    }

    public String getTitle(){
        return title;
    }

    public String getCopyright() {
        return copyright;
    }
}

