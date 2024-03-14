 enum Status  {

    RUNNING, FAIL, PENDING, SUCCESS;
    
}

class demo{
    public static void main(String[] args) {
        Status[] s = Status.values();
        for(Status ss: s){
            System.out.println(ss +":"+ ss.ordinal());
        }
    }
}
