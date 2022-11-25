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
    public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        String title1=dvd1.getTitle();
        String category1 = dvd1.getCategory();
        String director1 = dvd1.getDirector();
        int length1=dvd1.getLength();
        float cost1 = dvd1.getCost();
        String title2=dvd2.getTitle();
        String category2 = dvd2.getCategory();
        String director2 = dvd2.getDirector();
        int length2=dvd2.getLength();
        float cost2 = dvd2.getCost();

        dvd1= new DigitalVideoDisc(title2,category2,director2,length2,cost2);
        dvd2= new DigitalVideoDisc(title1,category1,director1,length1,cost1);

    }
}