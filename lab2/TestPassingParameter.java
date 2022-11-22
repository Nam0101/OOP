public class TestPassingParameter{
    public static void main(String[] args){
        DigitalVideoDisc jungLeDVD= new DigitalVideoDis("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungLeDVD,cinderellaDVD);
        System.out.println("jungle dvd title: "+jungLeDVD.getTitle());
        System.out.println("Cinderella dvd title: "+cinderellaDVD.getTitle());

        changeTitle(jungLeDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+jungLeDVD.getTitle());
    }
    public static void swap(Object o1,Object o2){
        Object tmp=o1;
        o1=o2;
        o2=tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd,String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd  = new DigitalVideoDis(oldTitle);
    }
}