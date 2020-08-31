package enums;

public enum Page {
    MAIN("http//mainpage"),
    LOOGIN("http//login"){
        @Override
        public String getUrl(){
            return "this url - " + url;
        }
    },
    SIGNUP("http//signup"),
    ABOUT_US("http//aboutus");

    protected String url;

    Page(String url){
        this.url = url;
    }

    public String getUrl(){
         return url;
    }

    public static void printName(Page page){
        System.out.println(page.name());
    }
}
